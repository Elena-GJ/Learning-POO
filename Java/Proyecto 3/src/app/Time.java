package app;
import java.util.Scanner;

public class Time{
    // Declare variables
    private int second = 0;
    private int minute = 0;
    private int hour = 0;
    Scanner input = new Scanner(System.in);
    
    // Constructor
    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    //Getters
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return minute;
    }

    // Setters
    public void setHour(int hour){
        while (hour > 23 || hour < 0){
            System.out.println("Introduzca una hora menor a 24 h: ");
            this.hour = input.nextInt();
        }
        this.hour = hour;
    }
    public void setMinute(int minute){
        while (minute > 60 || minute < 0){
            System.out.println("Introduzca un minuto menor a 60 min: ");
            this.minute = input.nextInt();
        }
        this.minute = minute;
    }
    public void setSecond(int second){
        while (second > 60 || second < 0){
            System.out.println("Introduzca un minuto menor a 60 min: ");
            this.second = input.nextInt();
        }
        this.second = second;
    }

    // To String method
    public String hourString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // setTime method
    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // nextSecond method
    public Time nextSecond(){
        this.second += 1;
        if(this.second == 60){
            this.second = 0;
            this.minute += 1;
            if(this.minute == 60){
                this.minute = 0;
                this.hour += 1;
                if(this.hour == 24){
                    this.hour = 0;
                }
            }
        }
        return this; // Maggia pura
    }
}