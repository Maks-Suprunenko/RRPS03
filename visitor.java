public interface Shape {

    void accept(Visitor visitor);
}

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getRadius() {
        return radius;
    }
}

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getSide() {
        return side;
    }
}

public interface Visitor {

    void visit(Circle circle);

    void visit(Square square);
}

public class XMLExportVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("<circle radius=\"" + circle.getRadius() + "\" />");
    }

    @Override
    public void visit(Square square) {
        System.out.println("<square side=\"" + square.getSide() + "\" />");
    }
}

public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape square = new Square(5);

        Visitor visitor = new XMLExportVisitor();

        circle.accept(visitor);
        square.accept(visitor);
    }
}
