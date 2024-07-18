package Week1;


static int findminArray(int arr1[], int a){
    int m=a;
    for(int i=a+1; i<arr1.length; i++)
        if(arr1[m] >arr1[i])
            m=i;
            return m;
    
}
