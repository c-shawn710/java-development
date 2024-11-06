package Generics_miniexercise;

import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> content;

    public Box(ArrayList<T> content) {
        this.content = content;
    }

    public ArrayList<T> getContent() {
        return content;
    }

    public void setContent(ArrayList<T> content) {
        this.content = content;
    }

    public void printContent() {
        System.out.println(content);
    }
}
