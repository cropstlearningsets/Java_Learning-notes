package viscropst.OnZJFFClass.Phase1.cheapter3;

public class threeAndTwo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int days = scanner.nextInt();
        //boolean isfishing=(days%5==1)||(days%5==2)||(days%5==3);
        //boolean isfishing=(days%5==0)||(days%5==4);
        boolean isfishing = days % 5 > 0 && days % 5 < 4;
        if (isfishing) {
            System.out.println("Fishing in day " + days);
        } else {
            System.out.println("Drying in day " + days);
        }
        scanner.close();
    }

}
