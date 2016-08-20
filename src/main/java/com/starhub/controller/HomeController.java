package com.starhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kiennguyen on 7/31/16.
 */
@Controller
public class HomeController {
    @RequestMapping(path="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

}
