package com.example.demo10.HW13;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", 1867, levTolstoy);
        System.out.print("Автор - " + warAndPeace.getAuthor().getName() + " "
                + warAndPeace.getAuthor().getSurname() +
                "; Книга - " + warAndPeace.getBookName() +
                "; Год выпуска - " + warAndPeace.getPublishingYear());
        System.out.println();

        Author aleksandrPushkin = new Author("Александр", "Пушкин");
        Book prophet = new Book("Пророк", 1828, aleksandrPushkin);
        Book prophet1 = new Book("Пророк", 1828, aleksandrPushkin);


        System.out.println("Автор - " + prophet.getAuthor().getName() + " "
                + prophet.getAuthor().getSurname());
        System.out.println("Книга - " + prophet.getBookName());
        System.out.println("Год выпуска - " + prophet.getPublishingYear());

        prophet.setPublishingYear(1829);
        System.out.println("Год выпуска - " + prophet.getPublishingYear());

        System.out.println(warAndPeace);
        System.out.println();

        System.out.println(prophet1.equals(prophet));
        System.out.println(prophet.hashCode());
        System.out.println(prophet1.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println();

        System.out.println(levTolstoy + "; " + aleksandrPushkin);
        System.out.println(levTolstoy.equals(aleksandrPushkin));
        System.out.println(aleksandrPushkin.hashCode());
        System.out.println(levTolstoy.hashCode());

    }
}