import java.io.Console;
public interface reverse_a_number {
    public static void main(String[] args) {
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter a number : "));
        int reverse=0, i;
        int a = num;
        while(a!=0){
            i = a%10;
            reverse = (reverse*10)+i;
            a = a/10;
        }
        System.out.print(reverse);
    }
}
