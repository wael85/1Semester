import java.text.NumberFormat;

public class Time {
    private int hour;
    private int minute;
    private  int second;

    public Time(int hour , int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(int timeInSecond ){
        this.hour = (int)Math.floor(timeInSecond/3600);
        this.minute = (int) Math.floor((timeInSecond % 3600)/60);
        this.second = timeInSecond % 60;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public int getTimeInSecond(){
        return (hour*3600)+(minute*60)+second;
    }

    @Override
    public String toString() {
        return "Time is ("  +String.format("%02d",hour)+
                ":" + String.format("%02d",minute)+
                ":" + String.format("%02d",second)+")";
    }
}
