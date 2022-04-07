package backend.hera.controller.response;

public class UserResponse {

    private Integer id;
    private String uName;
    private String fName;
    private String lName;
    private Integer techRating;

    public UserResponse() {
    }

    public UserResponse(Integer id, String uName, String fName, String lName, Integer techRating) {
        this.id = id;
        this.uName = uName;
        this.fName = fName;
        this.lName = lName;
        this.techRating = techRating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Integer getTechRating() {
        return techRating;
    }

    public void setTechRating(Integer techRating) {
        this.techRating = techRating;
    }
}
