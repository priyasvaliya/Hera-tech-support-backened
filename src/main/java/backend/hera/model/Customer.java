package backend.hera.model;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "custID")
    private Integer custID;
    @Column(name = "custUName")
    private String custUName;
    @Column(name = "custFName")
    private String custFName;
    @Column(name = "custLName")
    private String custLName;
    @Column(name = "custPayment")
    private String custPayment;
    @Column(name = "custAddress")
    private String custAddress;
    @Column(name = "custPassword")
    private String custPassword;
    @Column(name = "custRating")
    private Integer custRating;

    public Customer() {
    }

    public Customer(Integer custID, String custUName, String custFName, String custLName, String custPayment, String custAddress, String custPassword, Integer custRating) {
        this.custID = custID;
        this.custUName = custUName;
        this.custFName = custFName;
        this.custLName = custLName;
        this.custPayment = custPayment;
        this.custAddress = custAddress;
        this.custPassword = custPassword;
        this.custRating = custRating;
    }

    public Integer getcustID() {
        return custID;
    }

    public void setcustID(Integer custID) {
        this.custID = custID;
    }
    
    public String getcustUserName() {
        return custUName;
    }

    public void setcustUName(String custUName) {
        this.custUName = custUName;
    }

    public String getcustFName() {
        return custFName;
    }

    public void setcustFName(String custFName) {
        this.custFName = custFName;
    }

    public String getcustLName() {
        return custLName;
    }

    public void setcustLName(String custLName) {
        this.custLName = custLName;
    }

    public String getcustPayment() {
        return custPayment;
    }

    public void setcustPayment(String custPayment) {
        this.custPayment = custPayment;
    }

    public String getcustAddress() {
        return custAddress;
    }

    public void setcustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    
    public String getcustPassword() {
        return custPassword;
    }

    public void setcustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public Integer getcustRating() {
        return custRating;
    }

    public void setcustRating(Integer custRating) {
        this.custRating = custRating;
    }
}
