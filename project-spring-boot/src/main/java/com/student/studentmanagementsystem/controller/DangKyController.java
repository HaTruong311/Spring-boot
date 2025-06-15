package com.student.studentmanagementsystem.controller;

import com.student.studentmanagementsystem.Model.MonHoc;
import com.student.studentmanagementsystem.Model.SinhVien;
import com.student.studentmanagementsystem.service.DangKyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/dangky")
public class DangKyController {

    private DangKyService dangKyService;

    @PostMapping()
    public ResponseEntity<String> themSinhVienVaoMonHoc(int sinhVienId, int monHocId) {
        dangKyService.themSinhVienVaoMonHoc(sinhVienId, monHocId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<String> xoaSinhVienKhoiMonHoc(int sinhVienId, int monHocId) {
        dangKyService.xoaSinhVienKhoiMonHoc(sinhVienId, monHocId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{monHocId}")
    public ResponseEntity<List<SinhVien>> laySinhVienTrongMonHoc(@PathVariable int monHocId) {
        List<SinhVien> danhSach = dangKyService.layDanhSachSinhVienTrongMonHoc(monHocId);
        return new ResponseEntity<>(danhSach,HttpStatus.OK);
    }

    @GetMapping("/{sinhVienId}")
    public ResponseEntity<List<MonHoc>> layMonHocCuaSinhVien(@PathVariable int sinhVienId) {
        List<MonHoc> danhSach = dangKyService.layDanhSachMonHocCuaSinhVien(sinhVienId);
        return new ResponseEntity<>(danhSach,HttpStatus.OK);
    }
}

