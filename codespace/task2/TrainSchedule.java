package com.codespace.task2;

import com.codespace.task1.DaysOfWeek;

import java.util.Scanner;

public class TrainSchedule {
    private Train[] trains;
    private int trainCount = 0;
    public TrainSchedule(int trainCount) {
        this.trains = new Train[trainCount];
    }
    public boolean addTrain(Train newTrain) {
        if (this.trainCount == trains.length) {return false;}
        trains[this.trainCount] = newTrain;
        this.trainCount++;
        return true;
    }

    public boolean addTrain(int newTrainNumber) {
        if (this.trainCount == trains.length) {return false;}
        trains[this.trainCount] = new Train(newTrainNumber);
        this.trainCount++;
        return true;
    }

    public boolean checkNewTrain(int newTrainNumber) {
        if (newTrainNumber == 0) return false;
        if (this.trainCount == 0) return true;
        for (int i = 0; i <= this.trainCount; i++) {
           if (this.trains[i] != null && this.trains[i].getNumber() == newTrainNumber) return false;
        }
        return true;
    }
    public void printTrains() {
        for (int i = 0; i <= this.trainCount; i++) {
            if(trains[i] == null) break;
            System.out.println(trains[i]);
        }
    }
    public Train getTrain(int trainOrderNoInSchedule) {
        return trains[trainOrderNoInSchedule];
    }

    public void searchTrains(String stationArrival, DaysOfWeek day) {
        for (int i = 0; i <= this.trainCount; i++) {
            if(trains[i] == null) break;
            if (trains[i].getStationArrival().equals(stationArrival) && trains[i].getDays().equals(day)) System.out.println(trains[i]);
        }
    }
}
