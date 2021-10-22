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
public class Ordem {
    @TableId
    private int ordemid;
    private Integer uid;
    private Integer bensid;
    private String sede;
    private String count;
    private Integer schoolid;
    private String temp;
}
