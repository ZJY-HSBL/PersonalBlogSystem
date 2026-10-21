package me.wuwenbin.noteblogv4.service.login;

import me.wuwenbin.noteblogv4.model.pojo.framework.NBR;

/**
 * 登录服务接口
 */
public interface LoginService<T> {


    /**
     * 登录方法
     *
     * @param data
     * @return
     */
    NBR doLogin(T data);


}
