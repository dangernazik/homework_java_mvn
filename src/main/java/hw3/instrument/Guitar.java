package hw3.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument{
    int numberOfStrings;
    public void play(){
        System.out.println("Guitar is playing");
    }
}
