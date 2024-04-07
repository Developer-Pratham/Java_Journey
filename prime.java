// This code will find if the given number by the user is prime or not

import java.io.Console;
public class prime {
    public static void main(String[] args) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter the number :"));
        int temp = 0;
        for(int i = 1; i<=num; i++){
            if(num%i==0){
                temp++;
            }
        }
        if (temp==2) {
            System.out.println("The number "+num+" is Prime");
        }
        else{
            System.out.println("The number "+num+" is consonant");
        }
    }
}
