package com.example.layui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.layui.entity.Product;
import com.example.layui.vo.ProductBarVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductMapper extends BaseMapper<Product> {

    // 返回一个VO的集合
    @Select("select p.name, sum(quantity) count  from order_detail od, product p where od.product_id = p.id GROUP BY product_id;")
    public List<ProductBarVO>  findAllProductBarVO();


}
