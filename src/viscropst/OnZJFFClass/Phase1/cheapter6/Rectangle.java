package cheapter6;

public class Rectangle {
    //
    double length;
    double width;

    //
    void circumference() {
        double circumerence = (length + width) * 2;
        System.out.println(String.format("矩形的周长为%.2f", circumerence));
    }

    void area() {
        double square = length * width;
        System.out.println(String.format("矩形的面积为%.2f", square));
    }
}
