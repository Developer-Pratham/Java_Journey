// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *

public class pattern5 {
public static void main(String[] args) {
    for(int line=1; line<=5; line++){
        for(int star=1; star<=line; star++){
            System.out.print("*");
        }
        for(int space=line; space<=5; space++){
            System.out.print(" ");
        }
        for(int space=line; space<=5; space++){
            System.out.print(" ");
        }
        for(int star=1; star<=line; star++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int line=1; line<=5; line++){
        for(int star=line ;star<=5 ; star++){
            System.out.print("*");
        }
        for(int space=1; space<=line; space++){
            System.out.print(" ");
        }
        for(int space=1; space<=line; space++){
            System.out.print(" ");
        }
        for(int star=line; star<=5; star++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    
}
