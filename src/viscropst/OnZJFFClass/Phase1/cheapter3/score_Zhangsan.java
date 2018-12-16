package viscropst.OnZJFFClass.Phase1.cheapter3;

public class score_Zhangsan {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String format = "成绩等级为: %s";
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double score = scanner.nextDouble();

        String mode = "if";
        score(format, score, mode);
    }

    private static void score(String format, double score, String mode) {
        if (mode.equals("if")) {
            if (score > 90)
                System.out.format(format, "优");
            else if (score >= 80 && score <= 90)
                System.out.format(format, "良");
            else if (score >= 70 && score < 80)
                System.out.format(format, "中");
            else if (score >= 60 && score < 70)
                System.out.format(format, "及");
            else
                System.out.format(format, "差");
        } else if (mode.equals("switch")) {
            switch ((int) (score / 10)) {
                case 9:
                    System.out.format(format, "优");
                    break;
                case 8:
                    System.out.format(format, "良");
                    break;
                case 7:
                    System.out.format(format, "中");
                    break;
                case 6:
                    System.out.format(format, "及");
                    break;
                default:
                    System.out.format(format, "差");
                    break;
            }
        }
    }

}
