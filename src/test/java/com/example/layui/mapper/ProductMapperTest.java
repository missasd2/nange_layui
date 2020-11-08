package com.example.layui.mapper;

import com.example.layui.vo.ProductBarVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ProductMapperTest {

    @Autowired
    ProductMapper productMapper;

    @Test
    public void test(){
        productMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void test2(){
        List<ProductBarVO> list = productMapper.findAllProductBarVO();
        int i = 0;
    }

}