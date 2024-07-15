package Week0.Day2Assignment;

import java.util.Scanner;

public class Patternprinting {
    private static int l;

    /**
     * @param args
     */
    public static void main(String[] args) {
// taking input
    int n;
        System.out.print("enter the value: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

//Ques-1
System.out.print("Answer 1:\n");
for(int i=1; i<=n; i++){
    for(int j=1; j<=n; j++){
        System.out.print("* ");
    } 
    System.out.println();
}    

System.out.println();

//Ques-2
System.out.print("Answer 2:\n");
for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }System.out.println();
}

System.out.println();

//Ques-3
System.out.print("Answer 3:\n");
for(int i=n; i>=1; i--){
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }System.out.println();
}

System.out.println();

//Ques-4
System.out.print("Answer 4:\n");
for(int i=1; i<=n; i++){
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }System.out.println();
}

System.out.println();

//Ques-5
System.out.print("Answer 5:\n");
for(int i=n; i>=1; i--){
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }System.out.println();
}

System.out.println();

//Ques-6
System.out.print("Answer 6:\n");
for(int i=n; i>=1; i--){
    for(int k=1; k<=n-i; k++){
        System.out.print("     ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }System.out.println();
}

System.out.println();

//Ques-7
System.out.print("Answer 7:\n");
for(int i=1; i<=n; i++){
    for(int j=1; j<=n; j++){
        if(i==1 || i==n|| j==1 || j==n){
        System.out.print("* ");
    }
    else{
        System.out.print("  ");
    }    
    } 
    System.out.println();
}    

System.out.println();

//Ques-8
System.out.print("Answer 8:\n");
for(int i=1; i<=n; i++){
    for(int j=1; j<=n; j++){
        if(i==j || i+j==n+1){
        System.out.print("* ");
    }
    else{
        System.out.print("  ");
    }    
    } 
    System.out.println();
}    

System.out.println();

//Ques-9
System.out.print("Answer 9:\n");
for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        System.out.print("* ");
    }
    System.out.println();
}

System.out.println();

//Ques-10
System.out.print("Answer 10:\n");
for(int i=n; i>=1; i--){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        System.out.print("* ");
    }
    System.out.println();
}

System.out.println();

//Ques-11
System.out.print("Answer 11:\n");
for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        if((i%2==1 && j%2==0) || (i%2==0 && j%2==0)) {
            System.out.print("  ");
       }
     else{  System.out.print("* ");} 
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        if( (i%2==1 && j%2==1) || (i%2==0 && j%2==0)){
        System.out.print("  ");
   }
 else{  System.out.print("* ");} 
}
    System.out.println();
}

System.out.println();

//Ques-12
System.out.print("Answer 12:\n");
for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        if((i%2==1 && j%2==0) || (i%2==0 && j%2==0)) {
            System.out.print("! ");
       }
     else{  System.out.print("* ");} 
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        if( (i%2==1 && j%2==1) || (i%2==0 && j%2==0)){
        System.out.print("! ");
   }
 else{  System.out.print("* ");} 
}
    System.out.println();
}

System.out.println();

//Ques-13
System.out.print("Answer 13:\n");
//for 1st triangle
for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
         System.out.print("* ");}
        System.out.println(); }
    
   // for 2nd tringle
   for(int i=n-1; i>=1; i--){
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    } 
    System.out.println();
}

System.out.println();

//Ques-14
System.out.print("Answer 14:\n");
//for 1st triangle
for(int i=1; i<=n; i++){
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
         System.out.print("* ");}
        System.out.println(); }
    
   // for 2nd tringle
   for(int i=n-1; i>=1; i--){
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    } 
    System.out.println();
}

System.out.println();

//Ques-15
System.out.print("Answer 15:\n");
//for 1st triangle
   for(int i=n; i>=1; i--){
    for(int k=1; k<=n-i; k++){
        System.out.print("      ");
    }
    for(int j=1; j<=i; j++){ 
        System.out.print("* ");
    } 
    System.out.println();
}
//2nd tringle
for(int i=2; i<=n; i++){
    for(int k=1; k<=n-i; k++){
        System.out.print("      ");
    }
    for(int j=1; j<=i; j++){
         System.out.print("* ");}
        System.out.println(); }

