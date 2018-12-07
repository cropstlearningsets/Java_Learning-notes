package viscropst.OnZJFFClass.Phase1.cheapter3.src.cheapter3;

public class breakfToday {
    private static final String breakf = "��ͳ�%s";

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        switch (in.nextLine().charAt(0)) {
            case 'һ':
            case '��':
            case '��':
                System.out.print(String.format(breakf, "����"));
                break;
            case '��':
            case '��':
            case '��':
                System.out.print(String.format(breakf, "����"));
                break;
            case '��':
                System.out.print(String.format(breakf, "��ϯ�ײ�"));
                break;
        }
        in.close();
    }

}
