package Model;

import java.util.Date;

public class Book2 {
    private int id;
    private String title;
    private String author;
    private boolean available;
    private Date registrationDate;
    private Date modifiedDate;

    public Book2(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
        this.registrationDate = new Date();
        this.modifiedDate = new Date();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        this.modifiedDate = new Date();
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", available=" + available + "]";
    }
}
