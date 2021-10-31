package cn.qsub.admin.service.impl;

import cn.qsub.admin.service.TokenService;
import cn.qsub.entity.Rootlogin;
import cn.qsub.mapper.RootloginMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 秋枫
 * @desc
 * @time 2021/10/22 18:10
 */
@Service
public class TokenServiceImpl implements TokenService {

    @Resource
    private RootloginMapper rootloginMapper;

    /**
     * 查询token
     * @param token
     * @return 实体类
     */
    public Rootlogin queryToken(String token) {
        QueryWrapper<Rootlogin> query = Wrappers.query();
        query.eq("token",token);
        return rootloginMapper.selectOne(query);
    }
}
