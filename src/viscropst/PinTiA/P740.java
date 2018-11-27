package viscropst.PinTiA;

public class P740 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] na = new int[n + 1];
        String result = "";
        for (int i = 0; i < n; i++) {
            //scanner = new java.util.Scanner(System.in);
            na[i] = scanner.nextInt();
        }
        int n1 = scanner.nextInt();
        na[n] = n1;
        //java.util.Arrays.sort(na);
        String s = "";
        //String s1 = "";
        for (int i = 0; i < na.length; i++) {
            for (int j = 0; j < na.length; j++) {
                if (na[i] < na[j]) {
                    int t = na[j];
                    na[j] = na[i];
                    na[i] = t;
                }
            }
        }
        for (int i : na) {
            s += i + " ";
        }
        System.out.println(s);
        //System.out.println(s1.trim());
    }
}
