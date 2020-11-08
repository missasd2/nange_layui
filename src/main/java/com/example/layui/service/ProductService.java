package com.example.layui.service;

import com.example.layui.mapper.ProductMapper;
import com.example.layui.vo.BarVO;
import com.example.layui.vo.DataVO;
import com.example.layui.vo.PieVO;
import com.example.layui.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ProductService {

    public DataVO<ProductVO> findData(Integer page, Integer limit);

    // 将ProductBarVO 转成 BarVO
    public BarVO getBarVO();

    //
    List<PieVO> getPieVO();

}
