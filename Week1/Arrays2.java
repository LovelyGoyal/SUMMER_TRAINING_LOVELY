package Week1;

import java.util.Scanner;
//import java.util.Arrays;                                    error
//int maximum= collection.max(Arrays.asList(arr))

public class Arrays2 {
   /*  //Arr function to find the sum of complete array
    public static int sum(int[] arr) {          
        int sum=0;
        for(int i=0; i<arr.length; i++ ){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {10, 1}; //new int[10];
    //arr[0]=10;
   // arr[1]=9;
   // arr[3]=110;
    System.out.println(sum(arr));
    }*/

    // to search an element in our array

    /*public static int searchElement(int arr[]) {
        int b=0;
        for(int i=0; i<arr.length; i++){
            if(b==arr[i]){
                return i;
        }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(searchElement(arr));
    }*/

    // to swap two numbers
   /*  public static void swap(int a, int b){
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a; int b;
        System.out.println("Values before swapping:");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        System.out.println("values after swapping:");
      // System.out.println(a+" "+b);
       swap(a, b);
    }*/
    //to create a function to reverse an array
    static void displayArray(int arr[]){
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+"  ");
    }

  /*   public static void change(int []arr, int i, int j) {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
        
    }

    static void reverseArray(int[] arr)
    {
        int i=0, j=arr.length-1;
        while(i<j){
            change(arr, i++, j--);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        displayArray(arr);
        
        
    }*/

    // find the maximum in an array
  /*  static int findmaxArray(int arr[]){
        int m=0;
        for(int i=0; i<arr.length; i++){
            if(m<arr[i]){
                m=arr[i];
            }
        }return m;
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(findmaxArray(arr));
       // displayArray(arr);
        
        
    }*/
// to reverse a particular part of array
    public static void change(int []arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
         
     }
 
     static void reverseArray(int[] arr, int i, int j)
     {
         //int i=1, j=arr.length-4;
         while(i<j){
             change(arr, i++, j--);
         }
         
     }
     public static void main(String[] args) {
        int arr[] = new int[8];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr, 2, 6);
        displayArray(arr);
        
        
    }

}

