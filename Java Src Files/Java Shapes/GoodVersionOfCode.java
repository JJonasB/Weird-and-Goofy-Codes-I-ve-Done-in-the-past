import java.util.Scanner;

public class GoodVersionOfCode {
    //todo: BORDER! I never got to finish this!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tryAgain;

        do {
            int menu = 0, base = 0;
            char symbol;

            System.out.println("Menu");
            System.out.println("1. Right sided triangle");
            System.out.println("2. Left sided triangle");
            System.out.println("3. Triangle");
            System.out.println("4. Inverted Triangle");
            System.out.println("5. Diamond");

            System.out.print("Enter a number:\t");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.print("Enter the base:\t");
                base = input.nextInt();
                System.out.print("Enter the symbol");
                symbol = input.next().charAt(0);

                for (int i = 0; i < base; i++) {
                    for (int j = 0; j < base - i - 1; j++) {
                        System.out.print("  "); //adding base
                    }
                    for (int k = 0; k <= i; k++) {
//                        System.out.print(i);
//                        System.out.print(base);
                        if (k == 0 || k == i) {
                            System.out.print(symbol + " ");
                        } else if (i == base - 1) {
                            System.out.print(symbol + " ");
                        } else {
                            System.out.print(k + 1 + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 2) {
                System.out.print("Enter the base:\t");
                base = input.nextInt();
                System.out.print("Enter the symbol:\t");
                symbol = input.next().charAt(0);

                for (int i = 0; i < base; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("");
                    }
                    for (int k = 0; k < base - i; k++) {
//        	  System.out.print( base - i - i);
                        if (k == 0 || k == base - i - 1) {
                            System.out.print(symbol + " ");
                        } else if (i == 0) {
                            System.out.print(symbol + " ");
                        } else {
                            System.out.print(k + 1 + " ");
                        }

                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.print("Enter the base:\t");
                base = input.nextInt();
                System.out.print("Enter the symbol:\t");
                symbol = input.next().charAt(0);

                for (int i = 0; i < base; i++) {
                    for (int j = 0; j < base - i - 1; j++) {
                        System.out.print(" "); //adding base
                    }
                    for (int k = 0; k <= i; k++) {
                        if (k == 0 || k == i) {
                            System.out.print(symbol + " ");
                        } else if (i == base - 1) {
                            System.out.print(symbol + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 4) {
                System.out.print("Enter the base:\t");
                base = input.nextInt();
                System.out.print("Enter the symbol:\t");
                symbol = input.next().charAt(0);

                for (int i = base - 1; i >= 0; i--) {
                    for (int j = 0; j < base - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        if (k == 0 || k == i) {
                            System.out.print(symbol + " ");
                        } else if (i == base -1) {
                            System.out.print(symbol + " ");
                        }else {
                            System.out.printf("%d ", k+1);
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 5) {
                System.out.print("Enter the base:\t");
                base = input.nextInt();


                for (int i = 0; i < base; i++) {
                    for (int j = 0; j < base - i - 1; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.printf("%4d", k);
                    }
                    System.out.println();
                }
                for (int i = base - 2; i >= 0; i--) {
                    for (int j = 0; j < base - i - 1; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.printf("%4d", k);
                    }
                    System.out.println();
                }

//            }else if (menu == 6) {
//                System.out.print("Enter the base:\t");
//                base = input.nextInt();
//
//                for (int i = 0; i < base; i++) {
//                    for (int j = 0; j < base - i - 1; j++) {
//                        System.out.print(" "); //adding base
//                    }
//                    for (int k = 0; k <= i; k++) {
//
//                        System.out.printf("*  ");
//
//                    }
//                    System.out.println();
//                } for (int i = base - 2; i >= 0; i--) {
//                    for (int j = 0; j < base - i - 1; j++) {
//                        System.out.print(" ");
//                    }
//                    for (int k = 0; k <= i; k++) {
//
//                        System.out.printf("*  ");
//
//                    }
//                    System.out.println();
//                }
            } else {
                System.out.println("Invalid input");
            }
            System.out.print("Would you like to try again?[Yes/No]\t");
            tryAgain = input.next();
        } while (tryAgain.equalsIgnoreCase("Yes") || tryAgain.equalsIgnoreCase("Y"));
        input.close();
    }
}