public class Day5 {
    public static void main(String args[]) {
        // int n=4;
        // int m=5;  // nested loop to print the pattern of stars
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }// outer loop
        // int n=4;
        // int m=5;  // nested loop to print the pattern of stars
        // for (int i=1; i<=n; i++){
        //     // iner loop
        //     for (int j=1; j<=m; j++){
        //         // cell -> (i,j)
        //         if (i==1 || j==1 || i==n || j==m){
        //             System.out.print("*");

        //         } else {
        //             System.out.print(" ");
        //         }
                

        //     }
        //     System.out.println();
        // }

    //    int n=4;
     
    //  for (int i=n; i>=1; i--){// outer loop
    //     for (int j=1; j<=i; j++){  // ineer loop
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }

    int m=4;
    for (int i=m; i<=1; i--){
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
        
    
}}

