package at.sma.game.easygame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Shape;

public class MeinUfo extends SpielObjekt{
    public MeinUfo(int x, int y, Image image) {
        super(x, y, image);
    }

    @Override
    public Shape getShape() {
        return null;
    }

    @Override
    public void draw(Graphics g) {
        this.getImage().drawCentered(this.getX(),this.getY());
    }

    @Override
    public void update(int delta) {
        if (this.getY() >768) {
            this.setY(0-this.getX());
        }
        this.setY(this.getY()+8);
    }
}
