package com.f2m.model;

import java.sql.Date;

/**
 * Created by bakarali on 20/1/17.
 */
public class FarmerRegistration {

    
    private int farmerid;
    private String name;
    private String phoneNo ;
    private String password;
    private String address;
    private String cnfpassword;


    private int mediaId;
    private String type;
    private String imageUrl;
    private Date date;

    public int getFarmerid() {
        return farmerid;
    }

    public void setFarmerid(int farmerid) {
        this.farmerid = farmerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getCnfpassword() {
        return cnfpassword;
    }

    public void setCnfpassword(String cnfpassword) {
        this.cnfpassword = cnfpassword;
    }

    public int getMediaId() {
        return mediaId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
