// Find Age from a given date

package CodingQuestionsJava8;

import java.time.LocalDate;
import java.time.Period;

public class FindAge {
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.parse("1998-05-03");
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        System.out.println(age.getYears());
    }
}
