public class FixedDynamic {
    public static void main(String[] args) {
        // Fixed dynamic array - size known at compile time
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Fixed dynamic array in Java:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}