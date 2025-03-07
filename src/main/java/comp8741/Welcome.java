package comp8741;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Stage-1
//        System.out.print("Enter the message: \n");
//        String input = scanner.nextLine();

//        System.out.println(input);
//  ==========================================================================#

//      Stage-2
//        System.out.print("Enter the message: \n");
//        String input = scanner.nextLine();

//        System.out.print("Enter the number of repetitions: \n");
//        int number = scanner.nextInt();
//        scanner.nextLine();

//        String str = "";
//        for(int i=0; i<number; i++) {
//            str =  str + input;
//        }
//        System.out.println(str);
//  ==========================================================================#

//      Stage-3
//        System.out.print("Enter the message: \n");
//        String input = scanner.nextLine();

//        System.out.print("Enter the number of repetitions: \n");
//        int number = scanner.nextInt();
//        scanner.nextLine();

//        String str = "";
//        for (int i=0; i<number; i++) {
//            for(int j=0; j<input.length(); j++) {
//
//                for(int k=0; k<input.length(); k++) {
//                    if(k!=j) {
//                        str = str + "_";
//                    } else {
//                        str = str + input.charAt(j);
//                    }
//                }
//                System.out.println(str);
//            }
//        }
//  ==========================================================================#

//      Stage-4
//        System.out.print("Enter the message: \n");
//        String input = scanner.nextLine();
//
//        System.out.print("Enter the number of repetitions: \n");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//
//        String str = "";
//        for (int i=0; i<(input.length() * number) + (number-1) + 2 + 2; i++) {
//            str = str + "+";
//        }
//
//        str = str + "\n";
//        for (int i=0; i<(input.length() * number) + (number-1) + 2 + 2; i++) {
//            if (i==0) {
//                str = str + "+";
//            }
//            else if (i==(input.length() * number) + (number-1) + 2 + 2 -1) {
//                str = str + "+";
//            } else {
//                str = str + " ";
//            }
//        }
//
//        // body
//        for (int i=0; i<input.length(); i++) {
//            str = str + "\n+ ";
//
//            for(int j=0; j<number; j++) {
//
//                for(int k=0; k<input.length(); k++) {
//                    if(k!=i) {
//                        str = str + "_";
//                    } else {
//                        str = str + input.charAt(i);
//                    }
//                }
//
//                if(j != number-1) {
//                    str = str + "|";
//                }
//            }
//
//            str = str + " +";
//        }
//        // body
//
//        str = str + "\n";
//        for (int i=0; i<(input.length() * number) + (number-1) + 2 + 2; i++) {
//            if (i==0) {
//                str = str + "+";
//            }
//            else if (i==(input.length() * number) + (number-1) + 2 + 2 -1) {
//                str = str + "+";
//            } else {
//                str = str + " ";
//            }
//        }
//
//        str = str + "\n";
//        for (int i=0; i<(input.length() * number) + (number-1) + 2 + 2; i++) {
//            str = str + "+";
//        }
//
//        System.out.println(str);
//  ==========================================================================#

//  Stage-5
        System.out.print("Enter the message:\n");
        String input = scanner.nextLine();
        try {
            if (input.isEmpty() || input.trim().isEmpty()) {
                throw new IllegalArgumentException("INPUT ERROR");
            }
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
            System.exit(1);
        }
//        String input = scanner.nextLine();
//        if (input.isEmpty() || input.trim().isEmpty()) {
//            System.out.println("INPUT ERROR");
//            System.exit(1);
//        }

        System.out.print("Enter the number of repetitions:\n");
        int number = scanner.nextInt();
        scanner.nextLine();
        try {
            if (number<=0) {
                throw new IllegalArgumentException("NUMBER ERROR");
            }
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
            System.exit(1);
        }
//        if (number<=0) {
//            System.out.println("NUMBER ERROR");
//            System.exit(1);
//        }

        System.out.print("Enter the fill character:\n");
        String fill = scanner.nextLine();
        try {
            if (fill.length()!=1) {
                throw new IllegalArgumentException("FILL ERROR");
            }
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
            System.exit(1);
        }
//        if (fill.length()!=1) {
//            System.out.println("FILL ERROR");
//            System.exit(1);
//        }

        System.out.print("Enter the border character:\n");
        String border = scanner.nextLine();
        try {
            if (border.length()!=1) {
                throw new IllegalArgumentException("BORDER ERROR");
            }
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
            System.exit(1);
        }
//        if (border.length()!=1) {
//            System.out.println("BORDER ERROR");
//            System.exit(1);
//        }

        System.out.print("Enter the separator character:\n");
        String separator = scanner.nextLine();
        try {
            if (separator.length()!=1) {
                throw new IllegalArgumentException("SEPARATOR ERROR");
            }
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
            System.exit(1);
        }
//        if (separator.length()!=1) {
//            System.out.println("SEPARATOR ERROR");
//            System.exit(1);
//        }

        // Body
        String str = "";
        for (int i=0; i<(input.length() * number) + (number-1) + 2 + 2; i++) {
            str = str + border;
        }

        str = str + "\n";
        for (int i=0; i<(input.length() * number) + (number-1) + 2 + 2; i++) {
            if (i==0) {
                str = str + border;
            }
            else if (i==(input.length() * number) + (number-1) + 2 + 2 -1) {
                str = str + border;
            } else {
                str = str + " ";
            }
        }

        // body
        for (int i=0; i<input.length(); i++) {
            str = str + "\n" + border + " ";

            for(int j=0; j<number; j++) {

                for(int k=0; k<input.length(); k++) {
                    if(k!=i) {
                        str = str + fill;
                    } else {
                        str = str + input.charAt(i);
                    }
                }

                if(j != number-1) {
                    str = str + separator;
                }
            }

            str = str + " " + border;
        }
        // body

        str = str + "\n";
        for (int i=0; i<(input.length() * number) + (number-1) + 2 + 2; i++) {
            if (i==0) {
                str = str + border;
            }
            else if (i==(input.length() * number) + (number-1) + 2 + 2 -1) {
                str = str + border;
            } else {
                str = str + " ";
            }
        }

        str = str + "\n";
        for (int i=0; i<(input.length() * number) + (number-1) + 2 + 2; i++) {
            str = str + border;
        }

        System.out.println(str);
    }
}