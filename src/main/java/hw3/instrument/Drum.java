package hw3.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drum implements Instrument{
    String size;
    public void play(){
        System.out.println("Drum is playing");
    }
}
