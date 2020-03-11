package com.codespace.task3;

import com.codespace.task1.DaysOfWeek;
import com.codespace.task2.TrainSchedule;
import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner sc = new Scanner(System.in);
        TrainSchedule ts;
        int trainNum;
        int trainOrderNo = 0;
        System.out.print("Enter schedule size: " );
        ts = new TrainSchedule(sc.nextInt());
        while (true) {
            System.out.println("To stop just enter 0 for train number" );
            System.out.print("Enter train number: " );
            trainNum = sc.nextInt();
            if (trainNum == 0) {break;}
            else {
                if (ts.checkNewTrain(trainNum)) {
                    if (ts.addTrain(trainNum)) {
                        System.out.print("Enter train Station Dispatch: " );
                        ts.getTrain(trainOrderNo).setStationDispatch(sc.next());
                        System.out.print("Enter train Station Arrival: " );
                        ts.getTrain(trainOrderNo).setStationArrival(sc.next());
                        System.out.print("Enter train time Dispatch: " );
                        ts.getTrain(trainOrderNo).setTimeDispatch(sc.next());
                        System.out.print("Enter train time Arrival: " );
                        ts.getTrain(trainOrderNo).setTimeArrival(sc.next());
                        System.out.print("Enter train day: " );
                        ts.getTrain(trainOrderNo).setDays(DaysOfWeek.valueOf(sc.next().toUpperCase()));
                        trainOrderNo++;
                    }
                }
            }
        }
        ts.printTrains();
        System.out.print("Enter Station Arrival and day to search: " );
        ts.searchTrains(sc.next(), DaysOfWeek.valueOf(sc.next().toUpperCase()));
    }
}
