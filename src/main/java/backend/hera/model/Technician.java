package backend.hera.model;

import javax.persistence.*;

@Entity
@Table(name = "Technician")
public class Technician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "techID")
    private Integer techID;
    @Column(name = "techUName")
    private String techUName;
    @Column(name = "techFName")
    private String techFName;
    @Column(name = "techLName")
    private String techLName;
    @Column(name = "techPayment")
    private String techPayment;
    @Column(name = "techPassword")
    private String techPassword;
    @Column(name = "techAddress")
    private String techAddress;
    @Column(name = "techRating")
    private Integer techRating;
    @Column(name = "techPaymentRate")
    private Integer techPaymentRate;

    public Technician() {
    }

    public Technician(Integer techID, String techUName, String techFName, String techLName, String techPayment, String techPassword, String techAddress, Integer techRating, Integer techPaymentRate) {
        this.techID = techID;
        this.techUName = techUName;
        this.techFName = techFName;
        this.techLName = techLName;
        this.techPayment = techPayment;
        this.techPassword = techPassword;
        this.techAddress = techAddress;
        this.techRating = techRating;
        this.techPaymentRate = techPaymentRate;
    }

    public Integer getTechID() {
        return techID;
    }

    public void setTechID(Integer techID) {
        this.techID = techID;
    }
    
    public String getTechUserName() {
        return techUName;
    }

    public void setTechUName(String techUName) {
        this.techUName = techUName;
    }

    public String getTechFName() {
        return techFName;
    }

    public void setTechFName(String techFName) {
        this.techFName = techFName;
    }

    public String getTechLName() {
        return techLName;
    }

    public void setTechLName(String techLName) {
        this.techLName = techLName;
    }

    public String getTechPayment() {
        return techPayment;
    }

    public void setTechPayment(String techPayment) {
        this.techPayment = techPayment;
    }
    
    public String getTechPassword() {
        return techPassword;
    }

    public void setTechPassword(String techPassword) {
        this.techPassword = techPassword;
    }

    public String getTechAddress() {
        return techAddress;
    }

    public void setTechAddress(String techAddress) {
        this.techAddress = techAddress;
    }

    public Integer getTechRating() {
        return techRating;
    }

    public void setTechRating(Integer techRating) {
        this.techRating = techRating;
    }

    public Integer getTechPaymentRate() {
        return techPaymentRate;
    }

    public void setTechPaymentRate(Integer techPaymentRate) {
        this.techPaymentRate = techPaymentRate;
    }
}
