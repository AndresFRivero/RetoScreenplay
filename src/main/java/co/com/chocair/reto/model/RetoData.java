package co.com.chocair.reto.model;

public class RetoData {
    private String firstName;
    private String lastName;
    private String email;
    private String language;
    private String password;
    private String confirmPassword;
    private String messageConfirm;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getMessageConfirm() {
        return messageConfirm;
    }

    public void setMessageConfirm(String messageConfirm) {
        this.messageConfirm = messageConfirm;
    }
}

