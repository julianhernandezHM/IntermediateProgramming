import java.awt.Graphics;
import java.awt.Color;

public class Paddle {

    // Fields - Class Variables
    int x;
    int y;

    static int width = 20;
    static int length = 100;

    // Constructor
    Paddle(int x, int y) {

    this.x = x;
    this.y = y;

    }

    /**
     * @param g
     */
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(this.x, this.y , width, length);

    }
}