package cn.qsub.admin.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 秋枫
 * @desc
 * @time 2021/10/22 17:55
 */
public interface UserService {
    /**
     * @desc 修改指定用户评论权限
     */
    int changeComment(String token,String userid,String status);

    /**
     * 修改指定用户密码
     */
    int changeKey(String token,String userid,String password);

    /**
     * 修改指定用户登录权限
     */
    int changeLogin(String token,String userid,String status);


    /**
     * 修改指定用户发帖权限
     */
    int changePost(String token,String userid,String status);


    /**
     * 获取指定用户发帖权限
     */
     void getComment();


    /**
     * 获取所有用户
     */
    void getInfo();


    /**
     * 获取部分用户
     */
    void getInfoPart();


    /**
     * 获取指定用户登录权限
     */
    void getLogin();

    /**
     * 获取指定用户发帖权限
     */
    void getPost();
}
