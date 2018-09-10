package com.springboot.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @ClassName: Email
 * @Auther: zhangyingqi
 * @Date: 2018/9/2 23:13
 * @Description:
 */
@Data
public class Email implements Serializable {
    private static final long serialVersionUID = 1L;
    //必填参数
    private String email;//接收方邮件
    private String subject;//主题
    private String content;//邮件内容
    //选填
    private String template;//模板
    private HashMap<String, String> kvMap;// 自定义参数
}
