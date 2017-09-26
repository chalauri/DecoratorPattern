package main.java.decorator.examples;

/**
 * Created by Chalauri-G on 9/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        GraphicalComponent textBox = constuctSomeGCWithSomeText();
        //Add a border to text field here
        textBox = new BorderDecorator(textBox);
        textBox.paint();
    }

    public static GraphicalComponent constuctSomeGCWithSomeText() {
        GraphicalComponent textBox = new TextBox();
        textBox = textBox.addContent("Lay your sleeping head, my love,");
        textBox = textBox.addContent("Human on my faithless arm;");
        textBox = textBox.addContent("Time and fevers burn away");
        textBox = textBox.addContent("Individual beauty from");
        textBox = textBox.addContent("Thoughtful children, and the grave");
        textBox = textBox.addContent("Proves the child ephemeral:");

        return textBox;
    }
}
