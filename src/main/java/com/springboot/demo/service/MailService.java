package com.springboot.demo.service;

import com.springboot.demo.entity.Email;

public interface MailService {
    /**
     * 纯文本
     * @Author  科帮网
     * @param mail
     * @throws Exception  void
     * @Date	2017年7月20日
     * 更新日志
     * 2017年7月20日  科帮网 首次创建
     */
    public void send(Email mail) throws Exception;
    /**
     * 富文本
     * @Author  科帮网
     * @param mail
     * @throws Exception  void
     * @Date	2017年7月20日
     * 更新日志
     * 2017年7月20日  科帮网 首次创建
     *
     */
    public void sendHtml(Email mail) throws Exception;
    /**
     * 模版发送 freemarker
     * @Author  科帮网
     * @param mail
     * @throws Exception  void
     * @Date	2017年7月20日
     * 更新日志
     * 2017年7月20日  科帮网 首次创建
     *
     */
    public void sendFreemarker(Email mail) throws Exception;
    /**
     * 模版发送 thymeleaf(弃用、需要配合模板)
     * @Author  科帮网
     * @param mail
     * @throws Exception  void
     * @Date	2017年7月20日
     * 更新日志
     * 2017年7月20日  科帮网 首次创建
     *
     */
    public void sendThymeleaf(Email mail) throws Exception;



}
