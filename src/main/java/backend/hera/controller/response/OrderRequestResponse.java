package backend.hera.controller.response;

import java.time.LocalDateTime;

public class OrderRequestResponse {

    private Integer custID;
    private Integer techID;
    private String orderDesc;
    private String orderAddress;
    private LocalDateTime orderStartDate;

    public OrderRequestResponse() {

    }

    public OrderRequestResponse( Integer custID, Integer techID, String orderDesc, String orderAddress, LocalDateTime orderStartDate) {

        this.custID = custID;
        this.techID = techID;
        this.orderDesc = orderDesc;
        this.orderAddress = orderAddress;
        this.orderStartDate = orderStartDate;
    }






    public Integer getCustID() {
        return custID;
    }

    public void setCustID(Integer custID) {
        this.custID = custID;
    }

    public Integer getTechID() {
        return techID;
    }

    public void setTechID(Integer techID) {
        this.techID = techID;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public LocalDateTime getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(LocalDateTime orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

}
