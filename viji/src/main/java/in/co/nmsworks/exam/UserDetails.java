package in.co.nmsworks.exam;

import java.util.Objects;

public class UserDetails {
    private String gender ;
    private String userName;
    private String password ;

    public UserDetails(String gender, String userName, String password) {
        this.gender = gender;
        this.userName = userName;
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "gender='" + gender + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
