package ru.mirea.lab4.Ex1;

public class Example {


    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.SUMMER;
        favoriteSeason(myFavoriteSeason);
        System.out.println(getDescription(myFavoriteSeason));
        for (Seasons season: Seasons.values()){
            System.out.println(season);
        }

    }

    public static void favoriteSeason(Seasons season) {
        switch (season) {
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
        }
    }

    public static String getDescription(Seasons season) {
        if (season == Seasons.SUMMER)
            return "Теплое время года, "  + "средняя температура " + season.getAverageTemperature() + "°C";
        else
            return season.getDescription();
    }
}
