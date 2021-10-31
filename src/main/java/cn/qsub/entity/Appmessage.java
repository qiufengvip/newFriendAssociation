package cn.qsub.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-10-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Appmessage implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "appid", type = IdType.AUTO)
    private Integer appid;

    private String name;

    private String state;

    private String loginway;

    private String diaryaward;

    private String appversion;

    private String appupdate;

    private String mitype;

    private String email;

    private String register;

    private String login;

    private String downpath;

    private String temp;


}
