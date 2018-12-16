package viscropst.OnZJFFClass.OnClassWork;

import java.util.Scanner;


public class MyShoppingMenu {
    String stars = "**********************************";
    public void showLoginMenu() {
        System.out.println("\n\t欢迎使用我行我素购物管理系统");
        String message = showSelection(new String[]{"登录菜单", "退出"});
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("请输入用户名：");
                String tmp0 = scanner.next();
                System.out.print("请输入密码：");
                String tmp1 = scanner.next();
                if ("admin".equals(tmp0) && "111111".equals(tmp1)) {
                    System.out.println("@@登录成功" + tmp0 + "@@");
                    showMainMenu();
                } else {
                    System.out.println("@@您没有权限进入,请重新登录@@");
                }
                break;
            } else if (choice == 2) {
                System.out.println("谢谢你的使用");
                break;
            } else {
                System.out.println("你的输入有错误，请重新输入");
            }
            System.out.print(message);
        }
        scanner.close();
    }

    private String showSelection(String[] sels) {
        for (int i = 0; i < sels.length; i++) {
            System.out.println(
                    String.format("\n\t\t%d.%s", (i + 1), sels[i]));
        }
        System.out.println(stars);
        String message = "请选择,输入数字:";
        System.out.print(message);
        //getInputAndJudge(new java.util.Scanner(System.in).nextInt());
        return message;
    }

    private void showSelection(String[] sels, String message) {
        for (int i = 0; i < sels.length; i++) {
            System.out.println(
                    String.format("\n\t\t%d.%s", (i + 1), sels[i]));
        }
        System.out.println(stars);
        System.out.print(message);
        //getInputAndJudge(new java.util.Scanner(System.in).nextInt());
    }

    private void getInputAndJudge(int nextInt) {
        // TODO Auto-generated method stub

    }

    public void showMainMenu() {
        System.out.println("\n\t我行我素购物管理系统主菜单");
        String message = showSelection(new String[]{"客户管理", "真情回馈", "注销"});
        //System.out.print("请选择,输入数字:");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            int choice = scanner.nextInt();
            if (choice == 1) {
                showCustMenu();
                break;
            } else if (choice == 2) {
                showSendGMenu();
                break;
            } else if (choice == 3) {
                showLoginMenu();
                break;
            } else {
                System.out.println("你的输入有错误，请重新输入");
            }
            System.out.print(message);
        }
    }

    public void showCustMenu() {
        System.out.println("\n\t我行我素购物管理系统 > 客户信息管理");
        String message = "请选择，输入数字或按‘0’返回上一级菜单\n";
        showSelection(new String[]{"显示所有客户信息",
                        "添加客户信息", "修改客户信息", "查看客户信息"}
                , message);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("这是所有客户的信息");
            } else if (choice == 2) {
                System.out.println("添加客户信息");
            } else if (choice == 3) {
                System.out.println("修改客户信息");
            } else if (choice == 4) {
                System.out.println("查看客户信息");
            } else if (choice == 0) {
                showMainMenu();
                break;
            } else {
                System.out.println("你的输入有错误，请重新输入");
            }
            System.out.print(message);
        }
        scanner.close();
    }

    public void showSendGMenu() {
        System.out.println("\n\t我行我素购物管理系统 > 客户信息管理");
        String message = "请选择，输入数字或按‘0’返回上一级菜单\n";
        showSelection(new String[]{"幸运大放送",
                        "幸运抽奖"}
                , message);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("幸运大放送");
            } else if (choice == 2) {
                System.out.println("幸运抽奖");
            } else if (choice == 0) {
                showMainMenu();
                break;
            } else {
                System.out.println("你的输入有错误，请重新输入");
            }
            System.out.print(message);
        }
        scanner.close();
    }
}

class StartMessage {
    public static void main(String[] args) {
        MyShoppingMenu menu = new MyShoppingMenu();
        menu.showLoginMenu();
    }
}
