package org.example.orm.enums;

public enum PerformanceScore {
    KOTU(1),
    VASAT(2),
    ORTA(3),
    IDARE_EDER(4),
    COKIYI(5);

    private int message;

    PerformanceScore(int message) {
        this.message = message;
    }

    public int getMessage() {
        return message;
    }
}
