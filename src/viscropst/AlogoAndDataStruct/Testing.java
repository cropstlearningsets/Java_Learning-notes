package viscropst.AlogoAndDataStruct;

public class Testing {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }

}
