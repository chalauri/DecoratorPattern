package main.java.decorator.examples;

/**
 * Created by Chalauri-G on 9/26/2017.
 */
public interface GraphicalComponent {

    void paint();
    GraphicalComponent addContent(Object content);

}
