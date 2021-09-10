package com.example.dataanalysis.basic;

public class ActionResult {
    public ActionResult() {
    }

    public ActionResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 0：成功
     */
    private int code;
    private String message;
    private int count;
    private Object data;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
