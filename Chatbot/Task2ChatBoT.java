package Chatbot;

import java.util.Scanner;

public class Task2ChatBoT {

	
 public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! I'm a simple chatbot.how i can help you today!");
		
		while (true) {
			System.out.print("User: ");
			String userInput = scanner.nextLine().toLowerCase(); 
			
			if (userInput.equals("bye"))
			{
				System.out.println("Chatbot: Goodbye! Feel free to reach out if you have any more questions in the future. Have a great day!");
				break;
			}
			
			String botResponse = getBotResponse(userInput);
			System.out.println("Chatbot: " + botResponse);
		}
		
		scanner.close();
		
	}

    public static String getBotResponse(String userInput) {
        String botResponse = "";
        
        if (userInput.contains("hello") || userInput.contains("hi")) {
            botResponse = "Hi there!How can I assist you today?";
        } else if (userInput.contains("how are you")) {
            botResponse = "I'm just a chatbot,but thanks for asking!";
        } else if (userInput.contains("time")) {
            botResponse = "Sorry,I don't have access to real-time data such as the current time.";
        } else {
            botResponse = "I'm not sure how to respond to that. Can you ask another question?";
        }
        
        return botResponse;
    }
}

