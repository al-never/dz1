package ru.alnever.dz1.db;

public class ProxyDatabase implements Database{
    private String url;
    private DatabaseImpl database;

    public ProxyDatabase(String url) {
        this.url = url;
    }
    @Override
    public void connect() {
        if(database == null) {
            database = new DatabaseImpl("Connecting to localhost:port/" + url);
        }
        database.connect();
    }
}
