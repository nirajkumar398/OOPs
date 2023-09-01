class Pen {
    String color;
    String type; // ballpen; gel;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this + " " + this.color);
    }
}

class Student {
    String name;
    int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("non parameterize constructor is called");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("parameterize constructor is called");
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballPoint";
        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student("Niraj", 24);
        Student s2 = new Student(s1);
        s2.print();
        System.out.println(s1);
        System.out.println(s2);

    }
}