System.out.println();

//Ques-16 
System.out.print("Answer 16:\n");
//for 1st triangle
   for(int i=n; i>=1; i--){
    for(int k=i; k>=1; k--){
       System.out.print("   ");
    }
    for(int j=1; j<=i; j++){ 
        System.out.print(" * ");
    } 
    System.out.println();}

//2nd tringle
for(int i=2; i<=n; i++){
    for(int k=1; k<=i; k++){
        System.out.print("   ");
    }
    for(int j=1; j<=i; j++){
         System.out.print(" * ");}
        System.out.println(); }

System.out.println();

// taking input
int n1;
System.out.print("enter the value: ");
Scanner sc1 = new Scanner(System.in);
n1= sc1.nextInt();

//Ques-17 
System.out.print("Answer 17:\n");
for (int i=n1-4; i>=1; i--){
    for (int j=1; j<=i; j++){
        System.out.print("* ");
}
for (int k=4; k<=n1-i; k++){
            System.out.print("  ");
}
for (int k=4; k<=n1-i; k++){
    System.out.print("  ");}
    for (int j=1; j<=i; j++){
                System.out.print("* ");
        }

System.out.println("");
}
System.out.println("");

for (int i=1; i<=n1-4; i++){
for (int j=1; j<=i; j++){
    System.out.print("* ");
}
for (int k=4; k<=n1-i; k++){
        System.out.print("  ");
}
for (int k=4; k<=n1-i; k++){
System.out.print("  ");}
for (int j=1; j<=i; j++){
            System.out.print("* ");
    }

System.out.println("");
}

System.out.println();

//Ques-18 
System.out.println("Answer 18:");
for (int i=1; i<=n1-4; i++){
    for(int k=1; k<=n1-i;k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }
    for(int j=1; j<=i-1; j++){
        System.out.print("* ");
    }
System.out.println();}

for(int i=n1-3; i>=1; i--){
    for(int k=1; k<=n1-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }
    for(int j=1; j<=i-1; j++){
        System.out.print("* ");
    }
System.out.println();
}    

System.out.println();

//Ques-19 unsolved
System.out.print("Answer 19:\n");
for(int i=n1-3;i>=1; i-- ){
    for(int j=1; j<=i; j++){
       System.out.print("* ");
    }
    
    for(int k=n1-i-3; k>=1; k--){
        System.out.print("  ");
    }

    for(int k=2; k<=n1-i-3;k++){
     System.out.print("  ");
   }

    for( int j=1; j<=i; j++){
        
        System.out.print("* ");}
        System.out.println();
}

for (int i=1; i<=n1-3; i++){
for (int j=1; j<=i; j++){
    System.out.print("* ");
}
for (int k=3; k<=n1-i; k++){
        System.out.print("  ");
}
for (int k=3; k<=n1-i; k++){
System.out.print("  ");}
for (int j=1; j<=i; j++){
            System.out.print("* ");
    }

System.out.println("");
}
 
System.out.println();

//Ques-20 unsolved
System.out.print("Answer 20:\n");
 // outer loop to handle upper part
     for (int i = 1; i <= n1; i++) {
   // inner loop to print spaces
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print("  ");
            }
            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (int i = n1-1; i >= 1; i--) {
            // inner loop to print spaces
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print("  ");
            }
            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    

System.out.println();

// taking input
int n2;
System.out.print("enter the value: ");
Scanner sc2 = new Scanner(System.in);
n2= sc2.nextInt();

//Ques-21 
System.out.print("Answer 21:\n");
for(int i=1;i<=n2; i++ ){
    for(int j=1; j<=i; j++){
       System.out.print("* ");
    }
    for(int k=2; k<=n2-i;k++){
        System.out.print("  ");
    }
    for(int k=1; k<=n2-i; k++){
        System.out.print("  ");
    }
    for( int j=1; j<=i; j++){
        
        if(j==n2){
            System.out.print("  ");
        }
     else{   System.out.print("* ");
    }}
       System.out.println();
}

System.out.println();

