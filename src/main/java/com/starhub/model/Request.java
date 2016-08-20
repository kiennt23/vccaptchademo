package com.starhub.model;

/**
 * Created by kiennguyen on 8/19/16.
 */
public class Request {
    private String recaptchaResponse;

    public String getRecaptchaResponse() {
        return recaptchaResponse;
    }

    public void setRecaptchaResponse(String recaptchaResponse) {
        this.recaptchaResponse = recaptchaResponse;
    }

    @Override
    public String toString() {
        return "Request{" +
                "recaptchaResponse='" + recaptchaResponse + '\'' +
                '}';
    }
}
