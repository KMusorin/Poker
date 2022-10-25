package ru.mirea.lab4.Ex1;

public enum Seasons {

    SUMMER("Лето", 25),
    AUTUMN( "Осень",10),
    WINTER( "Зима",-10),
    SPRING("Весна",15);

    private final String title;
    private final int averageTemperature;

    Seasons(String title, int averageTemperature){
        this.title = title;
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }
    public String getDescription(){
        return "Холодное время года, " + "средняя температура " + getAverageTemperature() + "°C";
    }

    @Override
    public String toString() {
        return title + " averageTemperature = " + averageTemperature + " °C";
    }
}
