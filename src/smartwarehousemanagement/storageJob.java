/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartwarehousemanagement;

/**
 *
 * @author NISHU JAYASUNDARA
 */
public class storageJob {
    
    private String userid;
    private  String name;
    private String productname;
    private String productcode;
    private String unit;
    private String date;
    private String duration;
    private String avalibility;

    public storageJob(String userid, String name, String productname, String productcode, String unit, String date, String duration, String avalibility){
        this.userid = userid;
        this.name = name;
        this.productname = productname;
        this.productcode = productcode;
        this.unit = unit;
        this.date = date;
        this.duration = duration;
        this.avalibility = avalibility;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAvalibility() {
        return avalibility;
    }

    public void setAvalibility(String avalibility) {
        this.avalibility = avalibility;
    }
}
