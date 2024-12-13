import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Turn this word into Pig Latin: ");
        String sentence = sc.nextLine();
        
        while (sentence.indexOf(" ") != -1) {
            int space = sentence.indexOf(" "); 
            String word = sentence.substring(0, space); 
            System.out.print(pigLatin(word) + " "); 
            sentence = sentence.substring(space + 1);
        }

        System.out.println(pigLatin(sentence));
    }
    
    public static String pigLatin(String sentence){  
        String firstLetter = sentence.substring(0,1);
        String secondLetter = sentence.substring(1,2);
        
        if (sentence.length() == 1) {
            return sentence + "way";
        }

        if (firstLetter.equalsIgnoreCase("A") || firstLetter.equalsIgnoreCase("E") || firstLetter.equalsIgnoreCase("I") || firstLetter.equalsIgnoreCase("O") || firstLetter.equalsIgnoreCase("U")){
            return(sentence + "way");
        }
        else if (secondLetter.equalsIgnoreCase("A") || secondLetter.equalsIgnoreCase("E") || secondLetter.equalsIgnoreCase("I") || secondLetter.equalsIgnoreCase("O") || secondLetter.equalsIgnoreCase("U")) {
            return(sentence.substring(1) + firstLetter + "ay");
        }

        else {
            return(sentence.substring(2) + firstLetter + secondLetter + "ay");
        }
    }
}
