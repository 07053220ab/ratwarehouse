package com.dajie.djspringboottest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SampleController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/")
    @ResponseBody
    public String home(HttpServletRequest request) {
        logger.info("------Hello World!-------- {}",request.getServletPath());
        return "Hello World!Hello World!Hello World!Hello World!";
    }
}
