package com.alpha.work1a;

public class Device {
    private String serialNumber;
    private String manufacturer;
    private double price;
    public String getSerialNumber() {return serialNumber;}
    public String getManufacturer() {return manufacturer;}
    public double getPrice() {return price;}
    public void setSerialNumber(String serialNumber) {this.serialNumber = serialNumber;}
    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}
    public void setPrice(double price) {this.price = price;}
    public Device(String serialNumber, String manufacturer, double price) {
        setSerialNumber(serialNumber);
        setManufacturer(manufacturer);
        setPrice(price);
    }
    public Device() {
        this("", "", 0);
    }
    @Override
    public String toString() {
        // "class=Device: serialNumber=AB1234567CD,
        //manufacturer=Samsung, price=120.0".
        return "class=Device: serialNumber=" + this.getSerialNumber() +  ", manufacturer=" + this.getManufacturer() +
                ", price=" + this.getPrice();
    }

}
