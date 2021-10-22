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
public class Skin {
    @TableId
    private int skinid;
    private String skinname;
    private String skindes;
    private String skinimg;
    private Integer uid;
    private String display;
    private Integer schoolid;
    private String temp;
}
