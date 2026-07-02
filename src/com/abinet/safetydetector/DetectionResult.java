package com.abinet.safetydetector;

public class DetectionResult {
    private String message;
    private RiskLevel riskLevel;
    private String matchedKeyword;
    private String reason;

    public DetectionResult(String message, RiskLevel riskLevel, String matchedKeyword, String reason) {
        this.message = message;
        this.riskLevel = riskLevel;
        this.matchedKeyword = matchedKeyword;
        this.reason = reason;
    }
    public String getMessage() {
        return message;
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    public String getMatchedKeyword() {
        return matchedKeyword;
    }

    public String getReason() {
        return reason;
    }
}
