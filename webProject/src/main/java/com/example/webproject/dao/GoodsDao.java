package com.example.webproject.dao;

import com.example.webproject.bean.GoodsDo;
import com.mysql.cj.protocol.Resultset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 商品数据库访问接口
 */
@Repository // 标注数据访问组件
public interface GoodsDao {
    /**
     * 新增商品
     */
    public int insert(GoodsDo Goods);

    /**
     * 删除商品(根据id)
     */
    public int delete(Long id);

    /**
     * 修改商品信息(根据id修改其他属性值)
     */
    public int update(GoodsDo Goods);

    /**
     * 查询商品信息(根据id查询单个商品信息)
     */
    public GoodsDo selectOne(Long id);

    /**
     * 查询商品列表
     */
    public List<GoodsDo> selectAll();
}

