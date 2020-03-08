package app;

public class Date{
    private int year, month, day;

    // Los constructores no usan void
    public Date (int year, int month, int day){
        this.year= year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setYear(final int year){
        this.year = year;
    }
    public void setMonth(final int month){
        this.month = month;
    }
    public void setDay(final int day){
        this.day = day;
    }

    public String dateToString(){
        return String.format("%02d/%02d/%4d", day, month, year);
    }
    public void setDate(final int day, final int month, final int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}