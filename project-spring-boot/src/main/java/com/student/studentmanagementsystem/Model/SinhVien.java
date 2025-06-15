package com.student.studentmanagementsystem.Model;

import java.util.List;

public class SinhVien {
    private long id;
    private String hoTen;
    private String maSo;
    private double diemTinHoc;
    private double diemGiaiTich;
    private double diemTheChat;
    private List<MonHoc> monHocList ;
    public SinhVien(long id, String hoTen, String maSo, double diemTinHoc, double diemGiaiTich, double diemTheChat, List<MonHoc> monHocList) {
        this.id = id;
        this.hoTen = hoTen;
        this.maSo = maSo;
        this.diemTinHoc = diemTinHoc;
        this.diemGiaiTich = diemGiaiTich;
        this.diemTheChat = diemTheChat;
        this.monHocList = monHocList;
    }
    public long getId() {
        return id;
    }
    public long setId(long id) {
        this.id = id;
        return id;
    }
    public String getHoTen() {
        return hoTen;
    }
    public String setHoTen(String hoTen) {
        this.hoTen = hoTen;
        return hoTen;
    }
    public String getMaSo() {
        return maSo;
    }
    public String setMaSo(String maSo) {
        this.maSo = maSo;
        return maSo;
    }
    public double getDiemTinHoc() {
        return diemTinHoc;
    }
    public double setDiemTinHoc(double diemTinHoc) {
        this.diemTinHoc = diemTinHoc;
        return diemTinHoc;
    }
    public double getDiemGiaitich() {
        return diemGiaiTich;
    }
    public double setDiemGiaitich(double diemGiaitich) {
        this.diemGiaiTich = diemGiaitich;
        return diemGiaitich;
    }
    public double getDiemTheChat() {
        return diemTheChat;
    }
    public double setDiemTheChat(double diemTheChat) {
        this.diemTheChat = diemTheChat;
        return diemTheChat;
    }
    public double diemTrungBinh(double diemTrungBinh) {
        return (diemTinHoc + diemGiaiTich + diemTheChat) / 3;
    }

    public  List<MonHoc> getMonHocList() {
        return monHocList;
    }
}
