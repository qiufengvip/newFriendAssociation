package cn.qsub.clientside.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author 秋枫
 * @desc
 * @time 2021/10/21 18:10
 */
@Data
public class Aos {
    @TableId
    private int aosid;
    private Integer postid;
    private Integer uid;
    private String display;
    private Integer schoolid;
    private String temp;
}
