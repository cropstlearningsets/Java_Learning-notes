package viscropst.OnZJFFClass.Phase1.cheapter5.src.cheapter5;

public class ScoreOfN {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int f = scanner.nextInt();
        int[] scores = new int[f];
        int sum = 0;
        for (int i = 0; i < f; i++) {
            scores[i] = scanner.nextInt();
            sum = sum + scores[i];
        }
        double average = sum * 1.0 / scores.length;
        System.out.println(String.format("���ѧ����ƽ���ɼ�Ϊ%.2f", average));


        scanner.close();
    }

}
