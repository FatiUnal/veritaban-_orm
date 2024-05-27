package org.example.orm.enums;

public enum EmployeeSatisfaction {
    ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5);

    EmployeeSatisfaction(int message) {
        this.message = message;
    }

    private int message;

    public int getMessage() {
        return message;
    }
}
