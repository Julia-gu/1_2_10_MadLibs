import java.util.Scanner; 

public class MadLips { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter a noun
        System.out.print("Enter a noun: "); 
        String noun = scanner.nextLine(); // Read input for a noun

        //enter a plural noun
        System.out.print("Enter a plural noun: "); 
        String pluralNoun = scanner.nextLine(); // Read input for a plural noun

        //enter a number
        System.out.print("Enter a number: "); 
        String number = scanner.nextLine(); // Read input for a number

        //madLibs story template with placeholders
        String story = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";

        //replace placeholders with user inputs
        story = story.replace("<noun>", noun);
        story = story.replace("<plural_noun>", pluralNoun);
        story = story.replace("<number>", number);

        System.out.println("Here’s your MadLibs story:"); 

        // print story
        System.out.println(story); 

        scanner.close();
    }
}
