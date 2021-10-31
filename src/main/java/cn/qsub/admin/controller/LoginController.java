package cn.qsub.admin.controller;


import cn.qsub.admin.service.LoginService;
import cn.qsub.utils.Response;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;


/**
 * @desc 登录
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/admin/api/manager")
@RestController
public class LoginController {

    @Resource
    private LoginService loginService;
    @RequestMapping("login")
    public Response login(String username, String password) {
        try {
            Map login = loginService.login(username, password);
            if (login==null){
                return new Response(Response.FAIL,"用户名或密码错误");
            }else{
                return new Response(Response.SUCCESS,"登录成功",login);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(Response.FAIL,"服务错误");
        }

    }
}
