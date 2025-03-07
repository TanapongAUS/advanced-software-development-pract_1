package comp8741;
public abstract class Figure {

    protected int x = 0;
    protected int y = 0;
    protected int length;

    /**
     * Figure constructor.
     * @param x int value of x axis.
     * @param y int value of y axis.
     * @param length int value size of object.
     */
    public Figure(int x, int y, int length) {
        setPosition(x, y);
        setLength(length);
    }

    /**
     * Set object position.
     * @param x int value of x axis.
     * @param y int value of y axis.
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Set object size.
     * @param length int value of x axis.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Create image on page.
     * @param p Page.
     */
    public abstract void draw(Page p);
}