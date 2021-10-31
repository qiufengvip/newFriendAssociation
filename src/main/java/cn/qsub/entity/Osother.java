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
public class Osother implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "osotherid", type = IdType.AUTO)
    private Integer osotherid;

    private Integer osfirstid;

    private String osothertext;

    private Integer upid;

    private String display;

    private String createtime;

    private Integer schoolid;

    private Integer uid;

    private String temp;


}
