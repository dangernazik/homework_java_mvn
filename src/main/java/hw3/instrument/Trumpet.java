package hw3.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trumpet implements Instrument{
    int diameter;
    public void play(){
        System.out.println("Trumpet is playing");
    }
}
