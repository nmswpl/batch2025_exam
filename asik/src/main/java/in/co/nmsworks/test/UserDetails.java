package in.co.nmsworks.test;

public class UserDetails
{
    private int id;
    private String name;
    private String gender;
    private String username;
    private String password;
    private String status;

    public UserDetails(int id, String name, String gender, String username, String password, String status)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
