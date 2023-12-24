public abstract class AbstractFactory {

    public abstract Shape createShape(String shapeType);
}

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape createShape(String shapeType) {
        if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Малюю коло");
    }
}

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Малюю квадрат");
    }
}

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new ShapeFactory();
        Shape shape = factory.createShape("circle");
        shape.draw();
    }
}
