package viscropst.OnZJFFClass.Phase1.cheapter3.src.cheapter3;

public class WaterFee {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double waterval = scanner.nextDouble();
        double money = 0.0;
        if (waterval <= 15) {
            money = 4 * waterval / 3;
        } else {
            money = 2.5 * waterval - 17.5;
        }
        scanner.close();
        System.out.println(String.format("��ҵ�ˮ���ǣ�%.2f", money));
    }
}
