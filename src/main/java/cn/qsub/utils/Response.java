package cn.qsub.utils;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 秋枫
 * @desc
 * @time 2021/10/22 18:27
 */
public class Response<T> {
   public static final int SUCCESS = 200;  //成功代码
   public static final int FAIL = -1;   //错误代码

   public int code;
   public String msg;
   public T data;

   public Response(int code, String msg, T data){
      this.data = data;
      this.code = code;
      this.msg =msg;
   }

   public Response(int code, String msg){
      this.code = code;
      this.msg =msg;
   }
}
