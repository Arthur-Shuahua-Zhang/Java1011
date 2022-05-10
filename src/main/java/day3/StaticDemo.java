package day3;

public class StaticDemo {


    static int a = 10;
    static int b;

    static {
        System.out.println("inside static block");
        b = a +4;
    }

    public static void main(String[] args) {
//        System.out.println("in the main method");
//        System.out.println(a);
//        System.out.println(b);
//
//        StaticDemo demo1 = new StaticDemo();
//        StaticDemo demo2 = new StaticDemo();
//        System.out.println(StaticDemo.a);

        // method1()   // yes
//         method2();  // no
//        StaticDemo demo1 = new StaticDemo();
//        demo1.method2();

    }

    public static void method1() {

    }

    public void method2() {
//         method3(); // yes
//         method1(); // yes
//        StaticDemo.method1();  // yes

    }

    public void method3() {

    }

}



