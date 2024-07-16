package Week1;

public class Sorting {
    static void displayArray(int arr[]){
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+"  ");
    }
    //increasing order
    public static void bubbleSort(int[] arr) {
        for(int turn=1; turn<arr.length; turn++){
            for(int i=0; i<arr.length; i++){
                if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1]; 
                arr[i+1]=temp;
            }}
        }
        
    }


    public static void main(String[] args) {
    int arr[] = {1,4,8,7,2,55};
    bubbleSort(arr);
    displayArray(arr);
    }
}
