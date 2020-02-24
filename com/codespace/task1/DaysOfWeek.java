package com.codespace.task1;

public enum DaysOfWeek {
    SUNDAY {public DaysOfWeek nextDay() {return DaysOfWeek.MONDAY;}},
    MONDAY {public DaysOfWeek nextDay() {return DaysOfWeek.TUESDAY;}},
    TUESDAY {public DaysOfWeek nextDay() {return DaysOfWeek.WEDNESDAY;}},
    WEDNESDAY {public DaysOfWeek nextDay() {return DaysOfWeek.THURSDAY;}},
    THURSDAY {public DaysOfWeek nextDay() {return DaysOfWeek.FRIDAY;}},
    FRIDAY {public DaysOfWeek nextDay() {return DaysOfWeek.SATURDAY;}},
    SATURDAY {public DaysOfWeek nextDay() {return DaysOfWeek.SUNDAY;}};
    abstract DaysOfWeek nextDay();
}
