package in.co.nmsworks.test;

public class MovieJSON {

    private String name;
    private String genre;
    private int yearOfRelease;

    public MovieJSON(){}

    public MovieJSON(String name, int yearOfRelease, String genre){
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "MovieJSON{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
