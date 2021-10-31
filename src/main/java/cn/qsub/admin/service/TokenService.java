package cn.qsub.admin.service;

import cn.qsub.entity.Rootlogin;

public interface TokenService {
    Rootlogin queryToken(String token);
}
