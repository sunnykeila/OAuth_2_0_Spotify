package com.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("message")
    private Integer message;

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }
    @JsonProperty("message")
    public Integer getMessage() {
        return message;
    }
    @JsonProperty("message")
    public void setMessage(Integer message) {
        this.message = message;
    }
}