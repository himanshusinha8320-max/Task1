import java.util.Scanner;
class SimpleCalculator{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter First Number: ");
double a=s.nextDouble();

System.out.println("Choose Your Operator: ");
char operator=s.next().charAt(0);
System.out.println("Enter Second Number: ");
double b=s.nextDouble();
double result=0;

switch(operator){
case'+':
result=a+b;
System.out.println("Result"+result);
break;

case'-':
result=a-b;
System.out.println("Result"+result);
break;

case'*':
result=a*b;
System.out.println("Result"+result);
break;

case'/':
if(b!=0){
result=a/b;
System.out.println("Result"+result);
}
else{
System.out.println("Division by Zero is Invalid..!!");
}
break;

default:
System.out.println("Please Choose a operator");
break;
}
s.close();
}
}