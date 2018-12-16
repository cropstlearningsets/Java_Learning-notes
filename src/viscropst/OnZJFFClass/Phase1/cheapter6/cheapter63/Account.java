package cheapter63;

import java.util.HashMap;

public class Account {
    double money = 0;

    public boolean saveMoney(double money) {
        if (money < 0)
            return false;
        double total = this.money + money;
        this.money = total;
        return true;
    }

    public boolean drawMoney(double money) {
        if (money > this.money)
            return false;
        this.money = this.money - money;
        return true;
    }

    public void printMenu(String title,
                          String[] menuItem,
                          String reqMsg) {
        System.out.println("***" + title + "***");
        System.out.println();
        for (int i = 0; i < menuItem.length - 1; i++) {
            System.out.print((i + 1) + "." + menuItem[i] + "   ");
        }
        System.out.println("0" + "." + menuItem[menuItem.length - 1]);
        System.out.print(reqMsg);
    }
}

class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        HashMap<String, String> messageMap = new HashMap<String, String>();
        messageMap.put("prompt_choose", "请选择你需要办理的业务: ");
        messageMap.put("prompt_save_money", "请输入存款金额: ");
        messageMap.put("prompt_draw_money", "请输入取款金额: ");
        messageMap.put("alert_save_succ", "存款成功");
        messageMap.put("alert_save_fail", "存款失败");
        messageMap.put("alert_draw_succ", "取款成功");
        messageMap.put("alert_draw_fail", "取款失败");
        messageMap.put("alert_choose_err", "输入错误");
        messageMap.put("alert_thanks_using", "谢谢你的使用");

        java.util.Scanner scanner;
        while (true) {
            int choice = -1;
            account.printMenu(String.format("当前余额为%.2f", account.money),
                    new String[]{"存款", "取款", "退出"},
                    messageMap.get("prompt_choose"));
            scanner = new java.util.Scanner(System.in);
            choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println(messageMap.get("alert_thanks_using"));
                break;
            } else {
                if (choice == 1) {
                    System.out.print(messageMap.get("prompt_save_money"));
                    int money = scanner.nextInt();
                    if (account.saveMoney(money))
                        System.out.println(messageMap.get("alert_save_succ"));
                    else
                        System.out.println(messageMap.get("alert_save_fail"));
                } else if (choice == 2) {
                    System.out.print(messageMap.get("prompt_draw_money"));
                    int money = scanner.nextInt();
                    if (account.drawMoney(money))
                        System.out.println(messageMap.get("alert_draw_succ"));
                    else
                        System.out.println(messageMap.get("alert_draw_fail"));
                } else {
                    System.out.println(messageMap.get("alert_choose_err"));
                }
            }
        }
        scanner.close();
    }
}
