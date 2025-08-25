package in.co.nmsworks;
import java.util.Objects;

public class LoginCredential {
    private int Emp_id;
    private String Name;
    private String gender;
    private String userName;

    private String password;

    public LoginCredential(int emp_id, String name, String gender, String userName, String password, String acStatus) {
        Emp_id = emp_id;
        Name = name;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.acStatus = acStatus;
    }

    private String acStatus;

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAcStatus() {
        return acStatus;
    }

    public void setAcStatus(String acStatus) {
        this.acStatus = acStatus;
    }

    public LoginCredential(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginCredential() {

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LoginCredential that = (LoginCredential) o;
        return Objects.equals(userName, that.userName) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password);
    }

    @Override
    public String toString() {
        return "UserDetailsGet{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public boolean isUserNameValidOrNot(String userName,String password){

        if(getUserName()!=null&getPassword()!=null)
        {
            if(userName==getUserName()){
                if(true){
                    System.out.println("user Name and password is correct");
                }
                else {
                    System.out.println("Invalid username and password");
                }
            }

        }
            return true;


    }


}
