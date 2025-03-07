package comp8741;
public class Page {
    private int width = 70;
    private int height = 20;

    private char background = ' ';
    private char foreground = '*';
    private char border = '+';
    private char[][] image = new char[width][height];

    /**
     * Make page empty.
     */
    public Page() {
        clear();
    }

    /**
     * Change background to foreground.
     */
    public void reverse() {
        char c = background;
        background = foreground;
        foreground = c;
    }

    /**
     * Resize background of the frame.
     * @param width int value.
     * @param height int value.
     */
    public void resize(int width, int height) {
        if (width > this.width || height > this.height) {
            image = new char[width][height];
            clear();
        }
        this.width = width;
        this.height = height;
    }

    /**
     * Clear all the picture.
     */
    public void clear() {
        for (int xi = 0; xi < width; xi++)
            for (int yi = 0; yi < height; yi++)
                image[xi][yi] = background;
    }

    /**
     * Set the coordinate of x and y.
     * @param x int value.
     * @param y int value.
     */
    public void setPoint(int x, int y) {
        if (0 <= x && x < width &&
                0 <= y && y < height)
            image[x][y] = foreground;
    }

    /**
     * Display image and background as vertical.
     */
    public void display() {
        for (int yi = 0; yi < height; yi++) {
            for (int xi = 0; xi < width; xi++) {
//              Stage-1
                if(xi == 0 || yi == 0 || xi == width - 1 || yi == height - 1) {
                    image[xi][yi] = border;
                }
                System.out.print(image[xi][yi]);
            }
            System.out.println();
        }
    }


    /**
     * Display image and background as horizontal.
     */
    //      Task 2 Stage 4
//    public void displayLandscape() {
//        // Transpose the image for landscape display
//        for (int yi = 0; yi < width; yi++) {
//            for (int xi = height - 1; xi >= 0; xi--) {
//                // Draw border
//                if (xi == 0 || yi == 0 || xi == height - 1 || yi == width - 1) {
//                    System.out.print(border);
//                } else {
//                    System.out.print(image[yi][xi]);//System.out.print(image[width - 1 - yi][xi]);
//                }
//
//            }
//            System.out.println();
//        }
//    }

    //      Task 2 Stage 5
    public void displayLandscape() {
        // Transpose the image for landscape display
        for (int yi = 0; yi < width; yi++) {
            for (int xi = 0; xi < height; xi++) {
                // Draw border
                if (xi == 0 || yi == 0 || xi == height - 1 || yi == width - 1) {
                    System.out.print(border);
                } else {
                    System.out.print(image[xi][yi]);
                }
            }
            System.out.println();
        }
    }

    //      Task 2 Stage 5
    /**
     * Display background and image that be able to move.
     */
    public void displayTranslated() {
        for (int yi = 0; yi < height; yi++) {
            for (int xi = 0; xi < width; xi++) {
                if(xi == 0 || yi == 0 || xi == width - 1 || yi == height - 1) {
                    if(image[xi][yi] != foreground){
                        image[xi][yi] = border;
                    }
                }
                System.out.print(image[xi][yi]);
            }
            System.out.println();
        }
    }

}
