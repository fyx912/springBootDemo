package com.ding.web;

import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println("test ");
        return "test " +this.message;
    }

    @RequestMapping("/welcome")
//	@ResponseBody
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }


    /**
     * 响应到JSP页面index
     *
     */
    @RequestMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", message);
        mav.addObject("time", new Date());
        return mav;
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }

}