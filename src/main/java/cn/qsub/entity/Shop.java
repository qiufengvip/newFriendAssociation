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
public class Shop implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "bensid", type = IdType.AUTO)
    private Integer bensid;

    private String benscoin;

    private String bensname;

    private String bensimg;

    private String bensdes;

    private Integer schoolid;

    private String temp;


}
