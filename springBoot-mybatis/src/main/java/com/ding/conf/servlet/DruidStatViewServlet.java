package com.ding.conf.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by ding on 16-7-29.
 * Druid内置提供了一个StatViewServlet用于展示Druid的统计信息。
 这个StatViewServlet的用途包括：
 提供监控信息展示的html页面
 提供监控信息的JSON API
 注意：使用StatViewServlet，建议使用druid 0.2.6以上版本。
 基于注解web.xml
 */
@WebServlet(name = "DruidStatView",urlPatterns = "/druid/*",initParams ={
        @WebInitParam(name = "resetEnable",value = "false",description = "允许清空统计数据"),//false禁用HTML页面上的“Reset All”功能
        @WebInitParam(name="loginUsername",value = "admin",description = "用户名"),
        @WebInitParam(name="loginPassword",value = "admin",description = "密码"),
        @WebInitParam(name="allow",value = "127.0.0.1,192.168.40.94",description = "IP白名单 (没有配置或者为空，则允许所有访问)"),
        @WebInitParam(name="deny",value = "192.168.40.116",description = "IP黑名单 (存在共同时，deny优先于allow)")
})
public class DruidStatViewServlet extends StatViewServlet {
}
