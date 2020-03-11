package com.codespace.task12;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    public static final int RECORDS_IN_BOOK = 10;
    private PhoneRecord[] phoneNumbers = new PhoneRecord[RECORDS_IN_BOOK];
    private int recordsCounter = 0;
    public void addPhoneNumber (String name, String phone) {
        if (recordsCounter < RECORDS_IN_BOOK) {
            this.phoneNumbers[recordsCounter] = new PhoneRecord(name, phone);
            recordsCounter++;
        }
        else System.out.println("Phone book is full");
    }
    public void printPhoneBook (PhoneRecord[] records) {
        int i = 1;
        for (PhoneRecord r : records) {
            if (r != null) {System.out.println("Cell #" + i + ": " + r);
                i++;
            }
            else break;
        }
    }
    public void printPhoneBook () {printPhoneBook(this.phoneNumbers);}
    public void sortByName() {
        PhoneRecord[] newRecords = Arrays.copyOf(phoneNumbers, recordsCounter);
        Arrays.sort(newRecords, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (((PhoneRecord)o1).getName()).compareTo(((PhoneRecord)o2).getName());
            }
        });
        printPhoneBook(newRecords);
    }
    public void sortByPhone() {
        PhoneRecord[] newRecords = Arrays.copyOf(phoneNumbers, recordsCounter);
        Arrays.sort(newRecords, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (((PhoneRecord)o1).getPhone()).compareTo(((PhoneRecord)o2).getPhone());
            }
        });
        printPhoneBook(newRecords);
    }
    class PhoneRecord {
        private String name;
        private String phone;
        public String getName() {return name;}
        public String getPhone() {return phone;}
        public void setName(String name) {this.name = name;}
        public void setPhone(String phone) {this.phone = phone;}

        @Override
        public String toString() {
            return "PhoneRecord{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
        public PhoneRecord(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
