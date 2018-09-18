package com.springboot.demo.service;

import com.springboot.demo.entity.Email;

public interface MailService {

    /**
     * @auther: zhangyingqi
     * @date: 9:14 2018/9/18
     * @param: [mail]
     * @return: void
     * @Description: 纯文本
     */
    public void send(Email mail) throws Exception;

    /**
     * @auther: zhangyingqi
     * @date: 9:14 2018/9/18
     * @param: [mail]
     * @return: void
     * @Description: 富文本
     */
    public void sendHtml(Email mail) throws Exception;

    /**
     * @auther: zhangyingqi
     * @date: 9:14 2018/9/18
     * @param: [mail]
     * @return: void
     * @Description: 模版发送 freemarker
     */
    public void sendFreemarker(Email mail) throws Exception;

    /**
     * @auther: zhangyingqi
     * @date: 9:13 2018/9/18
     * @param: [mail]
     * @return: void
     * @Description: 模版发送 thymeleaf
     */
    public void sendThymeleaf(Email mail) throws Exception;



}
