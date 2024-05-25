package ru.alnever.dz1.db;

public class DatabaseImpl implements Database {
    private String url;

    public DatabaseImpl(String url) {
        this.url = url;
    }
    @Override
    public void connect() {
        System.out.println(url);
    }
}
