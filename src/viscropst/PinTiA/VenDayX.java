package viscropst.PinTiA;

public class VenDayX {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = 0;
        String n1 = "", n2 = "", tmp;
        do {
            n++;
            tmp = scanner.nextLine();
            if (!tmp.equals(".")) {
                if (n == 2)
                    n1 = tmp;
                else if (n == 14)
                    n2 = tmp;
            }
            // n++;


        } while (!tmp.equals("."));
        //if (!n1.isEmpty() && n2.isEmpty()) {
        if (!n1.isEmpty() && n < 14) {
            System.out.println(n1 + " is the only one for you...");
        } else if (!n1.isEmpty() && !n2.isEmpty()) {
            System.out.println(n1 + " and " + n2 + " are inviting you to dinner...\n");
        } else {
            System.out.println("Momo... No one is for you ...");
        }
    }
}