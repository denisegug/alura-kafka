package br.com.alura.ecommerce;

public class User {

    public String getUuid() {
        return uuid;
    }

    private final String uuid;

    public User(String uuid) {
        this.uuid = uuid;
    }

    public String getReportPath() {
        return "target/" + uuid + "-report.txt";
    }
}
