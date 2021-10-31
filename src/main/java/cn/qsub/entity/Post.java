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
public class Post implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "postid", type = IdType.AUTO)
    private Integer postid;

    private Integer uid;

    private Integer placaid;

    private String createtime;

    private String display;

    private String posttext;

    private String postimg;

    private String postvideo;

    private Integer schoolid;

    private String posthead;

    private String temp;


}
