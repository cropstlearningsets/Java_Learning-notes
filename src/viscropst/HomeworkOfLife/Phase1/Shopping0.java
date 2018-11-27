package viscropst.HomeworkOfLife.Phase1;


public class Shopping0 {
    public static String form1 = "%s：%s";//“是幸运用户吗：true”格式
    public static String form1_a = "%s：";//“录入的信息是：”格式
    public static String form2 = "%s?%s\n";//“是幸运用户吗？true”格式
    public static String form3 = "%s %s";//“T恤 ￥245.0”格式
    public static String form4 = "%s\t%s\t%s";//“1.xxx 2.xxx"
    public static String formPwErrMsg = "输入错误！您还有%d次机会！";
    public static String formInInfo = "%s\t%s\t%s\n";//"xxxx     xxxx    xxxx"格式
    public static String formInInfo1 = "%s %s %s\n";//"xxxx xxxx xxxx"格式
    public static String seprateline = "\n" + "========================================" + "\n";//分割线
    public static String seprateline1 = "****************************************";
    public String form = "%s %s\t%s %s\t%s %s\n";//"购买物品: xxx单价: 10    个数: 1    金额: ￥1111"格式

    public static void main(String[] args) {
        java.util.Scanner scanner;

        for (int i = 0; i < 3; i++) {
            scanner = new java.util.Scanner(System.in);
            System.out.printf(form1_a, "请输入会员号（<4位整数>）");
            String usr_num = scanner.nextLine();
            int tmp = Integer.parseInt(usr_num);
            boolean is4dig = (tmp / 1000 < 10) && (tmp / 1000 > 0);
            if (!is4dig) {
                System.out.println("录入信息失效\n\n");
                continue;
            }
            System.out.printf(form1_a, "请输入会员生日(月/日<用两位数表示>)");
            String usr_birth = scanner.nextLine();
            System.out.printf(form1_a, "请输入会员积分");
            int usr_score = scanner.nextInt();
            System.out.println(String.format(form1_a, "您录入的会员信息是"));
            System.out.println(String.format(formInInfo1 + "\n", usr_num, usr_birth, usr_score));
        }
        System.out.println("程序结束！");
        System.out.println(seprateline);//第一题与第二题之间的分隔线
        String user = "jim";
        String pass = "123456";
        int count = 3;
        for (int i = 0; i < 3; i++) {
            scanner = new java.util.Scanner(System.in);
            System.out.printf(form1_a, "请输入用户名");
            String usr = scanner.nextLine();
            boolean isUsrRight = user.equals(usr);
            System.out.printf(form1_a, "请输入密码");
            String in_passwd = scanner.nextLine();
            boolean ispwdRight = pass.equals(in_passwd);
            if (!(ispwdRight && isUsrRight)) {
                System.out.println(String.format(formPwErrMsg + "\n\n", count -= 1));
                continue;
            } else {
                System.out.println("欢迎登陆MyShopping系统！\n");
                break;
            }
        }
        if (count == 0) {
            System.out.println("对不起，您3次均输入错误！");
        }
    }
}
