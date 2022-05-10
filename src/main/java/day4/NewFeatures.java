package day4;

public class NewFeatures {
    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.draw();

        Drawable d = () -> {
            System.out.println("Hello 321");
        };
        d.draw();
    }
}

interface Drawable {
    public void draw();
}

class Draw implements Drawable {

    @Override
    public void draw() {
        System.out.println("hello 123");
    }
}
