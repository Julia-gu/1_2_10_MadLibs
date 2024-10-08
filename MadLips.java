import java.util.Scanner; 

public class MadLips { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter a noun
        System.out.print("Enter a noun (e.g., cookie, pencil, etc.): "); 
        String noun = scanner.nextLine(); // Read input for a noun

        //enter a plural noun
        System.out.print("Enter a plural noun(e.g., apples, chocolates, etc.): "); 
        String pluralNoun = scanner.nextLine(); // Read input for a plural noun

        //enter a number
        System.out.print("Enter a number(e.g., 1, 5, 100.): "); 
        String number = scanner.nextLine(); // Read input for a number

        //madLibs story template with placeholders
        String story = "KK made a <noun>, which <plural_noun> and <number> grams of sugar.";

        //replace placeholders
        story = story.replace("<noun>", noun);
        story = story.replace("<plural_noun>", pluralNoun);
        story = story.replace("<number>", number);

        System.out.println("Here’s your MadLibs story:"); 

        // print story
        System.out.println(story); 

        scanner.close();
    }
}
