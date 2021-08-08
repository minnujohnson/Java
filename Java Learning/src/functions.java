import java.util.Scanner;
public class functions {
//function type1
    public static void trianglearea()
    {
        System.out.println("Enter the base of the triangle: ");
        Scanner b = new Scanner(System.in);
        double base = b.nextDouble();
        System.out.println("Enter height of the triangle: ");
        Scanner h = new Scanner(System.in);
        double height = h.nextDouble();
        double Area = (base*height)/2;
        System.out.println("The Area of the triangle is: " + Area);


    }
    //function type 2

    public static void square()
    {
        Scanner s =new Scanner(System.in);
        double side = s.nextDouble();
        double AreaSq = side*side;
        System.out.println("Area of the square is: " + AreaSq);
    }
    //function type 3:with parameters

    public static void rectangle(double Length,double Breadth)
    {
        double Arearec = Length * Breadth;
        System.out.println("Area of the rectangle is : " + Arearec) ;
    }
    //function type 4 :with return types

    public static double circle(double radius)
    {
       double  Areacir = 3.14*radius*radius;
       return Areacir;
    }

    public static void main(String[] args)
    {
        trianglearea();
        System.out.println("Enter side of the square: ");
        square();
        rectangle(5,10);
        double Areacirc=circle(3);
        System.out.println("Area of the circle is: " + Areacirc);


    }
}
