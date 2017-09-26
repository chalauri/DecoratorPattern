package main.java.decorator.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chalauri-G on 9/26/2017.
 */
public class TextBox implements GraphicalComponent {

    private List<String> lines = new ArrayList<>();

    @Override
    public void paint() {
        System.out.println("Start Text Field ...");
        this.lines.stream().forEach(System.out::println);
        System.out.println("End Text Field ...");
    }

    @Override
    public GraphicalComponent addContent(Object content) {
        assert (content instanceof String);
        this.lines.add((String) content);
        if(this.lines.size() == 2 ){
            //Add scroll bar dec
            return new ScrollBarDecorator(this);
        }

        return this;
    }
}
