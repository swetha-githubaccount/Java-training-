abstract class Shape{
    void area(int x, int y){};
    void perimeter(int x, int y){};
}

class Square extends Shape{
    void area(int x){
        System.out.println("Area of suare is "+ x*x);
    }
    void perimeter(int x){
        System.out.println("Perimeter of suare is "+ 4 *x);
    }
}

class Circle extends Shape{
    void area(float x){
        System.out.println("Area of square is "+ 3.14f * x*x);
    }
    void perimeter(float x){
        System.out.println("Circumference is "+ 2 * 3.14f * x);
    }
}

class Rectangle extends Shape{
    void area(int x , int y){
        System.out.println("Area of rectangle is "+ x*y);
    }
    void perimeter(int x, int y){
        System.out.println("Perimeter of rectangle is "+ ((2*x)+(2*y)));
    }
}


public class AbstractionWithShapes {
    public static void main(String[] args) {
        System.out.println("Square :");
        Square s = new Square();
        s.area(5);
        s.perimeter(5);
        System.out.println("Circle :");
        Circle c = new Circle();
        c.area(5.5f);
        c.perimeter(5.5f);
        System.out.println("Rectangle :");
        Rectangle r = new Rectangle();
        r.area(5, 6);
        r.perimeter(5, 6);
    }
}