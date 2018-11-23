package viscropst.PinTiA;

public class ExchangeMaxAndMin0 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int min_ind = 0;
        int min_el = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min_el > arr[i]) {
                min_el = arr[i];
                min_ind = i;
            }

        }
        int temp = arr[0];
        arr[0] = arr[min_ind];
        arr[min_ind] = temp;
        int max_ind = 0;
        int max_el = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max_el < arr[i]) {
                max_el = arr[i];
                max_ind = i;
            }
        }
        int temp0 = arr[arr.length - 1];
        arr[arr.length - 1] = arr[max_ind];
        arr[max_ind] = temp0;
        String s = "";
        for (int i : arr) {
            s += i + " ";
        }
        System.out.print(s);
    }
}
