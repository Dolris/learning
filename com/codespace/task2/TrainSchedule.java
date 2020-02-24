package com.codespace.task2;

import java.util.Scanner;

public class TrainSchedule {
    private Train[] trains;
    private int trainCount = 0;
    public TrainSchedule(int trainCount) {
        this.trains = new Train[trainCount];
        this.trainCount++;
    }
    public boolean addTrain(Train newTrain) {
        if (this.trainCount == trains.length) {return false;}
        trains[this.trainCount] = newTrain;
        return true;
    }
    public boolean checkNewTrain(int newTrainNumber) {
        if (newTrainNumber == 0) return false;
        for (int i = 0; i <= this.trainCount; i++) {
           if (this.trains[i].getNumber() == newTrainNumber) return false;
        }
        return true;
    }
    public void printTrains() {
        for (int i = 0; i <= this.trainCount; i++) {
            System.out.println(trains[i]);
        }
    }
}
