package cn.qsub.admin.service.impl;

import cn.hutool.crypto.digest.MD5;
import cn.hutool.db.sql.Wrapper;
import cn.qsub.admin.service.UserService;
import cn.qsub.entity.Blackname;
import cn.qsub.entity.Rootlogin;
import cn.qsub.entity.User;
import cn.qsub.mapper.BlacknameMapper;
import cn.qsub.mapper.UserMapper;
import cn.qsub.utils.TokenUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author 秋枫
 * @desc
 * @time 2021/10/22 15:50
 */
@Service
public class UserServiceImpl implements UserService {


    /**
     * @desc 登录验证
     */
    @Resource
    private TokenServiceImpl tokenServiceImpl;

    /**
     * @desc 用户表
     */
    @Resource
    private UserMapper userMapper;


    /**
     * @desc 黑名单
     */
    @Resource
    private BlacknameMapper blacknameMapper;

    /**
     * @desc  修改指定用户评论权限
     * @param token
     * @param userid 用户id
     * @param status 状态
     * @return
     * -1 参数异常
     * -2 非法请求
     * -3 无此用户
     * -4 参数错误
     */
    @Override
    public int changeComment(String token,String userid,String status) {
        if (StringUtils.hasText(token) || StringUtils.hasText(userid) || StringUtils.hasText(status)){
            //判断是否登录
            Rootlogin rootlogin = tokenServiceImpl.queryToken(token);
            if (rootlogin==null){ //未登录
                return -2;
            }
            User user = userMapper.selectById(userid);
            if (user!=null){
                if (status.equals("0")){
                    user.setUserzt(1);
                }else if (status.equals("1")){
                    user.setUserzt(0);
                }else {
                    return -4;
                }
                userMapper.updateById(user);
                return 0;
            }else {
                return -3;
            }
        }else {
            return -1;
        }
    }


    /**
     * @desc 修改用户密码
     * @return -1 未登录
     *  -2 用户不存在
     *  -3 密码为空
     *  -4 新密码不能与旧密码相同
     *  -5 修改失败
     *  0  修改成功
     */
    @Override
    public int changeKey(String token,String userid,String password){
        if (StringUtils.hasText(token)){
            if (StringUtils.hasText(userid)){
                if (StringUtils.hasText(password)){
                    //判断是否登录
                    Rootlogin rootlogin = tokenServiceImpl.queryToken(token);
                    if (rootlogin!=null){
                        User user = userMapper.selectById(userid);
                        if (user!=null){
                            String newToken = TokenUtils.StringToMd5(password);
                            if (newToken.equals(user.getPassword())){
                                return -4;
                            }else {
                                user.setPassword(newToken);
                                int i = userMapper.updateById(user);
                                if (i != 0){
                                    return 0;
                                }else {
                                    return -5;
                                }
                            }
                        }else {
                            return -2;
                        }
                    }else {
                        return -1;
                    }
                }else {
                    return -3;
                }
            }else {
                return -2;
            }
        }else {
            return -1;
        }
    }


    /**
     * @desc 修改指定用户登录权限
     * @return
     * 0 修改成功
     * -1 参数错误
     * -2 未登录
     * -3 重复修改
     * -4 修改失败
     */
    @Override
    public int changeLogin(String token,String userid,String status) {
        if (StringUtils.hasText(token) || StringUtils.hasText(userid) || StringUtils.hasText(status)){
            //判断是否登录
            Rootlogin rootlogin = tokenServiceImpl.queryToken(token);
            if (rootlogin==null){ //未登录
                return -2;
            }
            QueryWrapper<Blackname> query = Wrappers.query();
            Blackname blackname = blacknameMapper.selectOne(query);
            if (blackname != null){
                blackname.setDisplay(Integer.parseInt(status));
                int i = blacknameMapper.updateById(blackname);
                if (i == 0){
                    return -3;
                }else {
                    return 0;
                }
            }else {
                //不存在则创建新的
                if (status.equals("1")){
                    Blackname blackName1 = new Blackname();
                    blackName1.setBid(0);
                    blackName1.setDisplay(1);
                    blackName1.setUid(Integer.parseInt(userid));
                    blackName1.setTemp("");
                    blackName1.setCreatetime(System.currentTimeMillis()+"");
                    int insert = blacknameMapper.insert(blackName1);
                    if (insert==0){
                        return -4;
                    }else {
                        return 0;
                    }
                }else {
                    return -3;
                }
            }
        }else {
            return -1;
        }
    }

    /**
     * @desc 修改指定用户发帖权限
     * @return
     * -1 参数异常
     * -2 未登录
     * -3 用户不存在
     * -4 状态未知
     * -5 修改失败
     * 0  修改成功
     */
    @Override
    public int changePost(String token,String userid,String status) {
        if (StringUtils.hasText(token) || StringUtils.hasText(userid) || StringUtils.hasText(status)){
            //判断是否登录
            Rootlogin rootlogin = tokenServiceImpl.queryToken(token);
            if (rootlogin==null){ //未登录
                return -2;
            }
            User user = userMapper.selectById(userid);
            if (user!=null){
                if (status.equals("0")){
                    if ("3".equals(user.getUserzt().toString())){
                        user.setUserzt(2);
                    }else {
                        user.setUserzt(1);
                    }
                }else if (status.equals("1")){
                    if ("2".equals(user.getUserzt().toString())){
                        user.setUserzt(3);
                    }else {
                        user.setUserzt(0);
                    }
                }else {
                    return -4;
                }

                if (userMapper.updateById(user)!= 0 ){
                    return 0;
                }else {
                    return -5;
                }

            }else {
                return -3;
            }
        }else {
            return -1;
        }
    }


    /**
     * @desc 获取指定用户发帖权限
     * @return
     */
    @Override
    public void getComment() {

    }

    @Override
    public void getInfo() {

    }

    @Override
    public void getInfoPart() {

    }

    @Override
    public void getLogin() {

    }

    @Override
    public void getPost() {

    }
}
