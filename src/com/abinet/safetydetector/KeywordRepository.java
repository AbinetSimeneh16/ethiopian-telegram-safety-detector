package com.abinet.safetydetector;
import java.util.Arrays;
import java.util.List;

public class KeywordRepository {
    public List<String> getHarmfulKeywords() {
        return Arrays.asList(
                "nude",
                "private video",
                "private photo",
                "sex tape",
                "i will leak",
                "i will post your video",
                "send me your picture"
        );
    }
    public List<String> getScamKeywords() {
        return Arrays.asList(
                "send money",
                "send me money",
                "urgent payment",
                "click this link",
                "account blocked",
                "pay now",
                "bank transfer"
        );
    }
    public List<String> getHarassmentKeywords() {
        return Arrays.asList(
                "idiot",
                "stupid",
                "i will expose you",
                "i will ruin your life",
                "you will regret this"
        );
    }

}
