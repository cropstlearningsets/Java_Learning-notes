package viscropst;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //String[] line = scanner.nextLine().split(" ");
        int f = scanner.nextInt();
        int[] scores = new int[f];
        int sum = 0;
        for (int i = 0; i < f; i++) {
            scores[i] = scanner.nextInt();
        }
        String s = "";
        for (int i = scores.length - 1; i > 0; i--) {
            s += scores[i] + " ";
        }
        System.out.print(s + scores[0]);

    }
}