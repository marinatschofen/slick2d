package mat.game.objects;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Crusher extends SpielObjekt{

    private Input input;
    private Rectangle shape;

    private float acceleration=0.01f;

    public Crusher (int x, int y, Image image, Input input){
        super (x, y, image);
        this.input = input;
        shape = new Rectangle(x, y, image.getWidth(), image.getHeight());
    }
    @Override
    public void draw (Graphics g) {
        this.getImage().drawCentered(this.getX(),this.getY());

    }

    @Override
    public Shape getShape() {
        return shape;
    }


    @Override
    public void update(int delta) {
        boolean pressed = false;

        if(input.isKeyDown(Input.KEY_A)) {
            // wenn x < 0 + 1/2 Objektgröße keine Veränderung von x mehr
            this.setX(this.getX() - (int)this.acceleration);
            if ((this.getX() < this.getWidth()/2)) this.setX(this.getWidth()/2);
            pressed = true;
        }
        if(input.isKeyDown(Input.KEY_D)){
            this.setX(this.getX() + (int)this.acceleration);
            if ((this.getX() > (1024 - this.getWidth()/2))) this.setX(1024 -this.getWidth()/2);
            pressed = true;
        }
        if (pressed){
            acceleration+= delta;
            if (acceleration > 10) acceleration=35;
        } else {
            acceleration = 1f;
        }
        shape.setCenterX(this.getX());
        shape.setCenterY(this.getY());
    }

    public boolean intersects(Shape shape){
        if (shape != null){
            return this.getShape().intersects(shape);
        }
        return false;
    }
}
