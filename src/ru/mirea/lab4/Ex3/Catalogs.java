package ru.mirea.lab4.Ex3;

public enum Catalogs {
    BAKERY("1. Выпечка"),
    MILK("2. Молочные продукты"),
    VEGETABLES("3. Овощи");

    private final String title;

    Catalogs(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Catalogs{" +
                "title='" + title + '\'' +
                '}';
    }

    public static String getCatalog() {
        System.out.println("Каталог товаров: ");
        String s = "";
        for (Catalogs catalog: Catalogs.values()){
            s = catalog.title;
            System.out.println(s);
        }
        return "";
    }
}
