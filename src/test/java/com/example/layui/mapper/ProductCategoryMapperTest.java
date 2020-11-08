package com.example.layui.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 根据传过来的category的id找名字
 */

@SpringBootTest
class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    void test(){
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("id", 655);
        System.out.println(mapper.selectOne(wrapper));
    }


}