package cn.qsub.admin.service.impl;

import cn.qsub.admin.service.LoginService;
import cn.qsub.entity.Root;
import cn.qsub.entity.Rootlogin;
import cn.qsub.mapper.RootMapper;
import cn.qsub.mapper.RootloginMapper;
import cn.qsub.utils.TokenUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Wrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @desc 管理员用户登录
 */
@Service
public class LoginServiceImpl implements LoginService {


    @Resource
    private RootMapper rootMapper;
    @Resource
    private RootloginMapper rootloginMapper;



    /**
     * @desc 登录
     * @param username
     * @param password
     * @return  -1 用户名或者密码错误
     */
    @Override
    public Map login(String username, String password) {
        QueryWrapper<Root> query = Wrappers.query();
        query.eq("rootname",username);
        query.eq("rootpassword",password);
        Root root = rootMapper.selectOne(query);
        if (root!=null){
            String newToken = TokenUtils.getToken();
            QueryWrapper<Rootlogin> query1 = Wrappers.query();
            query1.eq("rootid",root.getRootid());
            Rootlogin rootlogin = rootloginMapper.selectOne(query1);
            rootlogin.setToken(newToken);
            rootlogin.setLogintime(System.currentTimeMillis()+"");
            rootloginMapper.updateById(rootlogin);
            Map<String, Object> dataP = new HashMap<>();
            dataP.put("token", newToken);
            dataP.put("managername", root.getRootname());
            dataP.put("manageravatar", root.getAvatar());
            return dataP;
        }else {
            return null;
        }
    }
}
