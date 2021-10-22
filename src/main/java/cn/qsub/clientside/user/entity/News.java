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
public class News {
    @TableId
    private int chatid;
    private Integer resserid;
    private Integer recipients;
    private String content;
    private String display;
    private String createtime;
    private Integer isread;
    private String temp;
}
