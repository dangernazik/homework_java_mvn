package hw3.instrument;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<Instrument>();
        instruments.add(new Trumpet(12));
        instruments.add(new Drum("big"));
        instruments.add(new Guitar(6));

        for (Instrument instrument : instruments) {
            instrument.play();
            System.out.println(instrument);
            System.out.println("****");
        }
    }
}
