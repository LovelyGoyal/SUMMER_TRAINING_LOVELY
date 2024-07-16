package Week1.Day0;

import java.util.Scanner;


public class Arrays {
    /*public static void displayArray(int[] arr){
        //code for displaying the arr
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = new int [10];
        arr[1]= 10;
        arr[6]= 110;
        arr[9]= 101;
        
        displayArray(arr);
    }*/
   /*  public static boolean checkprime(int n)
    {
        for(int i=2; i<n; i++){
            if(n%i==0)
               return false;
        }
        return true;
    }

    public static void main(String[] args) {
       int n=991;
       System.out.println(n);
       System.out.println(checkprime(n));
    }*/

   // public static int reverseInteger(int n){
       
      // int temp=0;
      // while (n!=0) {
       //temp= temp*10 + n%10;
       //n/=10;}
      // return temp;

   /* X    for(int temp=0; n!=0; n/=10){
        temp= temp*10 + n%10;
       return temp;}
    }

    public static void main(String[] args) {
        int n = 1234;
        //Scanner sc= new Scanner(System.in);
        //n= sc.nextInt();
          System.out.println(reverseInteger(n));
          
}*/
public static int count(int n){
int  temp=0;
while(n!=0){
    temp=n%10;
n/=10;}

return temp;
} 

public static boolean armstrongNumber(int n)
{int temp=n;
    int d=count(n);
     int sum=0;
     while(n!=0){
        sum+=Math.pow((n%10),d);
        n/=10;
     }return(sum==temp);
}
public static void main(String[] args) {
    int n=71;
    System.out.println(armstrongNumber(n));
}
}
