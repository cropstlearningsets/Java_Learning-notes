package viscropst.OnZJFFClass.Phase1.cheapter3.src.cheapter3;

import java.util.Scanner;

public class BMI_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] info_in = str.split(" ");
        double height = Double.parseDouble(info_in[0]);
        double weight = Double.parseDouble(info_in[1]);
        double bmi = weight / (Math.pow(height, 2));
        if (bmi > 35)
            System.out.println("���ѳ�Ϊ����");
        else if (bmi > 30) {
            System.out.println("���ѳ�Ϊ����");
        } else if (bmi > 25) {
            System.out.println("�е�С�֣��ٳԵ�");
        } else if (bmi > 20) {
            System.out.println("��ϲ�㣬�ܽ�������������Ŷ");
        } else if (bmi > 20) {
            System.out.println("�е��ݣ��ؼҶ��һ��");
        } else {
            System.out.println("�㻹����");
        }
        scanner.close();
    }

}
