package com.group7.edu.utils;

import java.util.HashMap;

/**
 * @author default
 */
public class ResultData extends HashMap<String, Object> {
    private Integer code;
    private String msg;

    private static final int STATUS_SUCCESS = 0;
    private static final int STATUS_FAILURE = 1;

    @Override
    public Object put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public static ResultData isSuccess() {
        return new ResultData(0);
    }

    public static ResultData isSuccess(String msg) {
        return new ResultData(STATUS_SUCCESS, msg);
    }

    public static ResultData isFailure() {
        return new ResultData(1);
    }

    public static ResultData isFailure(String msg) {
        return new ResultData(STATUS_FAILURE, msg);
    }

    public ResultData(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultData(Integer code) {
        this(code, "");
    }

    public ResultData() {}

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
