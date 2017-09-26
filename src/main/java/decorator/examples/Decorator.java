package main.java.decorator.examples;

/**
 * Created by Chalauri-G on 9/26/2017.
 */
public abstract class Decorator implements GraphicalComponent {

    private GraphicalComponent next;

    public Decorator(GraphicalComponent next) {
        this.next = next;
    }

    @Override
    public void paint() {
        this.next.paint();
    }

    @Override
    public GraphicalComponent addContent(Object content) {

        return this;
    }
}
