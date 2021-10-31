package cn.qsub.admin.controller;

import cn.qsub.admin.service.UserService;
import cn.qsub.utils.Response;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 秋枫
 * @desc 用户管理模块
 * @time 2021/10/22 15:19
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/admin/api/user")
@RestController
public class UserComment {

    @Resource
    private UserService userService;

    /**
     * @return * -1 参数异常
     * * -2 非法请求
     * * -3 无此用户
     * * -4 参数错误
     * @desc 修改指定用户评论权限
     */
    @RequestMapping("changecomment")
    public Response changeComment(String token, String userid, String status) {
        try {
            int i = userService.changeComment(token, userid, status);
            switch (i) {
                case -1:
                    return new Response(Response.FAIL, "参数异常");
                case -2:
                    return new Response(Response.FAIL, "非法请求");
                case -3:
                    return new Response(Response.FAIL, "无此用户");
                case -4:
                    return new Response(Response.FAIL, "参数错误");
                case 0:
                    return new Response(Response.SUCCESS, "修改成功");
                default:
                    return new Response(Response.FAIL, "未知错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(Response.FAIL, "网络异常");
        }
    }

    /**
     * 修改指定用户密码
     */
    @RequestMapping("changeKey")
    public void changeKey() {

    }

    /**
     * 修改指定用户登录权限
     */
    @RequestMapping("changelogin")
    public void changelogin() {

    }


    /**
     * 修改指定用户发帖权限
     */
    @RequestMapping("changepost")
    public void changepost() {

    }


    /**
     * 获取指定用户发帖权限
     */
    @RequestMapping("getcomment")
    public void getcomment() {

    }


    /**
     * 获取所有用户
     */
    @RequestMapping("getinfo")
    public void getinfo() {

    }


    /**
     * 获取部分用户
     */
    @RequestMapping("getinfopart")
    public void getinfopart() {

    }


    /**
     * 获取指定用户登录权限
     */
    @RequestMapping("getlogin")
    public void getlogin() {

    }

    /**
     * 获取指定用户发帖权限
     */
    @RequestMapping("getpost")
    public void getpost() {

    }
}
