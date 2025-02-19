import java.util.*;

public class SecondsToTime {
    private int hours, minutes, seconds;

    public SecondsToTime(int totalSeconds){
        this.hours = totalSeconds/3600;
        this.minutes = totalSeconds%3600/60;
        this.seconds = totalSeconds%60;
    }

    public String getFormattedTime(){
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalSeconds = sc.nextInt();
        SecondsToTime time = new SecondsToTime(totalSeconds);
        System.out.println(time.getFormattedTime());
        sc.close();
    }
}
