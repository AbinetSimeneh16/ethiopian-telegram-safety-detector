package com.abinet.safetydetector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MessageAnalyzer analyzer = new MessageAnalyzer();

        System.out.println("=== Ethiopian Telegram Safety Detector ===");
        System.out.print("Enter a message to analyze: ");

        String message = scanner.nextLine();

        DetectionResult result = analyzer.analyzeMessage(message);

        System.out.println("\n=== Detection Result ===");
        System.out.println("Original Message: " + result.getMessage());
        System.out.println("Risk Level: " + result.getRiskLevel());
        System.out.println("Matched Keyword: " + result.getMatchedKeyword());
        System.out.println("Reason: " + result.getReason());

        scanner.close();
    }
}
