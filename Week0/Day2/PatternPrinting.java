package Week0.Day2;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        int n;
        System.out.print("enter the value: ");
        // taking input
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
/*for(int i=1; i<=n; i++){
           
         System.out.print("* " );
        }
        sc.close();      not impt
    */

/*for (int i=1; i<=5; i++){
    for(int j=1; j<=5; j++){
        System.out.print("* ");         //nested for loop
    } System.out.println("* ");
   // System.out.println();      this can also be used.
}*/

/*for(int i=1; i<=4; i++){
    for(int j=1; j<=i; j++){                   * algo for right facing triangle *
        System.out.print("* ");
    }System.out.println();
}*/

/*for(int i= 1; i<=n; i++){
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }System.out.println();
}*/

/*for(int i=1; i<=n; i++){
    // loops for spaces
    for(int k=1; k<= n-i; k++ ){     //spaces should be added first
        System.out.print(" ");
    }                                             // left facing triangle
    for(int j=1; j<=i; j++ ){
        System.out.print("*");
    } 
    System.out.println();       //endl
}*/

/*for(int i=n; i>=1; i--){
    for(int j=1; j<=i; j++){                 //inverted right facing triangle
        System.out.print("*");
    }System.out.println();
}*/

/*for(int i=n; i>=1; i--){
    // loops for spaces
    for(int k=1; k<= n-i; k++ ){     //spaces should be added first
        System.out.print(" ");
    }                                             //  inverted left facing triangle
    for(int j=1; j<=i; j++ ){
        System.out.print("*");
    } 
    System.out.println();}*/
  /*   for(int i=n; i>=1; i--){
        // loops for spaces
        for(int k=1; k<= n-i; k++ ){     
            System.out.print("    ");
        }                                             //  inverted left facing triangle with spaces
        for(int j=1; j<=i; j++ ){
            System.out.print("* ");
        } 
        System.out.println();}*/

 /*  for(int i=1; i<=n; i++){
    for(int j=1; j<=n; j++){
        if(i==1|| i==n || j==1 || j==n){
            System.out.print("* ");}              // to make a square with spaces
    else{ System.out.print("  ");}
    }System.out.println();
  }    */  
 /*  for(int i=1; i<=n; i++){
    for(int j=1; j<=n; j++){
        if(i==j || j+i==n+1){
            System.out.print("* ");                  // to draw diagonals of a square
        }else { System.out.print("  ");}
    }System.out.println();
  }*/
 /*for(int i=1; i<=n; i++){
    for(int k=1; k<= n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");              // to make a pyramid
    }
   for(int j=1; j<=i-1; j++){
        System.out.print("* ");
    }
    System.out.println();
}*/

/*  for(int i=n; i>=1; i--){
    for(int k=1; k<= n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");              // to make a  inverted pyramid
    }
   for(int j=1; j<=i-1; j++){
        System.out.print("* ");
    }
    System.out.println();
}*/
/*omiission
for(int i=2; i<=n; i++){
    for(int k=1; k<= n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");             
    }
   for(int j=2; j<=i && j<n; j++){
        System.out.print("* ");
    }
    System.out.println();
}*/
/*left rotated pyramid
for(int i=1; i<=n; i++){
    for(int k=1; k<= n-i; k++){
        System.out.print("   ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("*  ");
    } System.out.println();
}
for(int i=n-1; i>=1; i--){
    for(int k=1; k<= n-i; k++){
        System.out.print("   ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("*  ");
    } System.out.println();
}*/
/*for(int i=n; i>=1; i--){
    for(int k=1; k<= n-i; k++){
        System.out.print("       ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("*  ");
    } System.out.println();
}
for(int i=2; i<=n; i++){
    for(int k=1; k<= n-i; k++){
        System.out.print("       ");
    }
    for(int j=1; j<=i ; j++){
        System.out.print("*  ");
    } System.out.println();
}*/
for(int i=1; i<=n; i++){
    for (int j=1; j<=i; j++){
        System.out.print("* ");
    }System.out.println();
}
for(int i=1; i<=n; i++){
    // loops for spaces
    for(int k=1; k<= n-i; k++ ){     
        System.out.print("  ");
    }                                            
    for(int j=1; j<=i; j++ ){
        System.out.print("* ");
    } 
    System.out.println();}

} }
