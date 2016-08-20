package com.starhub.service;

/**
 * Created by kiennguyen on 8/19/16.
 */
public interface RecaptchaService {
    boolean verifyRecaptcha(String hostname, String response);
}
