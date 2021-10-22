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
public class Appmessage {
    @TableId
    private int appid;
    private String name;
    private String state;
    private String loginway;
    private String diaryaward;
    private String appversion;
    private String appupdate;
    private String mitype;
    private String email;
    private String register;
    private String login;
    private String downpath;
    private String temp;
}
