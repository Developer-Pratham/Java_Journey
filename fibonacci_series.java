//print fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...

import java.io.Console;
class fibonacci_seires{
public static void main(String args[]){
int a=0, b=1, c=1;
Console d = System.console();	
int num = Integer.parseInt(d.readLine("Enter any number : "));
System.out.print(a+" "+b+" "+c+" ");
for(int i=1; i<=num-3; i++){
a=b;
b=c;
c=a+b;
System.out.print(c+" ");
}
}
}
