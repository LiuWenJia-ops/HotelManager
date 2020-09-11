package entity;

import java.sql.Date;

// 入住订单
public class Bill {
    private int bill_id;
    private Date date_in;
    private int stay_time;
    private String room_type;
    private double bill_fee;
    private boolean charge_state;
    private int customer_id;
    private int hotel_id;

    public Bill(int bill_id, Date date_in, int stay_time, String room_type, double bill_fee, boolean charge_state, int customer_id, int hotel_id) {
        this.bill_id = bill_id;
        this.date_in = date_in;
        this.stay_time = stay_time;
        this.room_type = room_type;
        this.bill_fee = bill_fee;
        this.charge_state = charge_state;
        this.customer_id = customer_id;
        this.hotel_id = hotel_id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public Date getDate_in() {
        return date_in;
    }

    public void setDate_in(Date date_in) {
        this.date_in = date_in;
    }

    public int getStay_time() {
        return stay_time;
    }

    public void setStay_time(int stay_time) {
        this.stay_time = stay_time;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public double getBill_fee() {
        return bill_fee;
    }

    public void setBill_fee(double bill_fee) {
        this.bill_fee = bill_fee;
    }

    public boolean isCharge_state() {
        return charge_state;
    }

    public void setCharge_state(boolean charge_state) {
        this.charge_state = charge_state;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }
}
