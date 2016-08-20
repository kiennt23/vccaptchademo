package com.starhub.controller;

import com.starhub.model.Request;
import com.starhub.model.Response;
import com.starhub.service.RecaptchaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by kiennguyen on 8/19/16.
 */
@CrossOrigin
@RestController
public class RecaptchaController {
    @Resource
    private RecaptchaService recaptchaService;

    @RequestMapping(path = "/verify-recaptcha", method = RequestMethod.POST)
    public Response verifyRecaptcha(@RequestBody Request request, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
        Response response = new Response();
        response.setSuccess(recaptchaService.verifyRecaptcha(getRemoteIp(httpRequest), request.getRecaptchaResponse()));
        return response;
    }

    private String getRemoteIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
