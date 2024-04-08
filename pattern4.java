// Make the following pattern :
// * * * * * * * * * * * * * * * 
//  * * * * * * * * * * * * * 
//    * * * * * * * * * * * 
//      * * * * * * * * * 
//        * * * * * * * 
//          * * * * * 
//            * * * 
//              *
public class pattern4 {
    public static void main(String[] args) {
        for(int line=1; line<=8; line++){
            for(int space=1; space<=line; space++){
                System.out.print("  ");
            }
            for(int star=line; star<=8; star++){
                System.out.print("* ");
            }
            for(int stars=line; stars<8; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
