import java.io.Console;

class reverse_string {
    public static void main(String args[]) {
        Console c = System.console();
        String str = c.readLine("Enter your string here : ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