//Ques-22 unsolved
System.out.print("Answer 22:\n");
for(int i=n2;i>=1; i-- ){
    for(int j=1; j<=i; j++){
       System.out.print("* ");
    }
    
    for(int k=n2-i; k>=1; k--){
        System.out.print("  ");
    }

    for(int k=2; k<=n2-i;k++){
     System.out.print("  ");
   }

    for( int j=1; j<=i; j++){
        
        System.out.print("* ");}
        System.out.println();
}

System.out.println();

//Ques-23
System.out.print("Answer 23:\n");
for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print("1 ");
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        System.out.print("1 ");
    }
    System.out.println();
}

System.out.println();

//Ques-24
System.out.print("Answer 24:\n");
for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print(i+" ");
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        System.out.print(i+" ") ;
    }
    System.out.println();
}

System.out.println();

//Ques-25
System.out.print("Answer 25:\n");
int x=1;
for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("    ");
    }
    for(int j=1; j<=i; j++){
        System.out.print(x+ "   ");
        x++;
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        System.out.print(x+ "   ") ;
        x++;
    }
    System.out.println();
}

System.out.println();

//Ques-26 
System.out.print("Answer 26:\n");
for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print(j+ " ");
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        System.out.print(i+j+ " ");
    }
    System.out.println();
}

System.out.println();

//Ques-27 
System.out.print("Answer 27:\n");
for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        System.out.print(j+ " ");
    
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        System.out.print(j+ " ");

    }
    System.out.println();
}

System.out.println();

//Ques-28 unsolved
System.out.print("Answer 28:\n");

for(int i=1; i<=n; i++){
    //for 1st triangle
    for(int k=1; k<=n-i; k++){
        System.out.print(" ");
    }
    for(int j=1; j<=i; j++){
        System.out.print(i);
        
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
    System.out.print(j+1);
    }
    System.out.println();
}

System.out.println();

//Ques-29 
System.out.print("Answer 29:\n");
for(int i=1; i<=n2; i++){
    //for 1st triangle
    for(int k=1; k<=n2-i; k++){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
       if((i==1 ||  i==2 || i==3 || i==4 || i==5) && j==1)
        {System.out.print(i+"  ");
    }
else{ System.out.print("0  ");}
}

   // for 2nd tringle
    for(int j=1; j<=i-1; j++){
        if(i-1==j)
       { System.out.print(j+1);
    }
    else{
        System.out.print("0  ");
    }}
    System.out.println();
}

System.out.println();

//Ques-30 
System.out.print("Answer 30:\n");
for(int i=n2; i>=1; i--){
   
    for(int j=n2; j>=1; j--){
        System.out.print(j+" ");
         
    }
    System.out.println();
}

System.out.println();

//Ques-31 
System.out.print("Answer 31:\n");
for(int i=n2; i>=1; i--){
    for(int j=n2; j>=1; j--){
        if(i+j==n2+1){
            System.out.print("* ");
        }
     else{
        System.out.print(j+" ");
     }   
    }
    System.out.println();
}

System.out.println();

//Ques-32 
System.out.print("Answer 32:\n");
//for 1st triangle
for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
  if(j>1 && j<=n2)
  {System.out.print("* ");}
  System.out.print(i+"  ");}
        System.out.println(); }
    
   // for 2nd tringle
   for(int i=n-1; i>=1; i--){
    for(int j=1; j<=i; j++){  
     if(j>1 && j<n2)
     {   System.out.print("* ");}
     System.out.print(i+"  ");
    } 
    System.out.println();
}

System.out.println();

// taking input
int n3;
System.out.print("enter the value: ");
Scanner sc3 = new Scanner(System.in);
n3= sc3.nextInt();

//Ques-33 unsolved
System.out.print("Answer 33:\n");
for(int i=1; i<=n3; i++){
    int count= n3-i+1;
    //for 1st triangle
    for(int k=n3-i; k>=1; k--){
        System.out.print("  ");
    }
    for(int j=1; j<=i; j++){
        if(count==10){
        System.out.print("0 ");
    }
    else{System.out.print(count+" ");
count++;}
    }
   // for 2nd tringle
    for(int j=1; j<=i-1; j++){ count--;
        System.out.print(count+ " ");
       
    }
    System.out.println();
}

System.out.println();
}
}

