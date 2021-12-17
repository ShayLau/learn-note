package com.copy;

/**
 * 订单信息
 *
 * @author  lemon
 */
public class Order implements  Cloneable{


    private  Integer  orderId;

    private Commodity commodity;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Order order=(Order)super.clone();
        order.setCommodity((Commodity) commodity.clone());
        return order;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", commodity=" + commodity +
                '}';
    }
}
