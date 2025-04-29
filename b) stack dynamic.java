import java.util.Scanner;

public class StackDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        // Stack dynamic array - size determined at runtime
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Stack dynamic array in Java:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}