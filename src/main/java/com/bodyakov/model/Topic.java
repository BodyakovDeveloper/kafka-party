package com.bodyakov.model;

public enum Topic {
    BODYAKOV("bodyak0v"),
    NEBODYAKOV("neBodyak0v");

    private final String value;

    Topic(String value) {
        this.value = value;
    }

    public String getTopicName() {
        return value;
    }
}