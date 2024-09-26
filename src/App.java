import java.time.LocalDateTime;
import  java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {


    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2008, 7,30, 3, 8, 0 );

        ZoneId timeZone1 = ZoneId.of("America/New_York");
        ZoneId timeZone2 = ZoneId.of("Europe/Paris");

        ZonedDateTime convertedBirthday = ZonedDateTime.of(birthday, timeZone1);
        ZonedDateTime birthdayEurope = convertedBirthday.withZoneSameInstant(timeZone2);

        System.out.println(convertedBirthday);
        System.out.println(birthdayEurope);


    }

}
