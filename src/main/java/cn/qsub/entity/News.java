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
public class News implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "chatid", type = IdType.AUTO)
    private Integer chatid;

    private Integer resserid;

    private Integer recipients;

    private String content;

    private String display;

    private String createtime;

    private Integer isread;

    private String temp;


}
