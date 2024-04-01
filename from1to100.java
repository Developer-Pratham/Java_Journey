/*Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"*/

class from1to100{
public static void main(String args[]){
for(int num=1;num<=100;num++){
if (num%3==0 && num%5==0){
System.out.println("FizzBuzz");
}
if(num%3==0){
System.out.println("Fizz");
}
else if(num%5==0){
System.out.println("Buzz");
}
else{
System.out.println(num);
}
}
}
}