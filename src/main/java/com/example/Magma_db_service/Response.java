package com.example.Magma_db_service;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"ServiceResult", "OutputResult", "ErrorCode", "ErrorText"})
public class Response {
    public String ServiceResult;
    public OutputResult OutputResult;
    public String ErrorCode;
    public String ErrorText;

    public Response(String serviceResult, OutputResult OutputResult, String errorCode, String errorText) {
        this.ServiceResult = serviceResult;
        this.OutputResult = OutputResult;
        this.ErrorCode = errorCode;
        this.ErrorText = errorText;
    }
}
