package com.codespace.task2;

import com.codespace.task1.DaysOfWeek;

public class Train {
    private int number;
    private String stationDispatch;
    private String stationArrival;
    private String timeDispatch;
    private String timeArrival;
    private DaysOfWeek days;

    public int getNumber() {return number;}
    public String getStationDispatch() {return stationDispatch;}
    public String getStationArrival() {return stationArrival;}
    public String getTimeDispatch() {return timeDispatch;}
    public String getTimeArrival() {return timeArrival;}
    public DaysOfWeek getDays() {return days;}
    public void setNumber(int number) {this.number = number;}
    public void setStationDispatch(String stationDispatch) {this.stationDispatch = stationDispatch;}
    public void setStationArrival(String stationArrival) {this.stationArrival = stationArrival;}
    public void setTimeDispatch(String timeDispatch) {this.timeDispatch = timeDispatch;}
    public void setTimeArrival(String timeArrival) {this.timeArrival = timeArrival;}
    public void setDays(DaysOfWeek days) {this.days = days;}
    public Train (int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", stationDispatch='" + stationDispatch + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                ", timeDispatch='" + timeDispatch + '\'' +
                ", timeArrival='" + timeArrival + '\'' +
                ", days=" + days +
                '}';
    }
}
