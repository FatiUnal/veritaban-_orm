package org.example.orm.enums;

import com.sun.jdi.PrimitiveValue;

public enum MaritalStatus {
    BEKAR(1),
    EVLI(2),
    BOSANMIS(3),
    DUL(4),
    AYRIYASAYAN(5);

    private int message;

    MaritalStatus(int message) {
        this.message = message;
    }

    public int getMessage() {
        return message;
    }
}
