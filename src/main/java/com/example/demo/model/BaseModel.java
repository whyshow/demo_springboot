package com.example.demo.model;

public class BaseModel {
    public BaseModel(boolean state, String msg, Object object) {
        this.state = state;
        this.msg = msg;
        this.object = object;
    }
    private boolean state;
    private String msg;
    private Object object;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
