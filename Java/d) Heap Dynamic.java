import java.util.ArrayList;
import java.util.Scanner;

public class HeapDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial array size: ");
        int size = scanner.nextInt();
        
        // Heap dynamic array using ArrayList - can grow/shrink
        ArrayList<Integer> arr = new ArrayList<>();
        
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }
        
        System.out.println("Heap dynamic array in Java:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}