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
public class Userlogin implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "userloginid", type = IdType.AUTO)
    private Integer userloginid;

    private Integer uid;

    private String utoken;

    private String logintime;

    private String userip;

    private String temp;


}
