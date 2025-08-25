package in.co.nmsworks.exam;

import java.util.Objects;

public class UserDetails {
    private int employeeId;
    private String name ;
    private String gender ;
    private String userName;
    private String password ;
    private String accountStatus;

    public UserDetails(int employeeId, String name, String gender, String userName, String password, String accountStatus) {
        this.employeeId = employeeId;
        this.name = name;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.accountStatus = accountStatus;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return employeeId == that.employeeId && Objects.equals(name, that.name) && Objects.equals(gender, that.gender) && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(accountStatus, that.accountStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, gender, userName, password, accountStatus);
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}
