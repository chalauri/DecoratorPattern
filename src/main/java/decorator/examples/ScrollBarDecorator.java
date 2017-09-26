package main.java.decorator.examples;

/**
 * Created by Chalauri-G on 9/26/2017.
 */
public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator(GraphicalComponent next) {
        super(next);
    }

    @Override
    public void paint() {
        System.out.println("Render The Scroll Bar ...");
        super.paint();
    }
}
