package at.sma.game.easygame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Crusher extends SpielObjekt{
    private Input input;
    private Rectangle shape;


    public Crusher(int x, int y, Image image, Input input) {
        super(x, y, image);
        this.input = input;
        shape = new Rectangle(x, y, image.getWidth(), image.getHeight());
    }

    @Override
    public Shape getShape() {
        return null;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public void update(int delta) {

    }
}
