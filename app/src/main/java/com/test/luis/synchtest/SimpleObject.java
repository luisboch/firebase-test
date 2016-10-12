package com.test.luis.synchtest;

/**
 * Created by luis on 10/10/16.
 */

public class SimpleObject {
    private String key;
    private String name;
    private Long timestamp;

    public SimpleObject() {
    }

    public SimpleObject(String name) {
        this.name = name;
    }

    public SimpleObject(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return timestamp + " - " + name;
    }
}
