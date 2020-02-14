package com.alpha.work1a;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;
    public int getSpeed() {return speed;}
    public String getMac() {return mac;}
    public void setSpeed(int speed) {this.speed = speed;}
    public void setMac(String mac) {this.mac = mac;}
    public EthernetAdapter (String serialNumber, String manufacturer, double price, int speed, String mac) {
        super(serialNumber, manufacturer, price);
        setSpeed(speed);
        setMac(mac);
    }
    public EthernetAdapter () {
        this("", "", 0, 0, "");
    }
    @Override
    public String toString() {
        return "class=EthernetAdapter: serialNumber=" + this.getSerialNumber() +  ", manufacturer=" +
                this.getManufacturer() + ", price=" + this.getPrice() + ", speed=" + getSpeed() + ", mac=" + getMac();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true; }
        if (obj == null || getClass() != obj.getClass()) {return false;}
        EthernetAdapter e = (EthernetAdapter) obj;
        return getSerialNumber().equals(e.getSerialNumber()) && getManufacturer().equals(e.getManufacturer()) &&
                (getPrice() == e.getPrice()) && (speed == e.speed) && mac.equals(e.mac);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getSerialNumber().hashCode();
        result = 31 * result + getManufacturer().hashCode();
        result = 31 * result + ("" + getPrice()).hashCode();
        result = 31 * result + speed;
        result = 31 * result + mac.hashCode();
        return result;
    }
}
