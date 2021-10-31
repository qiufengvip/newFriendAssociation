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
public class Postinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "postinfoid", type = IdType.AUTO)
    private Integer postinfoid;

    private Integer postid;

    private String postzan;

    private String postshare;

    private String postaos;

    private String postos;

    private String postsee;

    private String isexamina;

    private String postrec;

    private Integer schoolid;

    private String temp;


}
