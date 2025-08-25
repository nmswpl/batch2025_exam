package in.co.nmsworks.training_exam_2025;

public class UserDetails
{
    //emp_id         | varchar(50) | YES  |     | NULL    |       |
    //| name           | varchar(50) | YES  |     | NULL    |       |
    //| gender         | varchar(6)  | YES  |     | NULL    |       |
    //| username       | varchar(50) | YES  |     | NULL    |       |
    //| password       | varchar(50) | YES  |     | NULL    |       |
    //| account_status

    String emp_id, name, gender, username,password,account_status;


    public String getName() {
        return name;
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
