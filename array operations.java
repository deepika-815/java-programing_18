import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100]; 
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Traverse (Print)");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Update");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Traversal
                    System.out.println("Array elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2: // Insertion
                    System.out.print("Enter element to insert: ");
                    int element = sc.nextInt();
                    System.out.print("Enter position (1 to " + (n+1) + "): ");
                    int pos = sc.nextInt();
                    for (int i = n; i >= pos; i--) {
                        arr[i] = arr[i-1];
                    }
                    arr[pos-1] = element;
                    n++;
                    System.out.println("Element inserted.");
                    break;

                case 3: // Deletion
                    System.out.print("Enter position to delete (1 to " + n + "): ");
                    int delPos = sc.nextInt();
                    for (int i = delPos-1; i < n-1; i++) {
                        arr[i] = arr[i+1];
                    }
                    n--;
                    System.out.println("Element deleted.");
                    break;

                case 4: // Search
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at position " + (i+1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Element not found!");
                    break;

                case 5: // Update
                    System.out.print("Enter position to update (1 to " + n + "): ");
                    int updatePos = sc.nextInt();
                    System.out.print("Enter new value: ");
                    int newVal = sc.nextInt();
                    arr[updatePos-1] = newVal;
                    System.out.println("Element updated.");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
