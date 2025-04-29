import java.util.Scanner;

public class FixedHeapDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Fixed heap dynamic array - allocated on heap but size fixed after creation
        int[] arr = new int[5];
        
        System.out.println("Enter 5 elements:");
        for(int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Fixed heap dynamic array in Java:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}