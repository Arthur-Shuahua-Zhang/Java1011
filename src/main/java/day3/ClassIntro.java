package day3;

// top level class
public class ClassIntro {
    // inner class
    class InnerClass{

    }

    // static nested class
    static class NestedClass{

    }
}

class Demo{}


class M {
    public void method(){};

    // overload
    public void method(int val) {

    }


}

class N extends M{
    @Override
    public void method() {
        System.out.println("sdf");
    }



}
