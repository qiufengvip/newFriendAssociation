package cn.qsub.entity;

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
public class Postbk implements Serializable {

    private static final long serialVersionUID=1L;

    private String placaname;

    private Integer createtime;

    private String placaid;

    private Integer isschool;

    private String pinfo;

    private String pavatar;

    private String temp;


}
