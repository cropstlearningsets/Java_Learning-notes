package cheapter6;

public class Calculator {
    int a, b;

    void plus() {
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    void minus() {
        System.out.println(a + "-" + b + "=" + (a - b));
    }

    void multiply() {
        System.out.println(a + "*" + b + "=" + (a * b));
    }

    void divide() {
        if (b != 0)
            System.out.println(a + "/" + b + "=" + (a / b));
        else
            System.out.println("b不能为零");
    }
}
