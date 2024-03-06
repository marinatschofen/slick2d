package at.sma.game.easygame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Shape;

public abstract class SpielObjekt {
    private int x;
    private int y;
    private int width;
    private int heigth;
    private Image image;
    private Shape shape;

    public SpielObjekt(int x, int y, Image image) {
        this.x = x;
        this.y = y;
        this.image = image;
        this.heigth = image.getHeight();
        this.width = image.getWidth();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public abstract Shape getShape();
    public abstract void draw(Graphics g);
    public abstract void update(int delta);


}
