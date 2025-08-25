package in.co.nmsworks.test;

public class UserDetails {
    String empId;
    String name;
    String gender;
    String userName;

    @Override
    public String toString() {
        return "UserDetails{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }

    public UserDetails(){

}

    public UserDetails(String empId, String name, String gender,String userName, String password, String accountStatus) {
        this.empId = empId;
        this.name = name;
        this.userName = userName;
        this.accountStatus = accountStatus;
        this.password = password;
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    String password;
    String accountStatus;

}
