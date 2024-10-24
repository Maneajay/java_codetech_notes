package StringOperations;
import java.util.Scanner;
public class StringOperationsMenu {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringUtils stringUtils = new StringUtils();

        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Find Length of String");
            System.out.println("2. Replace Character in String");
            System.out.println("3. Count Words in String");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Length of string: " + stringUtils.findLength(inputString));
                    break;
                case 2:
                    System.out.print("Enter character to replace: ");
                    char oldChar = sc.next().charAt(0);
                    System.out.print("Enter new character: ");
                    char newChar = sc.next().charAt(0);
                    System.out.println("Updated string: " + stringUtils.replaceCharacter(inputString, oldChar, newChar));
                    break;
                case 3:
                    System.out.println("Word count in string: " + stringUtils.wordCount(inputString));
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }
}

