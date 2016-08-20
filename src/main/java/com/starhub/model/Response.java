package com.starhub.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

/**
 * Created by kiennguyen on 8/19/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("error-codes")
    private Collection<String> errorCodes;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Collection<String> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(Collection<String> errorCodes) {
        this.errorCodes = errorCodes;
    }

    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", errorCodes=" + errorCodes +
                '}';
    }
}
