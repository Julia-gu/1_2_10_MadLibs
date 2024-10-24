import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print the origional stories
        System.out.println("Mad Lib 1: I went to the animal <noun>, the <plural_noun> and the <number> animals were there.");
        System.out.println("Mad Lib 2: Once upon a time in a <adjective> land, a <noun> <adverb> grew.");
        System.out.println("Mad Lib 3: The <proper_noun> <verb> to the <adjective> <place> for <plural_noun>.");
        
        // enter different words
        System.out.println("\nEnter a noun: ");
        String noun = sc.nextLine();

        System.out.println("Enter a plural noun: ");
        String pluralNoun = sc.nextLine();

        System.out.println("Enter a number: ");
        String number = sc.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = sc.nextLine();

        System.out.println("Enter a proper noun: ");
        String properNoun = sc.nextLine();

        System.out.println("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.println("Enter a place: ");
        String place = sc.nextLine();

        // incorporate user input into the stories
        String story1 = "I went to the animal " + noun + ", the " + pluralNoun + " and the " + number + " beasts were there.";
        String story2 = "Once upon a time in a " + adjective + " land, a " + noun + " " + adverb + " grew.";
        String story3 = "The " + properNoun + " " + verb + " to the " + adjective + " " + place + " for " + pluralNoun + ".";

        // print the completed stories
        System.out.println("\nYour completed Mad Lib stories:");
        System.out.println(story1);
        System.out.println(story2);
        System.out.println(story3);

        sc.close();
    }
}
