package com.codespace.task3;

import com.codespace.task2.TrainSchedule;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        TrainSchedule ts;
        int trainNum;
        System.out.print("Enter schedule size: " );
        ts = new TrainSchedule(sc.nextInt());
        while (true) {
            input = sc.nextLine();
            if (input.equals("-")) {break;}
            else {
                System.out.print("Enter train number: " );
                trainNum = sc.nextInt();
                if (ts.checkNewTrain(trainNum)) {
                    if (ts.addTrain()) {
                        System.out.print("Enter train stationDispatch: ");
                    }
                }
            }
        }
    }
}
