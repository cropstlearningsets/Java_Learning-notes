package viscropst.OnZJFFClass.Phase1.cheapter4.src.cheapter43;


/**
 * @author TEDU
 */
public class ScoreOf5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double sum = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("�������" + (i + 1) + "���ɼ���");
            int score = scanner.nextInt();
            sum = sum + score;
        }
        double average = sum / 5.0;
        System.out.println(String.format("�����Ŀ��Գɼ����ܷ��ǣ�%.1f,ƽ�����ǣ�%.1f", sum, average));
        scanner.close();
    }

}
