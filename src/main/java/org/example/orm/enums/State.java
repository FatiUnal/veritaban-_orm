package org.example.orm.enums;

public enum State {
    STATE_1("1"),
    STATE("2")
    ;
    private String message;

    State(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
