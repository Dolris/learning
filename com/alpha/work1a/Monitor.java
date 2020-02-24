package com.alpha.work1a;

public class Monitor extends Device {
    /*
    Добавьте в пакет work1 класс Monitor как подкласс Device. Класс Monitor
    содержит: поля resolutionX(int), resolutionY(int); конструктор; геттеры и
    сеттеры; метод toString() для представления объекта в виде "class=Monitor:
    serialNumber=AB1234567CD, manufacturer=Samsung, price=120.0, X=1280,
    Y=1024".
     */
    private int resolutionX;
    private int resolutionY;

    public int getResolutionX() {return resolutionX;}
    public int getResolutionY() {return resolutionY;}
    public void setResolutionX(int resolutionX) {this.resolutionX = resolutionX;}
    public void setResolutionY(int resolutionY) {this.resolutionY = resolutionY;}
    public Monitor (String serialNumber, String manufacturer, double price, int resolutionX, int resolutionY) {
        super(serialNumber, manufacturer, price);
        setResolutionX(resolutionX);
        setResolutionY(resolutionY);
    }
    public Monitor () {
        this("", "", 0, 0, 0);
    }
    @Override
    public String toString() {
        return super.toString() + ", X=" + getResolutionX() + ", Y=" + getResolutionY();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true; }
        if (obj == null || getClass() != obj.getClass()) {return false;}
        Monitor m = (Monitor) obj;
        return getSerialNumber().equals(m.getSerialNumber()) && getManufacturer().equals(m.getManufacturer()) &&
                (getPrice() == m.getPrice()) && (resolutionX == m.resolutionX) && (resolutionY == m.resolutionY);
    }

    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * 17 + getSerialNumber().hashCode()) + getManufacturer().hashCode()) +
                (int)Math.round(getPrice())) + resolutionX) + resolutionY;
    }
}
