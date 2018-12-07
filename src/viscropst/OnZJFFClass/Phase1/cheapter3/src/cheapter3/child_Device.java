package viscropst.OnZJFFClass.Phase1.cheapter3.src.cheapter3;

public class child_Device {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("�������Ա������,�ԡ�,��������");
        String[] line = scanner.nextLine().split(",");
        String sex = line[0];
        int years = Integer.parseInt(line[1]);
        boolean olderthan5or7 = (years >= 7) || (years >= 5);
        if (olderthan5or7 && (sex.charAt(0) == '��'))
            System.out.println("���С������ʹ�ô��豸");
        else
            System.out.println("���С��������ʹ�ô��豸");
        scanner.close();
    }

}
