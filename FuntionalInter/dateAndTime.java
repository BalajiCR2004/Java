import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dateAndTime {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);

        LocalDateTime time1=LocalDateTime.now();
        System.out.println(time1);

        LocalDate time2=LocalDate.now();
        System.out.println(time2);
    }
}
