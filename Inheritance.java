// Inheritance
// 1. Singlelevel
// 2. Multilevel
// 3. Heirarchial
// 4. Hybrid
class Shape {
    String color;

    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int a) {
        System.out.println(Math.sqrt(3) / 4 * a * a);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}