package viscropst.OnZJFFClass.Phase1.cheapter3.src.cheapter3;

public class whatDayToday {

    private static final String breakf = "��ͳ�";

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        java.util.Scanner in = new java.util.Scanner(System.in);
        char[] days = {'��', 'һ', '��', '��', '��', '��', '��'};
        String whatDayForm = "����������%s";
        switch (in.nextInt()) {
            case 0:
                System.out.print(String.format(whatDayForm, days[0]));
                break;
            case 1:
                System.out.print(String.format(whatDayForm, days[1]));
                break;
            case 2:
                System.out.print(String.format(whatDayForm, days[2]));
                break;
            case 3:
                System.out.print(String.format(whatDayForm, days[3]));
                break;
            case 4:
                System.out.print(String.format(whatDayForm, days[4]));
                break;
            case 5:
                System.out.print(String.format(whatDayForm, days[5]));
                break;
            case 6:
                System.out.print(String.format(whatDayForm, days[6]));
                break;
            default:
                System.out.print("�������");
                break;
        }
        in.close();
    }

}
