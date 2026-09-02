//if-else
import java.util.Scanner;

public class SimpleIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}
//for loop 
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
//while loop
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1; // initialization

        while (i <= 5) { // condition
            System.out.println(i);
            i++; // increment
        }
    }
}
//do while loop
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1; // initialization

        do {
            System.out.println(i);
            i++; // increment
        } while (i <= 5); // condition
    }
}
//switch case
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }

        sc.close();
    }
}
