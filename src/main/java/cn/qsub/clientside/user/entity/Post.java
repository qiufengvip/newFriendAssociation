package cn.qsub.clientside.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author 秋枫
 * @desc
 * @time 2021/10/21 18:11
 */
@Data
public class Post {
    @TableId
    private int postid;
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
