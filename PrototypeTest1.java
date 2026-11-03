
import java.util.ArrayList;
import java.util.Scanner;

public class PrototypeTest1 {

    static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> chatHistory = new ArrayList<>();
        String choice = " ";
        while (!choice.equals("3")) {
            System.out.println("To talk; Choose 1");
            System.out.println("To see the history; Choose 2");
            System.out.println("To Exit; Choose 3");
            choice = obj.nextLine();
            switch (choice) {
                case "1":
                    chat_func(chatHistory);
                    break;
                case "2":
                    viewHistory(chatHistory);
                    break;
                case "3":
                    System.out.println("Have a good one");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    static void chat_func(ArrayList<String> chatList) {
        System.out.println("How can I help you ?");
        String chat = obj.nextLine();
        chatList.add(chat);
    }

    static void viewHistory(ArrayList<String> chatList) {
        System.out.println("History");
        System.out.println(chatList);
    }
}
