package com.student.studentmanagementsystem.service;
import com.student.studentmanagementsystem.Model.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {

    private List<SinhVien> danhSachSinhVien = new ArrayList<>();
    private int idTangDan = 1;

    public SinhVien createNewSinhVien(SinhVien sinhVien) {
        sinhVien.setId(idTangDan++);
        danhSachSinhVien.add(sinhVien);
        return sinhVien;
    }

    public SinhVien updateSinhVien(SinhVien sinhVien) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getId() == sinhVien.getId()) {
                danhSachSinhVien.set(i, sinhVien);
                return sinhVien;
            }
        }
        return null;
    }

    public List<SinhVien> getAllSinhVien() {
        return danhSachSinhVien;
    }

    public SinhVien getSinhVien(int id) {
        return danhSachSinhVien.stream()
                .filter(sv -> sv.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public SinhVien xoaSinhVien(int id) {
        SinhVien sv = getSinhVien(id);
        if (sv != null) {
            danhSachSinhVien.remove(sv);
        }
        return sv;
    }

}


