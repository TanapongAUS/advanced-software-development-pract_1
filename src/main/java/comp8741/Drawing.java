package comp8741;
import java.util.Scanner;

public class Drawing {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        === Stage-1 ===
//        VerticalLine line1 = new VerticalLine(10,5,6) ;
//        VerticalLine line2 = new VerticalLine(20,5,6) ;
//        LFrame lFrame = new LFrame() ;
//        lFrame.add(line1) ;
//        lFrame.add(line2) ;
//        lFrame.paint() ;

//        === Stage-2 ===
//        Scanner scanner = new Scanner(System.in);
//
//        LFrame lFrame = new LFrame();
//        int length;
//        do {
//            System.out.print("line length? \n");
//            length = scanner.nextInt();
//            scanner.nextLine();
//
//            if(length<=0) {
//                break;
//            }
//
//            System.out.print("x coordinate? \n");
//            int x_axis = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("y coordinate? \n");
//            int y_axis = scanner.nextInt();
//            scanner.nextLine();
//
//            VerticalLine line = new VerticalLine(x_axis,y_axis,length);
//            lFrame.add(line);
//        } while (length>0);
//
//        lFrame.paint();

//        === Stage-3 ===
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("frame width?\n");
//        int frameWidth = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("frame height?\n");
//        int frameHeight = scanner.nextInt();
//        scanner.nextLine();
//
//        LFrame lFrame = new LFrame(frameWidth,frameHeight);
//
//        int length;
//        do {
//            System.out.print("line length?\n");
//            length = scanner.nextInt();
//            scanner.nextLine();
//
//            if(length<=0) {
//                break;
//            }
//
//            System.out.print("x coordinate?\n");
//            int x_axis = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("y coordinate?\n");
//            int y_axis = scanner.nextInt();
//            scanner.nextLine();
//
//            VerticalLine line = new VerticalLine(x_axis,y_axis,length);
//            lFrame.add(line);
//        } while (length>0);
//
//        lFrame.paint();
//        lFrame.paintLandscape();

//        === Stage-4 ===
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("frame width?\n");
//        int frameWidth = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("frame height?\n");
//        int frameHeight = scanner.nextInt();
//        scanner.nextLine();
//
//        LFrame lFrame = new LFrame(frameWidth,frameHeight);
//
//        int length;
//        do {
//            System.out.print("line length?\n");
//            length = scanner.nextInt();
//            scanner.nextLine();
//
//            if(length<=0) {
//                break;
//            }
//
//            System.out.print("x coordinate?\n");
//            int x_axis = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("y coordinate?\n");
//            int y_axis = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("Type?\n");
//            String type = scanner.nextLine();
//
//            if (type.equals("h")) {
//                HorizontalLine line = new HorizontalLine(x_axis,y_axis,length);
//                lFrame.add(line);
//            }
//            else if (type.equals("v")) {
//                VerticalLine line = new VerticalLine(x_axis,y_axis,length);
//                lFrame.add(line);
//            }
//            else if (type.equals("s")) {
//                Square square = new Square(x_axis,y_axis,length);
//                lFrame.add(square);
//            }
//
//        } while (length>0);
//
//        lFrame.paint();
//        lFrame.paintLandscape();

//        === Stage-5 ===
        System.out.print("frame width?\n");
        int frameWidth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("frame height?\n");
        int frameHeight = scanner.nextInt();
        scanner.nextLine();

        LFrame lFrame = new LFrame(frameWidth,frameHeight);

        int length = 0;
        int scanLength;
        int x_axis = 0;
        int y_axis = 0;
        String type = "";
        do {
            System.out.print("line length?\n");
            scanLength = scanner.nextInt();
            scanner.nextLine();

            if(scanLength <= 0) {
                break;
            } else {
                length = scanLength;
            }

            System.out.print("x coordinate?\n");
            x_axis = scanner.nextInt();
            scanner.nextLine();

            System.out.print("y coordinate?\n");
            y_axis = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Type?\n");
            type = scanner.nextLine();

            if (type.equals("h")) {
                HorizontalLine horizontal = new HorizontalLine(x_axis,y_axis,length);
                lFrame.add(horizontal);
            }
            else if (type.equals("v")) {
                VerticalLine vertical = new VerticalLine(x_axis,y_axis,length);
                lFrame.add(vertical);
            }
            else if (type.equals("s")) {
                Square square = new Square(x_axis,y_axis,length);
                lFrame.add(square);
            }

        } while (length>0);

        lFrame.paint();
        lFrame.paintLandscape();

        // Create object
        Square square = new Square(x_axis,y_axis,length);
        VerticalLine vertical = new VerticalLine(x_axis,y_axis,length);
        HorizontalLine horizontal = new HorizontalLine(x_axis,y_axis,length);

        // Create frame
        LFrame moveFrame = new LFrame(frameWidth,frameHeight);

        // Move object
        int move;
        do{
            System.out.print("move size?\n");
            move = scanner.nextInt();
            scanner.nextLine();

            if(move <= 0) {
                break;
            }

            // Ask for direction
            System.out.print("direction?\n");
            String direction = scanner.nextLine();

            if (type.equals("s")) {
                if (direction.equals("u") || direction.equals("d") || direction.equals("l") || direction.equals("r")) {
                    square.movePosition(move, direction);
                    moveFrame.add(square);
                    moveFrame.paintTranslated();
                } else {
                    System.out.println("Invalid direction '" + direction + "'");
                }
            }
            else if (type.equals("v")) {
                if (direction.equals("u") || direction.equals("d") || direction.equals("l") || direction.equals("r")) {
                    vertical.movePosition(move, direction);
                    moveFrame.add(vertical);
                    moveFrame.paintTranslated();
                } else {
                    System.out.println("Invalid direction '" + direction + "'");
                }
            }
            else if (type.equals("h")) {
                if (direction.equals("u") || direction.equals("d") || direction.equals("l") || direction.equals("r")) {
                    horizontal.movePosition(move, direction);
                    moveFrame.add(horizontal);
                    moveFrame.paintTranslated();
                } else {
                    System.out.println("Invalid direction '" + direction + "'");
                }
            }
        } while(move > 0);

    }
}
