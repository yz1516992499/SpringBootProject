package com.example.webproject.controller;

import com.example.webproject.bean.GoodsDo;
import com.example.webproject.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品控制器类
 */
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    /**
     * 按id获取商品信息
     */
    @GetMapping("/goods/{id}")
    public GoodsDo getOne(@PathVariable("id") long id) {
        return goodsService.getById(id);
    }
    /**
     * 获取商品列表
     */
    @GetMapping("/goods")
    public List<GoodsDo> getList() {
        return goodsService.getList();
    }
    /**
     * 新增商品
     */
    @PostMapping("/goods")
    public void add(@RequestBody GoodsDo goods) {
        goodsService.add(goods);
    }
    /**
     * 编辑商品
     */
    @PutMapping("/goods/{id}")
    public void update(@PathVariable("id") long id, @RequestBody GoodsDo goods) {
        // 修改指定id的博客信息
        goods.setId(id);
        goodsService.edit(goods);
    }
    /**
     * 移除商品
     */
    @DeleteMapping("/goods/{id}")
    public void delete(@PathVariable("id") long id) {
        goodsService.remove(id);
    }
}
