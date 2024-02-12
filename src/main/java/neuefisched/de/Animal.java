package neuefisched.de;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor

public class Animal {
    private LocalDate birthday;
    private String name;

}
