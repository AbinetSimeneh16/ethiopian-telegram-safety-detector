# Ethiopian Telegram Safety Detector

## Overview

Ethiopian Telegram Safety Detector is a Java application that analyzes text messages and detects potentially harmful, scam, or harassment-related content. The project aims to help identify messages that may contain threats, scams, or inappropriate content using keyword and pattern matching.

This project is being developed as a learning project in Java and will continue to evolve with more advanced detection techniques.

## Features

- Detects harmful messages
- Detects scam messages
- Detects harassment messages
- Supports keyword-based detection
- Supports multi-word pattern detection
- Reads keywords and patterns from external text files
- Interactive console interface
- Continues analyzing messages until the user exits
- Logs flagged detections with timestamps
## Technologies Used

- Java
- IntelliJ IDEA
- Git & GitHub
- File Handling
- Object-Oriented Programming (OOP)

## Project Structure

```
src/
└── com/
    └── abinet/
        └── safetydetector/
            ├── Main.java
            ├── MessageAnalyzer.java
            ├── DetectionResult.java
            ├── DetectionLogger.java
            ├── KeywordRepository.java
            ├── KeywordFileHandler.java
            └── RiskLevel.java
```
Project Root
├── src/
│   └── ...
├── harmfulkeywords.txt
├── harmfulpatterns.txt
├── scamkeywords.txt
├── harassmentkeywords.txt
├── detections.txt
└── README.md
## Current Status

Version 1.2

### Completed
- Keyword detection
- Pattern detection
- External keyword files
- Detection logging
- Interactive console application

### Planned
- Keyword management menu
- Statistics dashboard
- JavaFX GUI
- PostgreSQL integration
- Telegram Bot API
- AI-powered message classification

## Future Improvements

- Detection logging
- Keyword management menu
- Statistics dashboard
- JavaFX graphical interface
- PostgreSQL database support
- Telegram Bot integration
- AI-based message classification

## Author

Abinet Simeneh Worku