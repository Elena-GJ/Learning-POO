package app;
import java.util.Scanner;

public class Time {
    // Declare variables
    private int second = 0;
    private int minute = 0;
    private int hour = 0;
    Scanner input = new Scanner(System.in);

    // Constructor
    public Time() {
        this.setSecond();
        this.setMinute();
        this.setHour();
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setters
    public void setHour(){
        this.hour = -1;
        if(hour <= 23 && hour >= 0){
            ;
        } else {
            while (!(hour <= 23) | !(hour >= 0)){
                try{
                    System.out.println("Introduzca una hora válida: ");
                    this.hour = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Hora no válida.");
                }
            }
        }
    }

    public void setMinute() {
        this.minute = -1;
        if(minute <= 59 && minute >= 0){
            ;
        } else {
            while (!(minute <= 59) | !(minute >= 0)){
                try{
                    System.out.println("Introduzca unos minutos válidos: ");
                    this.minute = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Minutos no válidos.");
                }
            }
        }
    }

    public void setSecond() {
        this.second = -1;
        if(second <= 59 && second >= 0){
            ;
        } else {
            while (!(second <= 59) | !(second >= 0)){
                try{
                    System.out.println("Introduzca unos segundos válidos: ");
                    this.second = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Segundos no válidos.");
                }
            }
        }
    }

    // To String method
    public String hourString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // setTime method
    public void setTime() {
        setHour();
        setMinute();
        setSecond();
    }

    // nextSecond method
    public Time nextSecond() {
        this.second += 1;
        if (this.second == 60) {
            this.second = 0;
            this.minute += 1;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour += 1;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this; // Maggia pura
    }
}