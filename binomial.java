//This program will find the Binomial coefficient:  (n!)/(k!( n-k)!)
import java.io.Console;
public class binomial {

static int factorial(int a){
int temp=1;
for(int i=1; i<=a; i++){
temp  = i*temp;
}
return temp;
}
public static void main(String[] args) {
Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter first number : "));
int k = Integer.parseInt(c.readLine("Enter second number : "));
int binomial;
binomial = (factorial(n))/(factorial(k)*factorial(n-k));
System.out.println("The output is : "+binomial);
}
}
