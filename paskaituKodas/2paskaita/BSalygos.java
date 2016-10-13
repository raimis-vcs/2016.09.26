import java.util.Scanner;

public class BSalygos {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.println("Sveiki atvyke i VCS!!!");
        System.out.println("Iveskite skaiciu: ");
        int a = input.nextInt();

        /*
        * Sąlygos sakinys:
        *
        * if ([sąlyga]){
        *   [kūnas]
        * }
        *
        * if ([boolean value]){
        *   [body]
        * } else {
        *   [body]
        * }
        *
        * */
        if (a > 9){
            System.out.println("Ivestas ne vienazenklis skaicius");
        } else {

            /*
            *
            * Jungiklis (switch):
            * switch works with the byte, short, char, and int primitive data types. It also works with enumerated types.
            * switch ([variable]){
            *   case [value]: [body]
            *       break;
            *   case [another value]: [body]
            *   default: [body]
            * }
            *
            *
            * */
            switch (a){
                case 1: System.out.println("Ivestas vienetas");
                    break;
                case 2: System.out.println("Ivestas dvejetas");
                    break;
                case 3: System.out.println("Ivestas trejetas");
                    break;
                case 4: System.out.println("Ivestas ketvertas");
                    break;
                case 5: System.out.println("Ivestas penketas");
                    break;
                case 6: System.out.println("Ivestas sesetas");
                    break;
                case 7: System.out.println("Ivestas septynetas");
                    break;
                case 8: System.out.println("Ivestas astuonetas");
                    break;
                case 9: System.out.println("Ivestas devynetas");
                    break;
                case 0: System.out.println("Ivestas nulis");
                    break;
                default: System.out.println("Ivestas neigiamas skaicius");
            }
        }
    }
}
