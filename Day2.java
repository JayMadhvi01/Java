import java.util.HashMap;
import java.util.Scanner;

public  class Day2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chat = sc.nextLine();

        HashMap<String, String> alphabets = new HashMap<>();
         alphabets.put("A", "65");
        alphabets.put("B", "66");
        alphabets.put("C", "67");
        alphabets.put("D", "68");
        alphabets.put("E", "69");
        alphabets.put("F", "70");
        alphabets.put("G", "71");
        alphabets.put("H", "72");
        alphabets.put("I", "73");
        alphabets.put("J", "74");
        alphabets.put("K", "75");
        alphabets.put("L", "76");
        alphabets.put("M", "77");
        alphabets.put("N", "78");
        alphabets.put("O", "79");
        alphabets.put("P", "80");
        alphabets.put("Q", "81");
        alphabets.put("R", "82");
        alphabets.put("S", "83");
        alphabets.put("T", "84");
        alphabets.put("U", "85");
        alphabets.put("V", "86");
        alphabets.put("W", "87");
        alphabets.put("X", "88");
        alphabets.put("Y", "89");
        alphabets.put("Z", "90");

        String[] c = chat.split("");
        for(String i : c){
            if (alphabets.containsKey(i)){
            System.out.println(alphabets.get(i));
            }
        }

    }

}