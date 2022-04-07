package backend.hera.controller.response;

import java.time.LocalDateTime;

public class TechOrderResponse {

    Integer orderID;
    String custFName;
    String custLName;
    String techFName;
    String techLName;
    String custAddress;
    String orderStartDate;
    String orderEndDate;
    String completed;
    String paid;

    public TechOrderResponse(Integer orderID, String custFName, String custLName, String techFName, String techLName,
                             String custAddress, String orderStartDate, String orderEndDate, String completed, String paid) {
        this.orderID = orderID;
        this.custFName = custFName;
        this.custLName = custLName;
        this.techFName = techFName;
        this.techLName = techLName;
        this.custAddress = custAddress;
        this.orderStartDate = orderStartDate;
        this.orderEndDate = orderEndDate;
        this.completed = completed;
        this.paid = paid;
    }

    public TechOrderResponse() {
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getCustFName() {
        return custFName;
    }

    public void setCustFName(String custFName) {
        this.custFName = custFName;
    }

    public String getCustLName() {
        return custLName;
    }

    public void setCustLName(String custLName) {
        this.custLName = custLName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getOrderStartDate() {
        return orderStartDate;
    }


    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
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

    public void setOrderStartDate(String orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public String getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(String orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }
}
