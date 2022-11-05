import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Алгоритм сортировки вставками");
        int[] arr = {23, 56, 89, 1, 89, 19, 25, 22, 36, 18, 58, 88};
        System.out.println(Arrays.toString(arr));
        sortInserts(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortInserts(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = current;
        }
    }
}