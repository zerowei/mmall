package com.mmall.common;

public enum StatusCode{
    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    LOGIN_REQUIRE(2, "LOGIN_REQUIRE"),
    OTHER_ISSUES(3, "OTHER_ISSUES");

    private int code;
    private String name;

    private StatusCode(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
