package viscropst.OnZJFFClass.Phase1.cheapter3;

public class child_Device {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入性别和年龄,以“,”隔开：");
        String[] line = scanner.nextLine().split(",");
        String sex = line[0];
        int years = Integer.parseInt(line[1]);
        boolean olderthan5or7 = (years >= 7) || (years >= 5);
        if (olderthan5or7 && (sex.charAt(0) == '男'))
            System.out.println("这个小孩可以使用此设备");
        else
            System.out.println("这个小孩不可以使用此设备");
        scanner.close();
    }

}
