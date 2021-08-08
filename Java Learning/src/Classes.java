public class Classes {
    public static class Triangle{

        static int numofside=3;
        double base;
        double height;
        double side1;
        double side2;
        double side3;
        public  Triangle(double base,double height,double side1,double side2,double side3)
        {
            this.base=base;
            this.height=height;
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;

        }
        public double findarea()
        {
            double area = (this.base*this.height)/2;
            return area;
        }
    }

    public static void main(String[] args)
    {
        Triangle triangleA = new Triangle(5,8,3,3,3);
        Triangle triangleB = new Triangle(8,4,5.8,6.2,3);
        double triangleAarea= triangleA.findarea();
        double triangleBarea=triangleB.findarea();

        System.out.println("Area of  triangleA is :" + triangleAarea);
        System.out.println("Area of  triangleB is :" + triangleBarea);
        //static variable and methods can be called using Class name itself.
        System.out.println("number of sides of triangle is:" + Triangle.numofside);



    }

}
