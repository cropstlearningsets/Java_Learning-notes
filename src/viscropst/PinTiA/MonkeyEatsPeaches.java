package viscropst.PinTiA;

public class MonkeyEatsPeaches {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //String[] line = scanner.nextLine().split(" ");
        int x = scanner.nextInt();
        int t = 1;
        for (int i = 1; i < x; i++) {
            t = (t + 1) * 2;
        }
        System.out.print(t);
    }
}
