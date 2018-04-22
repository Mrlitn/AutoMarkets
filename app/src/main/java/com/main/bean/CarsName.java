package com.main.bean;

import java.util.List;
import java.util.Map;

public class CarsName {
    private String title;
    private List<Map<String, String>> car_item;

    public CarsName(String title, List<Map<String, String>> car_item) {
        this.title = title;
        this.car_item = car_item;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Map<String, String>> getCar_item() {
        return car_item;
    }

    public void setCar_item(List<Map<String, String>> car_item) {
        this.car_item = car_item;
    }

    @Override
    public String toString() {
        return "CarsName{" +
                "title='" + title + '\'' +
                ", car_item=" + car_item +
                '}';
    }

}
