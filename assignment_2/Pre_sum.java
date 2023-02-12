import java.util.Scanner;

class Pre_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int new_arr[] = new int[size];
        new_arr[0] = arr[0];
        for (int i = 1; i < size; i++) {
            new_arr[i] = new_arr[i - 1] + arr[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(new_arr[i] + " ");
        }

    }
}
