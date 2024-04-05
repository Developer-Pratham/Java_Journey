// print the following pattern
// A
// BC
// DEF
// GHIJ

class pattern3 {
    
    public static void main(String args[]) {
         String str = "ABCDEFGHIJ";
         int prabhuji = 0;
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(str.charAt(prabhuji));
                prabhuji++;
            }
            System.out.println();
        }
    }
}