package com.example.appbanmaytinh.computer;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "INFORKHACHHANG")
public class inforkhachhang {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String date;
    private String sdt;
    private String diachi;

    public inforkhachhang(String name, String date, String sdt, String diachi) {
        this.name = name;
        this.date = date;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
