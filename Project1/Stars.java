public class Stars{ 
    public static void main(){

        System.out.println("\nPattern 1:\n");
        starPattern1();
        System.out.println("\nPattern 2:\n");
        starPattern2();
        System.out.println("\nPattern 3:\n");
        starPattern3();
        System.out.println("\nPattern 4:\n");
        starPattern4();

    }

    public static void starPattern1(){
        int amtStars;
        String star = ("**********");
        for (amtStars = 10; amtStars > 0; amtStars--) {

            System.out.println(star.substring(0, amtStars));

        }
    }   

    public static void starPattern2(){
        int amtStars;
        String star = ("**********");
        for (amtStars = 1; amtStars < 10; amtStars++) {

            System.out.println(star.substring(0, amtStars));

        }
    }

    public static void starPattern3(){
        int amtSpace;
        int amtStars;
        String star = ("**********");

        for (amtStars = 10; amtStars > 0; amtStars--) {
            for (amtSpace = -amtStars + 10; amtSpace > 0; amtSpace--) {

                System.out.print(" ");

            }
            for (int k = 1; k <= amtStars; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        
        System.out.println("\nOR\n");
        
        for (amtStars = 10; amtStars > 0; amtStars--) {
            for (amtSpace = -amtStars + 10; amtSpace > 0; amtSpace--) {

                System.out.print(" ");

            }
            for (int k = 1; k <= amtStars; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void starPattern4(){
        int amtSpace;
        int amtStars;
        int space;
        String star = ("**********");
        for (amtStars = 1; amtStars < 10; amtStars += 2) {

            for (amtSpace = -amtStars + 9; amtSpace >= 2; amtSpace -= 2) {

                System.out.print(" ");

            }

            System.out.print(star.substring(0, amtStars));
            System.out.println();

        }
        for (amtStars = 9; amtStars > 0; amtStars -= 2) {

            for (amtSpace = -amtStars + 9; amtSpace >= 2; amtSpace -= 2) {

                System.out.print(" ");

            }

            System.out.print(star.substring(0, amtStars));
            System.out.println();

        }
    }
}
