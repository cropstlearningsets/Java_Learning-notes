package viscropst.OnZJFFClass.Phase1.cheapter3;

import java.util.Scanner;

public class BMI3_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] info_in = str.split(" ");
        char sex = info_in[0].charAt(0);
        double height = Double.parseDouble(info_in[1]);
        double weight = Double.parseDouble(info_in[2]);
        double bmi = weight / (Math.pow(height, 2));
        if (sex == '男') {
            if (bmi > 35)
                System.out.println("你已成为巨人");
            else if (bmi > 30) {
                System.out.println("你已成为巨人");
            } else if (bmi > 25) {
                System.out.println("有点小胖，少吃点");
            } else if (bmi > 20) {
                System.out.println("恭喜你，很健康，继续保持哦");
            } else if (bmi > 20) {
                System.out.println("有点瘦，回家多吃一点");
            } else {
                System.out.println("你还好吗？");
            }
        } else {
            if (bmi > 34)
                System.out.println("你已成为巨人");
            else if (bmi > 29) {
                System.out.println("你已成为巨人");
            } else if (bmi > 24) {
                System.out.println("有点小胖，少吃点");
            } else if (bmi > 19) {
                System.out.println("恭喜你，很健康，继续保持哦");
            } else if (bmi > 15) {
                System.out.println("有点瘦，回家多吃一点");
            } else {
                System.out.println("你还好吗？");
            }
        }
        scanner.close();
    }
}
