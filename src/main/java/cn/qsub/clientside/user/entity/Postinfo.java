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
public class Postinfo {
    @TableId
    private int postinfoid;
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
