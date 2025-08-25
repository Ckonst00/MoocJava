package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter
        // book information and to examine them

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            bookCollection.add(new Book(title, pages, year));
        }
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();
        if (answer.equals("everything")) {
            for (Book book : bookCollection) {
                System.out.println(book);
            }
        } else if (answer.equals("name")) {
            for (Book book : bookCollection) {
                System.out.println(book.getTitle());
            }
        }
    }
}
