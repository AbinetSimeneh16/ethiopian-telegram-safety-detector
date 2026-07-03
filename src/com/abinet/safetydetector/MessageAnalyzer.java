package com.abinet.safetydetector;
import java.util.List;

public class MessageAnalyzer {
    private KeywordRepository keywordRepository;

    public MessageAnalyzer() {
        this.keywordRepository = new KeywordRepository();
    }

    public DetectionResult analyzeMessage(String message) {
        String lowerCaseMessage = message.toLowerCase();

        // Check harmful keywords first
        List<String> harmfulKeywords = keywordRepository.getHarmfulKeywords();
        for (String keyword : harmfulKeywords) {
            if (lowerCaseMessage.contains(keyword.toLowerCase())) {
                return new DetectionResult(
                        message,
                        RiskLevel.HARMFUL,
                        keyword,
                        "Possible harmful or exploitative content detected."
                );
            }
        }

        // Check scam keywords
        List<String> scamKeywords = keywordRepository.getScamKeywords();
        for (String keyword : scamKeywords) {
            if (lowerCaseMessage.contains(keyword.toLowerCase())) {
                return new DetectionResult(
                        message,
                        RiskLevel.SUSPICIOUS,
                        keyword,
                        "Possible scam or financial fraud content detected."
                );
            }
        }
        // Check harassment keywords
        List<String> harassmentKeywords = keywordRepository.getHarassmentKeywords();
        for (String keyword : harassmentKeywords) {
            if (lowerCaseMessage.contains(keyword.toLowerCase())) {
                return new DetectionResult(
                        message,
                        RiskLevel.SUSPICIOUS,
                        keyword,
                        "Possible harassment or threatening language detected."
                );
            }
        }
        // If nothing matched
        return new DetectionResult(
                message,
                RiskLevel.SAFE,
                "None",
                "No harmful content detected."
        );
    }


    }
