package comp8741;
public class Square extends Figure{
    private int locationX;
    private int locationY;

    /**
     * Constructor.
     * @param x int value of x axis.
     * @param y int value of y axis.
     * @param length int value size of object.
     */
    public Square(int x, int y, int length){
        super(x, y, length);
    }

    /**
     * Function to move the object.
     * @param move int value number of space to move.
     * @param direction String value - u, d, l, r.
     */
    public void movePosition(int move, String direction) {
        if (move != 0) {
            if(direction.equals("u")) {
                locationX = this.x;
                locationY = this.y - move;
                setPosition(locationX, locationY);
            }
            if(direction.equals("d")) {
                locationX = this.x;
                locationY = this.y + move;
                setPosition(locationX, locationY);
            }
            if(direction.equals("l")) {
                locationX = this.x - move;
                locationY = this.y;
                setPosition(locationX, locationY);
            }
            if(direction.equals("r")) {
                locationX = this.x + move;
                locationY = this.y;
                setPosition(locationX, locationY);
            }
        }
    }

    /**
     * Create image on page.
     * @param p Page.
     */
    public void draw(Page p) {
        for (int xi = 0; xi < length; xi++)
            p.setPoint(xi +x,  y);
        for (int yi = 0; yi < length; yi++)
            p.setPoint(x, yi + y);
        for (int xi = 0; xi < length -1; xi++)
            p.setPoint(xi +x, length + y - 1);
        for (int yi = 0; yi < length; yi++)
            p.setPoint(length + x - 1, yi + y);
    }

}
