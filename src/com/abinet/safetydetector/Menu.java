package com.abinet.safetydetector;

import java.util.Scanner;
import java.util.List;

public class Menu {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        MessageAnalyzer analyzer = new MessageAnalyzer();
        DetectionLogger logger = new DetectionLogger();
        System.out.println("=== Ethiopian Telegram Safety Detector ===");
        String stop="c";
        int choice;
        while (!stop.equals("s"))
        {
            System.out.println("1.analyze Message");
            System.out.println("2. Manage Keywords");
            System.out.println("3. View Keywords");
            System.out.println("4. Statistics");
            System.out.println("5. Exit");
            System.out.println("please enter your choice from 1 to 4 in number");
            choice=scanner.nextInt();
            scanner.nextLine();
            if(choice!=1 && choice!=2&&choice!=3&&choice!=4 )
            {
                System.out.println(("wrong input please re-enter your choice"));
            }
            else if(choice==1)
            {
                System.out.print("Enter a message to analyze: ");
                String message = scanner.nextLine();

                DetectionResult result = analyzer.analyzeMessage(message);

                System.out.println("\n=== Detection Result ===");
                System.out.println("Original Message: " + result.getMessage());
                System.out.println("Risk Level: " + result.getRiskLevel());
                System.out.println("Matched Keyword: " + result.getMatchedKeyword());
                System.out.println("Reason: " + result.getReason());

                logger.log(result);

                System.out.println("Please enter the letter's' to stop the program and the letter'c' to continue:");
                stop=scanner.nextLine().toLowerCase();
            }
            else if(choice==2)
            {
                System.out.println("========Welcome to manage keywords========");
                System.out.println("1. Add Harmful Keyword");
                System.out.println("2. Add Scam Keyword");
                System.out.println("3. Add Harassment Keyword");
                System.out.println("4. Add Harmful Pattern");
                System.out.println("5. Add Scam Pattern");
                System.out.println("6. Add Harassment Pattern");
                System.out.println("7. Back");
                boolean s=true;
                int choice2;
                while(s)
                {
                    System.out.println("please choose from 1 to 7");
                    choice2=scanner.nextInt();
                    scanner.nextLine();
                    if(choice2!=1 && choice2!=2&&choice2!=3&&choice2!=4&&choice2!=5 &&choice2!=6&&choice2!=7)
                    {
                        System.out.println(("wrong input please re-enter your choice"));
                    }
                    else if(choice2==1)
                    {
                        System.out.println("please enter a harmful keyword");
                        String message=scanner.nextLine();
                        KeywordFileHandler.write(KeywordFileHandler.HARMFUL,message);
                        System.out.println("keyword Successfully addded");
                        continue;
                    }
                    else if(choice2==2)
                    {
                        System.out.println("please enter a scam keyword");
                        String message=scanner.nextLine();
                        KeywordFileHandler.write(KeywordFileHandler.SCAM,message);
                        System.out.println("keyword Successfully addded");
                        continue;
                    }
                    else if(choice2==3)
                    {
                        System.out.println("please enter a harassment keyword");
                        String message=scanner.nextLine();
                        KeywordFileHandler.write(KeywordFileHandler.HARASSMENT,message);
                        System.out.println("keyword Successfully addded");
                        continue;
                    }
                    else if(choice2==4)
                    {
                        System.out.println("please enter a Harmful Pattern.make sure the pattern contains two words separated by a comma");
                        String message=scanner.nextLine();
                        KeywordFileHandler.write(KeywordFileHandler.HARMFUL_PATTERN,message);
                        System.out.println("keyword Successfully addded");
                        continue;
                    }
                    else if(choice2==5)
                    {
                        System.out.println("please enter a Scam Pattern.make sure the pattern contains two words separated by a comma");
                        String message=scanner.nextLine();
                        KeywordFileHandler.write(KeywordFileHandler.SCAM_PATTERN,message);
                        System.out.println("keyword Successfully addded");
                        continue;
                    }
                    else if(choice2==6)
                    {
                        System.out.println("please enter a Harassment Pattern.make sure the pattern contains two words separated by a comma");
                        String message=scanner.nextLine();
                        KeywordFileHandler.write(KeywordFileHandler.HARASSMENT_PATTERN,message);
                        System.out.println("keyword Successfully addded");
                        continue;
                    }

                    else if(choice2==7)
                    {
                        System.out.println("Please enter the letter's' to stop the program and the letter'c' to continue:");
                        stop=scanner.nextLine().toLowerCase();
                        if(stop.equals("s"))
                        {
                            s=false;
                        }
                    }
                }
            }
            else if(choice==3)
            {
                System.out.println("1.View Harmful Keywords");
                System.out.println("2.View Scam Keywords");
                System.out.println("3.View Harassment Keywords");
                System.out.println("4.View Harmful patterns ");
                System.out.println("5.View Scam patterns ");
                System.out.println("6.View Harassment patterns ");
                System.out.println("7. Exit ");
                int choice3;
                while(true)
                {
                    System.out.println("enter your choice from 1 to 7");
                    choice3=scanner.nextInt();
                    scanner.nextLine();
                    if(choice3!=1 && choice3!=2&&choice3!=3&&choice3!=4&&choice3!=5&&choice3!=6
                            &&choice3!=7)
                    {
                        System.out.println(("wrong input please re-enter your choice"));
                    }
                    else if(choice3==1)
                    {
                        List<String> harmful=KeywordFileHandler.read(KeywordFileHandler.HARMFUL);
                        for(String word : harmful){
                            System.out.println(word);
                        }
                        continue;
                    }
                    else if(choice3==2)
                    {
                        List<String> scam=KeywordFileHandler.read(KeywordFileHandler.SCAM);
                        for(String word : scam){
                            System.out.println(word);
                        }
                        continue;
                    }
                    else if(choice3==3)
                    {
                        List<String> harassment=KeywordFileHandler.read(KeywordFileHandler.HARASSMENT);
                        for(String word:harassment){
                            System.out.println(word);
                        }
                        continue;
                    }
                    else if(choice3==4)
                    {
                        List<String> harmpat=KeywordFileHandler.read(KeywordFileHandler.HARMFUL_PATTERN);
                        for(String word:harmpat){
                            System.out.println(word);
                        }
                        continue;
                    }
                    else if(choice3==5)
                    {
                        List<String> scampat=KeywordFileHandler.read(KeywordFileHandler.SCAM_PATTERN);
                        for(String word:scampat){
                            System.out.println(word);
                        }
                        continue;
                    }
                    else if(choice3==6)
                    {
                        List<String> harapat=KeywordFileHandler.read(KeywordFileHandler.HARASSMENT_PATTERN);
                        for(String word:harapat){
                            System.out.println(word);
                        }
                        continue;
                    }
                    else if(choice3==7)
                    {
                        System.out.println("Please enter the letter's' to stop the program and the letter'c' to continue:");
                        stop=scanner.nextLine().toLowerCase();
                        if(stop.equals("s"))
                        {
                            break;
                        }

                    }

                }


            }
            else if(choice==5)
            {
                stop="s";
            }
        }


    }
}