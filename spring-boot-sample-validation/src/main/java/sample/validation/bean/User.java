package sample.validation.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty(value = "UserName")
    private String userName;

    @JsonProperty(value = "Password")
    private String password;

    public String getUserName() {return userName;}

    public void setUserName( String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
