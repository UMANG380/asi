package com.cg.archaeology.Archaeology.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel(description = "Represents an archaeological site of the system")
public class Archaeology {
    @ApiModelProperty(value = "The ID of the site", required = true)
    int id;
    @ApiModelProperty(value = "The name of the site", required = true)
    String name;
    @ApiModelProperty(value = "The description of the site", required = true)
    String desc;
    @ApiModelProperty(value = "The condition of the site", required = true)
    String condition;
    @ApiModelProperty(value = "The location of the site", required = true)
    String location;
    @ApiModelProperty(value = "The date of the discovery of site", required = true)
    Date date;

    public Archaeology(int id, String name, String desc, String condition, String location, Date date) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.condition = condition;
        this.location = location;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date =  date;
    }

    @Override
    public String toString() {
        return "Archaeology{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", condition='" + condition + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                '}';
    }
}
