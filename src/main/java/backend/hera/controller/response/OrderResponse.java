package backend.hera.controller.response;

public class OrderResponse {
    private Integer id;
    private String orderDesc;
    private Double hours;
    private Integer paymentRate;
    private Double taxAmount;
    private Double amountToPay;

    public OrderResponse() {
    }

    public OrderResponse(Integer id, String orderDesc, Double hours, Integer paymentRate, Double taxAmount, Double amountToPay) {
        this.id = id;
        this.orderDesc = orderDesc;
        this.hours = hours;
        this.paymentRate = paymentRate;
        this.taxAmount = taxAmount;
        this.amountToPay = amountToPay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Integer getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(Integer paymentRate) {
        this.paymentRate = paymentRate;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxableAmount) {
        this.taxAmount = taxableAmount;
    }

    public Double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(Double amountToPay) {
        this.amountToPay = amountToPay;
    }
}
