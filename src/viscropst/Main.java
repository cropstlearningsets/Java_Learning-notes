package viscropst;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //String[] line = scanner.nextLine().split(" ");
        int x = scanner.nextInt();
        int t = 0;
        for (int i = 1; i < x; i++) {
            int rmp = (i + 1) * 2;
            t = t + rmp;
        }
        System.out.print(t);
    }
}