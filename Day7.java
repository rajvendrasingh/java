public class Day7 { 
    public static void main (String[]args){
        // int num =1;
        // int n=5;

        // // outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for (int j=1; j<=i; j++){
        //          System.out.print(num + " ");
        //         num++;// num = num+1
                
        //     }
        //     System.out.println();
        // }
        int n=5;
        //outer loop
        for ( int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+ " ");
                }

            }
            System.out.println();

        }
    }
    
}

