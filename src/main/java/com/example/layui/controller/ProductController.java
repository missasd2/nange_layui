package com.example.layui.controller;

import com.example.layui.service.ProductService;
import com.example.layui.vo.BarVO;
import com.example.layui.vo.DataVO;
import com.example.layui.vo.PieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    @ResponseBody  // 这个注解让被注解的方法返回json数据
    public DataVO list(Integer page, Integer limit){

        return productService.findData(page, limit);
    }

    @RequestMapping("/{url}")
    public String redirect(@PathVariable("url") String url){
        return url;
    }

    @RequestMapping("/barVO")
    @ResponseBody
    public BarVO getBarVO(){
        return productService.getBarVO();

    }

    @RequestMapping("/pieVO")
    @ResponseBody
    public List<PieVO> getPieVO(){

        return productService.getPieVO();
    }


}
