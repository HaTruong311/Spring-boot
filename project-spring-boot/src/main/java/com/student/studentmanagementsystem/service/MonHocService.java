package com.student.studentmanagementsystem.service;

import com.student.studentmanagementsystem.Model.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonHocService {

    private List<MonHoc> danhSachMonHoc = new ArrayList<>();
    private int idTangDan = 1;

    public MonHoc createNewMonHoc(MonHoc monHoc) {
        monHoc.setId(idTangDan++);
        danhSachMonHoc.add(monHoc);
        return monHoc;
    }

    public List<MonHoc> getAllMonHoc() {
        return danhSachMonHoc;
    }

    public MonHoc getMonHocById(int id) {
        return danhSachMonHoc.stream()
                .filter(mh -> mh.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public MonHoc updateMonHoc(MonHoc monHoc) {
        for (int i = 0; i < danhSachMonHoc.size(); i++) {
            if (danhSachMonHoc.get(i).getId() == monHoc.getId()) {
                danhSachMonHoc.set(i, monHoc);
                return monHoc;
            }
        }
        return null;
    }

    public void deleteMonHoc(int id) {
        danhSachMonHoc.removeIf(mh -> mh.getId() == id);
    }
}


