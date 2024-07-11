package Day1;

public class Operators {
    public static void main(String[] args) {
        // 1.ARITHEMATIC OPERATORS
        // +, -, /, *, %, ++, -- 
       // int a=2 , b=3;
       // a= a+b; //5
      // a++; ++a; --b; b--;

      // 2.COMPARISON OPERATORS
      // <,>, !=, ==, <=, >=

      //3.LOGICAL OPERATORS: &&, ||, !
      //EXAMPLE:
      //if(a>b || a<10);

      //4. ASSIGNMENT OPERATORS:
      //int x=2;
      //x+=3; // x=x+3

      // homework: bitwise operators: &=, |, ^, >>, <<, 
      // loops: for, while, do while

/*int sum=0;
for(int i= 1; i<=25; i++){
    sum=sum+i;
    System.out.print(sum+" , ");
}*/
int i=5;
while(i<15){
   if(i%2==0 && i%7==0)
        System.out.println(i);
   i++;
} 






    }
}
