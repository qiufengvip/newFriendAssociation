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
 * @time 2021/10/21 18:12
 */
@Data
public class Userlog {
    @TableId
    private int userlogid;
    private Integer uid;
    private String time;
    private String content;
    private String ip;
    private String coinchange;
    private String optype;
    private String temp;
}
