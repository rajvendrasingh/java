import java.util.Scanner;

public class Day4 {
    public static void main(String args[]) {
        // for (int i=0; i<5; i++){
        //     System.out.println(i);
        // }
        // for (int i=0; i<5; i++){
        //     System.out.println("hello world");
        // }
        // for (int i=0; i<5; i++){
        //     System.out.println("hello world"+i);
        // }
        // for (int i=0; i<5; i++){
        //     System.out.println("hello world"+(i+1));
        // }
        // for (int i=1; i<=5; i++){
        //     System.out.println("hello world"+i);
        // }
    //    for( int i=0; i<11; i++){
    //     System.out.print(i+" ");
     //  }

     // whilw loop 
    //   int i =0;
    //   while(i<11){
    //     System.out.println(i);
    //     i++;
    //   }

    // do while loopint 
    // int i =12;
    // do{
    //     System.out.println(i);
    //     i++;
    // }while(i<11);


    //     }
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    // int i =0;
    // int sum = 0;
    // while(i<=num){
    //     sum = sum+i;
    //     System.out.println(sum);
    //     i++;
    // }
    // sc.close();
    
    // int sum=0;
    // for (int i=1; i<num; i++){
    //     sum = sum+i;
    //     System.out.println(sum); // this will print the sum at each step error in this code sout inside in the loop so it will print the sum at each step but we want to print the sum at the end of the loop so we have to move the sout statement outside of the loop
    // }
    // int sum = 0;

    //     for (int i = 1; i <= num; i++) {
    //         sum = sum + i;
    //     }

    //     System.out.println("Total sum = " + sum);
    // int mul=0;
    // for(int i=1; i<=10; i++){
    //    int mul=num*i;
    //     System.out.println(mul);

    // }

    // home work no.1 print all even num
    for (int i=1; i<=num; i++){
        if (i%2==0){
            System.out.println(i);
        }
    }

    // ghome work problem 2;
  
   
        
        if (num >=90){
        System.out.println("Good");
    }
    else if(num >=60 && num <=89){
        System.out.println("Average");
    }
    else{
        System.out.println("Poor");
    }

    } while(false);

    sc.close();
    }}
