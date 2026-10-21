package me.wuwenbin.noteblogv4.service.mail;

import me.wuwenbin.noteblogv4.model.entity.NBArticle;


public interface MailService {

    /**
     * 发送评论通知邮件
     * @param site
     * @param article
     * @param comment
     */
    void sendNoticeMail(String site, NBArticle article, String comment);
}
