package com.springboot.demo.controller;

import com.springboot.demo.base.controller.BaseController;
import com.springboot.demo.base.utils.StateParameter;
import com.springboot.demo.entity.Email;
import com.springboot.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: MailController
 * @Auther: zhangyingqi
 * @Date: 2018/9/2 23:37
 * @Description:
 */
@Controller
@RequestMapping(value="/mail")
public class MailController extends BaseController {

    @Value("${spring.mail.username}")
    private String username;

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    private MailService mailService;

    @RequestMapping(value="/send", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap send() {
        Email mail = new Email();
        mail.setEmail("824247231@qq.com");
        mail.setSubject("你个小逗比");
        mail.setContent("欢迎您");
        mail.setTemplate("happy");
        try {
            //mailService.sendFreemarker(mail);
            mailService.sendThymeleaf(mail);
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(StateParameter.FAULT, null, "发送失败");
        }
        return getModelMap(StateParameter.SUCCESS, null, "发送成功");
    }

    @RequestMapping(value="/sendEmail", method = RequestMethod.POST)
    @ResponseBody
    public void sendEmail() {
        //sendEmail("512417184@qq.com","饿了么", content);
        String to = "824247231@qq.com";
        String subject = "这是一封测试邮件";
        String content = "这是一封测试邮件";
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(username);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        try {
            mailSender.send(message);
            logger.info("邮件已发送。");
        } catch (Exception e) {
            logger.error("发送邮件时发生异常！", e);
        }

    }


}
