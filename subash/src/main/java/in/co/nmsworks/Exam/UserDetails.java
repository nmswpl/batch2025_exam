package in.co.nmsworks.Exam;

import javax.xml.transform.sax.SAXResult;

public class UserDetails
{

//    emp_id VARCHAR(50),
//    name VARCHAR(50),
//    gender VARCHAR(6),
//    username VARCHAR(50),
//    password VARCHAR(50),
//    account_status VARCHAR(9)

    private  String emp_id;
    private String name;
    private String gender;
    private String username;
    private String password;
    private String account_status;

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount_status() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    public UserDetails(String emp_id, String name, String gender, String username, String password, String account_status) {
        this.emp_id = emp_id;
        this.name = name;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.account_status = account_status;
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
