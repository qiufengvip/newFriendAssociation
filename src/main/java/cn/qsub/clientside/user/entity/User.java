package cn.qsub.clientside.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author 秋枫
 * @desc
 * @time 2021/10/21 18:12
 */
@Data
public class User {
    @TableId
    private int uid;
    private String username;
    private String usersex;
    private String userbirth;
    private String userphone;
    private Integer usersede;
    private String useras;
    private String useravatar;
    private String usermajor;
    private Integer schoolid;
    private String userclass;
    private String usercoin;
    private String password;
    private String email;
    private String auth;
    private Integer skinid;
    private int userzt;
    private String temp;
}
