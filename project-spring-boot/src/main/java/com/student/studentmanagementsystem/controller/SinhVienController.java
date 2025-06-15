package com.student.studentmanagementsystem.controller;

import com.student.studentmanagementsystem.Model.SinhVien;
import com.student.studentmanagementsystem.service.SinhVienService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/sinhvien")
public class SinhVienController {
    private SinhVienService sVS;
    @GetMapping
    public ResponseEntity<List<SinhVien>> getAllSinhVien() {
        List<SinhVien> tatCaSinhVien = sVS.getAllSinhVien();
        return new ResponseEntity<>(tatCaSinhVien, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SinhVien> getSinhVienById(@RequestParam int id) {
        SinhVien svCanTim = sVS.getSinhVien(id);
        return new ResponseEntity<>(svCanTim, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<SinhVien> createSinhVien(@RequestBody SinhVien sinhVien) {
        sVS.createNewSinhVien(sinhVien);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<SinhVien> updateSinhVien(@RequestBody SinhVien sinhVien){
        sVS.updateSinhVien(sinhVien);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<SinhVien> deleteSinhVien(@PathVariable int id) {
        sVS.xoaSinhVien(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
