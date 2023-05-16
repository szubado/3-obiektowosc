package camp.model;

public class User {
    private String login;
    private String password;
    private String rola;

    public User(String login, String password, String rola) {
        this.login = login;
        this.password = password;
        this.rola = rola;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }
}
