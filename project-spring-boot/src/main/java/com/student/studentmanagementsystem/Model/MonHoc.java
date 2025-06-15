package com.student.studentmanagementsystem.Model;


import java.util.List;

public class MonHoc {
    private long id;
    private String tenMonHoc;
    private String maMonHoc;
    private int soTinChi;
    private List<SinhVien> sinhVienList;

    public MonHoc(long id, String tenMonHoc, String maMonHoc, int soTinChi, List<SinhVien> sinhVienList) {
        this.id = id;
        this.tenMonHoc = tenMonHoc;
        this.maMonHoc = maMonHoc;
        this.soTinChi = soTinChi;
        this.sinhVienList = sinhVienList;
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String gettenMonHoc() {
        return tenMonHoc;
    }
    public String getmaMonHoc() {
        return maMonHoc;
    }
    public int getSoTinChi() {
        return soTinChi;
    }
    public List<SinhVien> getDanhSachSinhVien() {
        return sinhVienList;
    }

    public List<SinhVien> getSinhVienList() {
        return sinhVienList;
    }
}
