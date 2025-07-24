import java.util.Scanner;

public class Control_statements {
    
    // Method demonstrating return statement
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;  // return if even
        } else {
            return false; // return if odd
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- Control Statements Menu ---");
            System.out.println("1. Check Even/Odd using if-else");
            System.out.println("2. Grade using if-else-if ladder");
            System.out.println("3. Day of Week using switch");
            System.out.println("4. Print numbers 1 to N using for loop");
            System.out.println("5. Print numbers 1 to N using while loop");
            System.out.println("6. Print numbers 1 to N using do-while loop");
            System.out.println("7. Demonstrate break and continue in loop");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    // Using if-else and return statement in method
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    if (isEven(num)) {
                        System.out.println(num + " is Even.");
                    } else {
                        System.out.println(num + " is Odd.");
                    }
                    break;
                    
                case 2:
                    // if-else-if ladder to assign grades
                    System.out.print("Enter marks (0-100): ");
                    int marks = sc.nextInt();
                    if (marks >= 90) {
                        System.out.println("Grade: A");
                    } else if (marks >= 75) {
                        System.out.println("Grade: B");
                    } else if (marks >= 50) {
                        System.out.println("Grade: C");
                    } else if (marks >= 35) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }
                    break;
                    
                case 3:
                    // switch statement for days of week
                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();
                    switch(day) {
                        case 1: System.out.println("Sunday"); break;
                        case 2: System.out.println("Monday"); break;
                        case 3: System.out.println("Tuesday"); break;
                        case 4: System.out.println("Wednesday"); break;
                        case 5: System.out.println("Thursday"); break;
                        case 6: System.out.println("Friday"); break;
                        case 7: System.out.println("Saturday"); break;
                        default: System.out.println("Invalid day number!");
                    }
                    break;
                    
                case 4:
                    // for loop to print numbers
                    System.out.print("Enter N: ");
                    int nFor = sc.nextInt();
                    System.out.println("Numbers from 1 to " + nFor + " (for loop):");
                    for (int i = 1; i <= nFor; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                    
                case 5:
                    // while loop to print numbers
                    System.out.print("Enter N: ");
                    int nWhile = sc.nextInt();
                    System.out.println("Numbers from 1 to " + nWhile + " (while loop):");
                    int i = 1;
                    while (i <= nWhile) {
                        System.out.print(i + " ");
                        i++;
                    }
                    System.out.println();
                    break;
                    
                case 6:
                    // do-while loop to print numbers
                    System.out.print("Enter N: ");
                    int nDoWhile = sc.nextInt();
                    System.out.println("Numbers from 1 to " + nDoWhile + " (do-while loop):");
                    int j = 1;
                    do {
                        System.out.print(j + " ");
                        j++;
                    } while (j <= nDoWhile);
                    System.out.println();
                    break;
                    
                case 7:
                    // break and continue demo in a loop
                    System.out.println("Loop from 1 to 10, skip 5, stop at 8:");
                    for (int k = 1; k <= 10; k++) {
                        if (k == 5) {
                            System.out.println("Skipping 5");
                            continue;  // skip printing 5
                        }
                        if (k == 8) {
                            System.out.println("Stopping at 8");
                            break;    // exit loop when k=8
                        }
                        System.out.println(k);
                    }
                    break;
                    
                case 8:
                    System.out.println("Exiting program. Bye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
        } while (choice != 8);
        
        sc.close();
    }
}
