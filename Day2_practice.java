import java.util.Scanner;// for importing scanner class
public class Day2_practice {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name :");
        String name = sc.nextLine();// for next line input`
        System.out.println("enter your college name :");
        String college= sc.nextLine();
        System.out.println("enter your branch name :");
        String branch = sc.nextLine();
        System.out.print("enter your age :");
        int age = sc.nextInt();
        System.out.print(("my name is "+name+". my age is " +age+". my college is "+college+". my branch is "+branch+"."));
        // System.out.print(("my age is "+age+"."));
        // System.out.print(("my college is "+college+"."));
        // System.out.println(" my branch is "+branch+".");
        sc.close();// closing scanner object

    }
}

    
