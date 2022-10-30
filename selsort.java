import java.util.*;

public class selsort {
    public static void selsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int MIN = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[MIN]) {
                    MIN = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[MIN];
            arr[MIN] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number Of Elements To Be Sorted : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            System.out.print("Enter the Number " + (k + 1) + " : ");
            arr[k] = s.nextInt();
        }
        System.out.println("    : UNSORTED ARRAY : \n\t" + Arrays.toString(arr));
        selsort(arr);// calling the selection sort method
        System.out.println("    : SORTED ARRAY : \n\t" + Arrays.toString(arr));
    }
}
