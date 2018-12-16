package cheapter63;

import java.util.Arrays;
import java.util.Scanner;

/***
 *
 * @author TEDU
 *
 */
public class CustomerBiz {
    public static String stars = "****************************";
    String[] names = new String[30];
    int index = 0;

    public void addName(String name) {
        if (index < names.length) {
            names[index] = name;
            index++;
        }
    }

    public void showName() {
        System.out.println(stars + "\n");
        System.out.println("\t客户姓名列表:");
        System.out.println(stars);
        int ir = 1;
        for (int i = 0; i < index;
             i++) {
            System.out.print(names[i] + "\t");
            if (ir == 4) {
                System.out.println();
                ir = 1;
            }
            ir++;
        }
        System.out.println();

        System.out.println("******Before Sort******");
        ir = 1;
        for (int i = 0; i < index; i++) {
            System.out.print(names[i] + "\t");
            if (ir == 4) {
                System.out.println();
                ir = 1;
            }
            ir++;
        }
        System.out.println();
        System.out.println("******After Sort******");
        String[] sortNames = sortNames(names);
        ir = 1;
        for (int i = 0; i < sortNames.length; i++) {
            System.out.print(sortNames[i] + "\t");
            if (ir == 4) {
                System.out.println();
                ir = 1;
            }
            ir++;
        }

        System.out.println("\n");
    }

    public boolean alterName(String oldName, String newName) {
        boolean isSuccess = false;
        for (int i = 0; i < index; i++) {
            if (oldName.equals(names[i])) {
                names[i] = newName;
                isSuccess = true;
                break;
            }
        }
        return isSuccess;
    }

    public String[] sortNames(String[] names) {
        String[] names0 = new String[index];
        names0 = Arrays.copyOf(names, index);
        Arrays.sort(names0);
        return names0;
    }
}

class TestCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerBiz cBiz = new CustomerBiz();
        while (true) {
            System.out.print("请输入客户的姓名: ");
            String name = scanner.nextLine();
            cBiz.addName(name);
            System.out.print("继续输入吗?(y/n): ");
            String choice = scanner.nextLine();
            if ("n".equals(choice))
                break;
        }
        cBiz.showName();
        System.out.print("请输入要修改的客户姓名: ");
        String oldName = scanner.nextLine();
        System.out.print("请输入新的客户姓名: ");
        String newName = scanner.nextLine();
        System.out.println("\n\n***********修改结果************\n");
        if (cBiz.alterName(oldName, newName))
            System.out.println("找到并修改成功");
        else
            System.out.println("找到并修改失败");
        cBiz.showName();
        scanner.close();
    }
}
