public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Малюю коло кольором" + color);
    }
}

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Малюю квадрат кольором " + color);
    }
}

public enum Color {
    RED,
    GREEN,
    BLUE
}

public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle(Color.RED);
        circle.draw();

        Shape square = new Square(Color.GREEN);
        square.draw();
    }
}
