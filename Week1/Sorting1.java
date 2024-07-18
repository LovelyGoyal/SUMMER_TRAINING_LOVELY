package Week1;
import java.util.Arrays;
import java.util.Collections;
public class Sorting1 {
    
    // bubble sort
    // find min value in an array
    // find index of min. value in an array
    // find index of min. value of a particular piece of array
    // selection sort
    // insertion sort
    // binary serach
    static void bubbleSort(int[] arr){
        for(int turn =1; turn<arr.length; turn++){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]= arr[i];
                }
            }
        }

    }
    static void selectionSort(int[]arr){
        for(int i=0; i<arr.length-1; i++){
            int idx= minValue(arr, i);
            int temp=arr[i];
            arr[i]= arr[idx];
            arr[idx]= temp;
        }

    }
    // to find the index of min. value in an array
    static int minValue(int[] arr, int a){
        int m=a;
        for(int i=1+a; i<arr.length; i++)
            if(arr[m]>arr[i])
             m=i;
             return m;
    }
    static void displayArray(int arr[]){
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+"  ");
    }
    
    // insertion sort
    static void insertionsort(int arr[]){
        int n= arr.length;
        for(int i=1; i<arr.length; i++){
            int key= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                --j;
            }
                arr[j+1]= key; 
        }
    }

    // binary serach
    /*static boolean binarySerach(int arr[], int key){
        int start=0, end = arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key)
                return true;
            if(arr[mid]>key)
                end= mid-1;
            else
                start=mid+1;
        }
        return false;
    }*/

    // to return the index of the binary serach
    static int binarySerach(int arr[], int key){
        int start=0, end = arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                end= mid-1;
            else
                start=mid+1;
        }
        
        return -1;
    }

    // lower bound t0 find the index
    static int lowerBound(int[] arr, int key){
        int start=0, end = arr.length-1; 
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }

            else if (arr[mid]>key)
                end = mid-1;
            
            else
                {start=mid+1;}
        }
       return ans;
    }
    
    // upper bound to find the position 
    static int upperBound(int[] arr, int key){
        int start=0, end = arr.length-1; 
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans=mid+1;
                start=mid+1;
            }
            else if (arr[mid]>key)
                end = mid-1;
            
            else
                {start=mid+1;}
        }
       return ans;
    }

    public static void main(String[] args) {
        // using collections
        /*Integer a[]= {11, 2, 3 , 5, 4};
        int min= Collections.min(Arrays.asList(a));
        System.out.println(min);*/
        // for sorting
        int arr[]= {1, 2, 4, 4, 4, 12, 23};
        //System.out.println(minValue(arr, 0));
        //bubbleSort(arr);
        //displayArray(arr);
        //System.out.println();
        Arrays.sort(arr);   // use to sort array : it uses quick sort and merge sort
        //selectionSort(arr);
        displayArray(arr);
        //System.out.println();
        //insertionsort(arr);
        //displayArray(arr);
        //System.out.println();
        //System.out.println(binarySerach(arr, 4));
        System.out.println();
        System.out.println(lowerBound(arr, 4));
        System.out.println(upperBound(arr, 4));
        

    }
}
