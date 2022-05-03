package day1;

public class DataType {

    public static void main(String[] args) {
//        int num = 1;
//        char ch = 'c';
//
//        double dou = 1.2;
//
//
//        Integer b = 2;
//        System.out.println(num + b);
//
//        String s1 = "A";
//        StringBuilder s2 = new StringBuilder("B");
//        StringBuffer s3 = new StringBuffer("C");
//
//        concat1(s1);
//        concat2(s2);
//        concat3(s3);
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        Integer a = 12;
        Integer b = 12;
        Integer c = new Integer(12);
        Integer d = Integer.valueOf(12);
        Integer e = 127;
        Integer f = 127;

        System.out.println(a == b); // T
        System.out.println(a == c); // F
        System.out.println(a == d); // T

        System.out.println(e == f); // F


















    }

    public static void concat1(String s1) {
        s1 = s1 + " - - ";
    }
    public static void concat2(StringBuilder s2) {
        s2.append(" - - ");
    }
    public static void concat3(StringBuffer s3) {
        s3.append(" - - ");
    }
}
