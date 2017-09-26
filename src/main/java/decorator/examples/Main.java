package main.java.decorator.examples;

/**
 * Created by Chalauri-G on 9/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        GraphicalComponent textBox = constuctSomeGCWithSomeText();
        textBox.paint();
    }

    public static GraphicalComponent constuctSomeGCWithSomeText() {
        GraphicalComponent textBox = new TextBox();
        textBox.addContent("Lay your sleeping head, my love,");
        textBox.addContent("Human on my faithless arm;");
        textBox.addContent("Time and fevers burn away");
        textBox.addContent("Individual beauty from");
        textBox.addContent("Thoughtful children, and the grave");
        textBox.addContent("Proves the child ephemeral:");

        return textBox;
    }
}
