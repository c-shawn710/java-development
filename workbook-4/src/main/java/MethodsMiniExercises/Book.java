package MethodsMiniExercises;

import java.time.LocalDate;

public class Book {
    public String title;
    public String author;
    public double price;
    public int isbn;
    public boolean discount;

    public Book(String title, String author, double price, int isbn, boolean discount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.discount = discount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public void bookDetails(double percent, String startDate, String endDate) {
        double percentValue = percent * .01;
        double discountPrice;
        if (LocalDate.now().isAfter(LocalDate.parse(startDate)) && LocalDate.now().isBefore(LocalDate.parse(endDate)) || LocalDate.now().isEqual(LocalDate.parse(startDate)) || LocalDate.now().isEqual(LocalDate.parse(endDate))) {
            discountPrice = price - (price * percentValue);
            System.out.println("You are eligible for a " + percent + "% discount!\n Here's the final price: $ " + discountPrice);
        }
    }

    public String bookDetails() {
        String discountMessage = discount ? "20% Sale" : "Not on sale";
        double salePrice = 0;
            if(discount == true) {
                salePrice = price - (price * .2);
            }
        return "Title: " + title + "\nAuthor: " + author + "\nOriginal price: $" + price + "\nISBN: " + isbn + "\n" + discountMessage + "\nFinal price: $" + salePrice;
    }
}

