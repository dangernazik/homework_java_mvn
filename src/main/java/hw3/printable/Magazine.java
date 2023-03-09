package hw3.printable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{

    String title;
    int pages;

    public void print() {
        System.out.println("print magazine");
    }

}
