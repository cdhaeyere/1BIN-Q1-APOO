import java.time.Duration;
import java.time.LocalDateTime;

public class TestAppel {

    public static void main(String[] args) {
        AppelTelephonique appel = new AppelTelephonique(LocalDateTime.now(), "02-733-45-80", Duration.ZERO);

        System.out.println(appel);
    }
}
