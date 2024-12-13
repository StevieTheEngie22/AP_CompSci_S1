import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String input = scanner.nextLine();
        
        System.out.println("Original phrase: " + input);
        String reversedPhrase = "";
        
        int length = input.length();
        int wordEnd = -1;
        
        for (int i = length - 1; i >= 0; i--) {
            if (input.substring(i, i + 1).equals(" ") || i == 0) {
                if (wordEnd == -1) wordEnd = i;
                
                String word;
                if (i == 0) word = input.substring(i, wordEnd + 1);
                else word = input.substring(i + 1, wordEnd + 1);
                
                if (reversedPhrase.equals("")) reversedPhrase = word;
                else reversedPhrase = reversedPhrase + " " + word;
                wordEnd = i - 1;
            }
        }
        System.out.println("Reversed phrase: " + reversedPhrase);
    }
}
