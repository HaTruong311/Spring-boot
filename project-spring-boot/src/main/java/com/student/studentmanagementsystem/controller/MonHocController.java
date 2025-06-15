package com.student.studentmanagementsystem.controller;

import com.student.studentmanagementsystem.Model.MonHoc;
import com.student.studentmanagementsystem.service.MonHocService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/monhoc")
public class MonHocController {
    private MonHocService monHocService;

    @PostMapping
    public ResponseEntity<MonHoc> createMonHoc(@RequestBody MonHoc monHoc) {
        MonHoc created = monHocService.createNewMonHoc(monHoc);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MonHoc>> getAllMonHoc() {
        List<MonHoc> list = monHocService.getAllMonHoc();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MonHoc> getMonHocById(@PathVariable int id) {
        MonHoc monHoc = monHocService.getMonHocById(id);
        return new ResponseEntity<>(monHoc, HttpStatus.OK);
    }

    @PutMapping("/id")
    public ResponseEntity<MonHoc> updateMonHoc(@RequestBody MonHoc monHoc) {
        MonHoc updated = monHocService.updateMonHoc(monHoc);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMonHoc(@PathVariable int id) {
        monHocService.deleteMonHoc(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
