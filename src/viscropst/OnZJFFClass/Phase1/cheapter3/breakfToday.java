package viscropst.OnZJFFClass.Phase1.cheapter3;

public class breakfToday {
    private static final String breakf = "早餐吃%s";

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        switch (in.nextLine().charAt(0)) {
            case '一':
            case '三':
            case '五':
                System.out.print(String.format(breakf, "包子"));
                break;
            case '二':
            case '四':
            case '六':
                System.out.print(String.format(breakf, "油条"));
                break;
            case '日':
                System.out.print(String.format(breakf, "主席套餐"));
                break;
        }
        in.close();
    }

}
