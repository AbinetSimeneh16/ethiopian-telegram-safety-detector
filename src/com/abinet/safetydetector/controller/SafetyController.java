package com.abinet.safetydetector.controller;
import com.abinet.safetydetector.DetectionResult;
import com.abinet.safetydetector.MessageAnalyzer;
import com.abinet.safetydetector.dto.MessageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SafetyController {
    private final MessageAnalyzer messageAnalyzer;

    public SafetyController() {
        this.messageAnalyzer = new MessageAnalyzer();
    }
    @PostMapping("/analyze")
    public DetectionResult analyze(@RequestBody MessageRequest request) {

        return messageAnalyzer.analyzeMessage(request.getMessage());
    }

}
