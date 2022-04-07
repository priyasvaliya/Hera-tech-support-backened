package backend.hera.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "techOrder")
public class TechOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private Integer orderID;
    @Column(name = "custID")
    private Integer custID;
    @Column(name = "techID")
    private Integer techID;
    @Column(name = "orderDesc")
    private String orderDesc;
    @Column(name = "orderStatus")
    private Boolean orderStatus;
    @Column(name = "orderStartDate")
    private LocalDateTime orderStartDate;
    @Column(name = "orderEndDate")
    private LocalDateTime orderEndDate;
    @Column(name = "orderPaid")
    private Boolean orderPaid;
    @Column(name = "orderAddress")
    private String orderAddress;

    public TechOrder() {
    }

    public TechOrder(Integer orderID, Integer custID, Integer techID, String orderDesc, Boolean orderStatus, LocalDateTime orderStartDate, LocalDateTime orderEndDate, Boolean orderPaid, String orderAddress) {
        this.orderID = orderID;
        this.custID = custID;
        this.techID = techID;
        this.orderDesc = orderDesc;
        this.orderStatus = orderStatus;
        this.orderStartDate = orderStartDate;
        this.orderEndDate = orderEndDate;
        this.orderPaid = orderPaid;
        this.orderAddress = orderAddress;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
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

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(LocalDateTime orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public LocalDateTime getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(LocalDateTime orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public Boolean getOrderPaid() {
        return orderPaid;
    }

    public void setOrderPaid(Boolean orderPaid) {
        this.orderPaid = orderPaid;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }
}
