package com.starhub.service;

import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.starhub.model.Response;

/**
 * Created by kiennguyen on 8/19/16.
 */
@Service
public class RecaptchaServiceImpl implements RecaptchaService {
    private static final String RECAPTCHA_SECRET = "6Le8LyYTAAAAANh4r5porPhnqeuMuFqhpcWtVqjX";
    private static final String RECAPTCHA_URL = "https://www.google.com/recaptcha/api/siteverify";
    @Override
    public boolean verifyRecaptcha(String hostname, String response) {
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> requestBody = createBody(RECAPTCHA_SECRET, hostname, response);
        Response res = restTemplate.postForEntity(RECAPTCHA_URL, requestBody, Response.class).getBody();
        return res.isSuccess();
    }

    private MultiValueMap<String, String> createBody(String secret, String remoteIp, String response) {
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        form.add("secret", secret);
        form.add("remoteip", remoteIp);
        form.add("response", response);
        return form;
    }
}
