public class Regestration {

String login;
String password;
String confirmPassword;

    public Regestration(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static void userValidators (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length()>=20)
        {
            throw new WrongLoginException("login incorrect");
        }
        if (password.length()>=20)
        {
            throw new WrongPasswordException("password incorrect");
        }
        if (!password.equals(confirmPassword))
        {
            throw new WrongPasswordException("passwords do not match");
        }
        System.out.println("Login and password are correct");
    }
}
