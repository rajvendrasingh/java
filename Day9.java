public class Day9 {
    public Static void main (String[]args){

    int n=5;
    for (int i=1; i<=n; i++){
        // spaces 
        for (int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
    
    
// for num
    for (int j=1; j<=i; j++){
        System.out.print(i +" ");
    }
    System.out.println();
    
}
         // palindromic pattern print in java
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
          
        }
    }
}


