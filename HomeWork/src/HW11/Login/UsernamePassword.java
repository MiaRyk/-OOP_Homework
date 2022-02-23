package HW11.Login;

public class UsernamePassword {
    private String login;
    private int password;
    private String correctLogin = "masha";
    private int correctPassword = 12345;

    public UsernamePassword(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public String getCorrectLogin() {
        return correctLogin;
    }

    public void setCorrectLogin(String correctLogin) {
        this.correctLogin = correctLogin;
    }

    public int getCorrectPassword() {
        return correctPassword;
    }

    public void setCorrectPassword(int correctPassword) {
        this.correctPassword = correctPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void check() {
        if (getLogin().equals(getCorrectLogin())) {
            System.out.println("Correct username");
        } else {
            System.out.println("Incorrect username");
            System.exit(0);
        }
        if (getPassword() == getCorrectPassword()) {
                System.out.println("Correct password");
            } else {
                System.out.println("Incorrect password");
                System.exit(0);
            }
        }

    }