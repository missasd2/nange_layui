package com.example.layui.service;

import com.example.layui.vo.BarVO;
import com.example.layui.vo.DataVO;
import com.example.layui.vo.ProductVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void findData() {
        // DataVO dataVO = productService.findData();
        // int i = 0;

    }

    @Test
    void test(){
        BarVO barVO = productService.getBarVO();
        int i = 0;
    }
}