package com.example.demo10.HW13;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
        System.out.println("Автор - " + warAndPeace.getAuthor().getName() + " "
                + warAndPeace.getAuthor().getSurname());
        System.out.println("Книга - " + warAndPeace.getBookName());
        System.out.println("Год выпуска - " + warAndPeace.getPublishingYear());
        System.out.println();

        Author aleksandrPushkin = new Author("Александр", "Пушкин");
        Book prophet = new Book("Пророк", aleksandrPushkin, 1828);
        Book prophet1 = new Book("Пророк", aleksandrPushkin, 1828);

        System.out.println("Автор - " + prophet.getAuthor().getName() + " "
                + prophet.getAuthor().getSurname());
        System.out.println("Книга - " + prophet.getBookName());
        System.out.println("Год выпуска - " + prophet.getPublishingYear());

        System.out.println(levTolstoy + " " + aleksandrPushkin);
        System.out.println();

        System.out.println(warAndPeace);
        System.out.println();

        System.out.println(prophet1.equals(prophet));
        System.out.println(prophet.hashCode());
        System.out.println(prophet1.hashCode());
        System.out.println(warAndPeace.hashCode());
    }
}