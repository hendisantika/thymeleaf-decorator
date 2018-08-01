package com.hendisantika.thymeleafdecorator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : thymeleaf-decorator
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/08/18
 * Time: 20.22
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DemoController {


    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/about")
    public String about() {
        return "about";
    }

}