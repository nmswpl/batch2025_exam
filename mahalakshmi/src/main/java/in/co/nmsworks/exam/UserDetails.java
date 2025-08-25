package in.co.nmsworks.exam;

public class UserDetails {
    private String empid;
    private String name;
    private String gender;
    private String userName;
    private String password;
    private String accountStatus;

    public UserDetails(String empid, String name, String gender, String userName, String password, String accountStatus) {
        this.empid = empid;
        this.name = name;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.accountStatus = accountStatus;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "empid='" + empid + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}
