package com.fire.store.domain;

public class Order {
    private String id;
    private int count;
    private double subtotal;
    //商品id
    private String itemId;
    //所属订单号
    private String orderId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", count=" + count +
                ", subtotal=" + subtotal +
                ", itemId='" + itemId + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
