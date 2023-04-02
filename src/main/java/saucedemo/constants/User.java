package saucedemo.constants;

public enum User {

    STANDARD_USER("standard_user","secret_sauce"),
    LOCKEDOUT_USER("locked_out_user","secret_sauce"),
    PROBLEM_USER("problem_user","secret_sauce");

    private String username;
    private String password;

    User(String username, String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
