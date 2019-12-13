import java.util.Scanner;
public class StringManipulation {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        String sentence1 = "";
        String sentence2 = "";
        String whitespace = "";
        
        
        System.out.println("===========================================");
        System.out.println("Welcome to the StringManipulation program!");
        System.out.println("===========================================");
        System.out.println("Please provide us with your first sentence:");
        sentence1 = s.nextLine();
        System.out.println("Please provide us with your second sentence:");
        sentence2 = s.nextLine();
        
        if(sentence1.equals(sentence2)){
            System.out.println("It appears that both of these sentences are the same!");
        } else {
            System.out.println("It appears that both of these sentences are not the same!");
        }
   
        System.out.println("");
        System.out.println("The length of the sentence is " + sentence1.length() + " characters!");
        System.out.println("");
        System.out.println("Thank you for using the StringManipulation program! Bye!");
    }
    
}
