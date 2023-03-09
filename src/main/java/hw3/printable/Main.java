package hw3.printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Printable> list = new ArrayList<Printable>();
        list.add(new Book("Harry Potter", 430));
        list.add(new Magazine("Fifa", 100));

        System.out.println(list);
    }
}
