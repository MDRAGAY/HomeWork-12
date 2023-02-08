package com.example.demo10.HW12;

public class Main {

    public static void main(String[] args) {
            Author levTolstoy = new Author("Лев", "Толстой");
            Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
            System.out.println("Автор - " + levTolstoy.getAuthorName() + " " + levTolstoy.getAuthorSurname());
            System.out.println("Книга - " + warAndPeace.getBookName());
            System.out.println("Год выпуска - " + warAndPeace.getPublishingYear());
            System.out.println();

            Author aleksandrPushkin = new Author("Александр", "Пушкин");
            Book prophet = new Book("Пророк", aleksandrPushkin, 1828);
            System.out.println("Автор - " + aleksandrPushkin.getAuthorName() + " " + aleksandrPushkin.getAuthorSurname());
            System.out.println("Книга - " + prophet.getBookName());
            System.out.println("Год выпуска - " + prophet.getPublishingYear());
            prophet.setPublishingYear(1828);

        }
}
