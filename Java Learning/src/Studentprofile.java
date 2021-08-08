public class Studentprofile {

    public static class Student
    {
        String Firstname;
        String Lastname;
        double gpa;
        int graduationyear;

        public Student(String Firstname,String Lastname,double gpa,int graduationyear)
        {
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.gpa=gpa;
        this.graduationyear=graduationyear;
        }
        public int incrementgraduationyear()
        {
           int year=graduationyear+1;
           return year;
        }

    }

    public static void main(String[] args)
    {
       Student std = new Student("Minnu","Johnson",8.5,2018);
       int incrementedyear = std.incrementgraduationyear();
       System.out.println("Name of the student :" + std.Firstname+std.Lastname);
       System.out.println("Incremented year is:" + incrementedyear);


    }

}
