class Shape{
    void area()
    {
        System.out.println("Area of the shape");
    }
}

class TwoD extends Shape
{
    void area()
    {
        System.out.println("Area of the 2D shape");
    }
    void perimeter()
    {
        System.out.println("Perimeter of the shape");
    }
}

class ThreeD extends Shape
{
    void area()
    {
        System.out.println("Area of the 3D shape");
    }
    void perimeter()
    {
        System.out.println("Perimeter of the shape");
    }
}

class Circle extends TwoD
{
    void area(float x)
    {
        System.out.println("Area of circle is "+ 3.14f * x);
    }
    void perimeter(float x)
    {
        System.out.println("Circumference of the circle is "+ 3.14f * x* 2);
    }
}

class Sphere extends ThreeD
{
    void area(float x)
    {
        System.out.println("Area of sphere is "+ 4 * 3.14f * x * x);
    }
    void volume(float x)
    {
        System.out.println("Volume of the sphere is "+ (4/3)* 3.14f * x*x*x);
    }
}



public class MultilevelInheritanceShape {

    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.area(5.5f);
        c.perimeter(5.5f);

        Sphere s = new Sphere();
        s.area(5.5f);
        s.volume(5.5f);

        // Upcasting
        TwoD t = new Circle();
        t.area();
    }
}
