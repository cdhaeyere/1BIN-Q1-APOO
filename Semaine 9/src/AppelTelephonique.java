import java.time.Duration;
import java.time.LocalDateTime;

public class AppelTelephonique {

    private LocalDateTime dateTime;
    private String number;
    private Duration duration;
    private double prixMinute;
    private static double defaultPrice = 0.15;

    public AppelTelephonique(LocalDateTime dateTime, String number, Duration duration, double prixMinute) {
        this.dateTime = dateTime;
        this.number = number;
        this.duration = duration;
        this.prixMinute = prixMinute;
    }

    public AppelTelephonique(LocalDateTime dateTime, String number, Duration duration) {
        this.dateTime = dateTime;
        this.number = number;
        this.duration = duration;
        this.prixMinute = defaultPrice;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getNumber() {
        return number;
    }

    public Duration getDuration() {
        return duration;
    }

    public double getPrixMinute() {
        return prixMinute;
    }

    public static double getDefaultPrice() {
        return defaultPrice;
    }

    public static void setDefaultPrice(double defaultPrice) {
        AppelTelephonique.defaultPrice = defaultPrice;
    }

    public double calculerCoutAppel() {
        return duration.getSeconds() / 60 * defaultPrice;
    }

    @Override
    public String toString() {
        return "AppelTelephonique{" +
                "dateTime=" + dateTime +
                ", number='" + number + '\'' +
                ", duration=" + duration +
                ", prixMinute=" + prixMinute +
                '}';
    }
}
