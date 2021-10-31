package cn.qsub.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author ${author}
 * @since 2021-10-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

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

    private Integer userzt;

    private String temp;


}
