package com.google.api.graphql.examples.model;

public class Books {
    private Integer id;

    private String author;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}