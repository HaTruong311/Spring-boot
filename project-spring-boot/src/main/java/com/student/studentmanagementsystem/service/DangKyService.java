package com.student.studentmanagementsystem.service;

import com.student.studentmanagementsystem.Model.MonHoc;
import com.student.studentmanagementsystem.Model.SinhVien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DangKyService {

    private final SinhVienService sinhVienService;
    private final MonHocService monHocService;

    public DangKyService(SinhVienService sinhVienService, MonHocService monHocService) {
        this.sinhVienService = sinhVienService;
        this.monHocService = monHocService;
    }

    public void themSinhVienVaoMonHoc(int sinhVienId, int monHocId) {
        SinhVien sv = sinhVienService.getSinhVien(sinhVienId);
        MonHoc mh = monHocService.getMonHocById(monHocId);

        sv.getMonHocList().add(mh);
        sinhVienService.updateSinhVien(sv);
    }

    public void xoaSinhVienKhoiMonHoc(int sinhVienId, int monHocId) {
        SinhVien sv = sinhVienService.getSinhVien(sinhVienId);
        MonHoc mh = monHocService.getMonHocById(monHocId);

        sv.getMonHocList().remove(mh);
        sinhVienService.updateSinhVien(sv);
    }

    public List<SinhVien> layDanhSachSinhVienTrongMonHoc(int monHocId) {
        MonHoc mh = monHocService.getMonHocById(monHocId);
        return mh.getSinhVienList();
    }

    public List<MonHoc> layDanhSachMonHocCuaSinhVien(int sinhVienId) {
        SinhVien sv = sinhVienService.getSinhVien(sinhVienId);
        return sv.getMonHocList();
    }
}
