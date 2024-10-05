
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter your elements");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr1[i] = x;
        }
        System.out.println("orignal array");
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length];
        for(int i =0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println("copied array");
        System.out.println(Arrays.toString(arr2));
    }
}
