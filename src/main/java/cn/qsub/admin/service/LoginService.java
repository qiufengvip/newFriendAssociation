package cn.qsub.admin.service;

import java.util.Map;

public interface LoginService {
    /**
     * @Desc 用户登录
     * @param username
     * @param password
     * @return
     */
    Map login(String username, String password);
}
