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
public class Root implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "rootid", type = IdType.AUTO)
    private Integer rootid;

    private String rootname;

    private String rootpassword;

    private String avatar;

    private String managerlevel;

    private String temp;


}
