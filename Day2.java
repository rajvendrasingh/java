import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        // System.out.print("hello raj kaise ho\n kya kar rah ho\n");
        //  System.out.println("hello raj kaise ho");// print ln use for new line
        //   System.out.println("hello raj kaise ho");
        // System.out.println("*");
        //  System.out.println("**");
        //   System.out.println("****");
        //    System.out.println("******");

        int a=25;// integer variable
        int b=35;
        System.out.println(2*(a+b));// 2 is constant and a,b is variable
        String name ="raj";  // string variable
     
        double  price =15.5;  // double vaiable use for decimal float values
        int age = 17;
        int year =2009;
        System.out.println("name:"+name+", age:"+age+", year:"+year+",price is "+price);

        int c=10;
        int d=5;
        int sum = (c*d)/(c-d);
        System.out.println("sum is :"+sum);

        // for input use Scanner class
      
        // Scanner sc = new Scanner (System.inn);
        Scanner vc = new Scanner(System.in);
        String Name = vc.nextLine(); // for complete line input
        //nextInt()
        //nextFLoat()

        System.out.println("your name is :"+Name);
        int e=vc.nextInt();
        int f=vc.nextInt();
        int add = e+f;
        System.out.println("addition is :"+add);
        vc.close();






    }
}

//1.print()-> print in same line System.out.print()
//2.println()-> print in new line System.out.println()
//3./n -> new line chareacter


// data types in java 
// 1. primitive data types ( int 4byte, float ,double ,char 2byte, bolean 1byte ,  byte(1byte memory =8bites) , short, long 8byte)

// 2. non primitive data types (string , array , obj);

