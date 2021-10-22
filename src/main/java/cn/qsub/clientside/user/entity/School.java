package cn.qsub.clientside.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author 秋枫
 * @desc
 * @time 2021/10/21 18:11
 */
@Data
public class School {
    @TableId
    private int schoolid;
    private String schoolname;
    private String schoolsede;
    private int schoolusable;
    private String temp;
}
