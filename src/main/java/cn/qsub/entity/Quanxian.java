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
public class Quanxian implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer rootid;

    private String state;

    private String loginway;

    private String diaryaward;

    private String appversion;

    private String temp;


}
