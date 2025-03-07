package comp8741;
public class LFrame {
    private Figure[] contents = new Figure[100];
    private int xLastLine = 0;
    private Page surface = new Page();

//  Stage - 3
    /**
     * Constructor.
     * @param width int value.
     * @param height int value.
     */
    public LFrame(int width, int height) {
        //surface = new Page();
        surface.resize(width, height);
    }

    /**
     * Adding lFrame to the picture.
     * @param l Figure
     */
    public void add(Figure l) {
        contents[xLastLine++] = l;
    }

    public void reverse() {
        surface.reverse();
    }

    public void resize(int width, int height) {
        surface.resize(width, height);
        paint();
    }

    /**
     * Creating vertical frame and picture.
     */
    public void paint() {
        surface.clear();
        for (int i = 0; i < xLastLine; i++)
            contents[i].draw(surface);
        surface.display();
    }

    /**
     * Creating horizontal frame and picture.
     */
    public void paintLandscape() {
        surface.clear();
        for (int i = 0; i < xLastLine; i++)
            contents[i].draw(surface);
        surface.displayLandscape();
    }

    /**
     * Creating vertical frame and moving picture.
     */
    public void paintTranslated() {
        surface.clear();
        for (int i = 0; i < xLastLine; i++)
            contents[i].draw(surface);
        surface.displayTranslated();
    }
}
