package com.ding.conf.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by ding on 16-7-29.
 */
@WebFilter(urlPatterns = "/*",initParams = {
        @WebInitParam(name = "exclusions",value = "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*")
})
public class DruidWebStatFilter extends WebStatFilter {
}

