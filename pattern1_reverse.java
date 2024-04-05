// printing a simple pattern in java 
// ****
// ***
// **
// *

class pattern1_reverse{
    public static void main(String args[]){
        for(int line=4; line>=1; line--){
            for(int star=line; star>=1; star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}