package cn.qsub.clientside.user.entity;

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
public class Postbk {
    private String placaname;
    private Integer createtime;
    private String placaid;
    private Integer isschool;
    private String pinfo;
    private String pavatar;
    private String temp;
}
