package ru.mirea.lab4.Ex4;

public class Monitor {
    private Manufacturer monitor;
    private String size;

    public Monitor(Manufacturer monitor, String size){
        this.monitor = monitor;
        this.size = size;
    }

    public Manufacturer getMonitor() {
        return monitor;
    }

    public void setMonitor(Manufacturer monitor) {
        this.monitor = monitor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "{model: '" + monitor + '\'' +
                ", size: '" + size + '\'' +
                '}';
    }
}
