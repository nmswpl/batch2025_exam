package in.co.nmsworks.test;

public class UserDetails {

    private String emp_id;
    private String name;
    private String gender;
    private String username;
    private String password;
    private String account_status;

    public UserDetails(){}

    public UserDetails(String emp_id, String name, String gender, String username, String password, String account_status){
        this.emp_id = emp_id;
        this.name = name;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.account_status = account_status;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    public String getAccount_status() {
        return account_status;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "emp_id='" + emp_id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", account_status='" + account_status + '\'' +
                '}';
    }
}
