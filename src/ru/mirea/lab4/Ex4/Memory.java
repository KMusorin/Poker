package ru.mirea.lab4.Ex4;

public class Memory {
    private String type;
    private String volume;

    public Memory(String type, String volume) {
        this.type = type;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "{" + "type: '" + type + '\'' +
                ", volume: '" + volume + '\'' +
                '}';
    }
}