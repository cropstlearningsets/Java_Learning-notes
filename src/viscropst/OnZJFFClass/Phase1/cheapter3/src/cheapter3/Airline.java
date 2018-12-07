package viscropst.OnZJFFClass.Phase1.cheapter3.src.cheapter3;

public class Airline {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String[] ins = scanner.nextLine().split(" ");
        int month = Integer.parseInt(ins[0]);
        int sel = Integer.parseInt(ins[1]);
        boolean isAirlineHot = (month >= 4 && month <= 10);
        double price = 0.0;
        if (sel == 1) {
            if (isAirlineHot)
                price = 5000 * 0.9;
            else
                price = 5000 * 0.5;
        } else if (sel == 2) {
            if (isAirlineHot)
                price = 5000 * 0.8;
            else
                price = 5000 * 0.4;
        }
        System.out.println(price);
        scanner.close();
    }

}
