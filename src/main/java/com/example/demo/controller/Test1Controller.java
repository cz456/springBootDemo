package com.example.demo.controller;

import com.example.demo.entity.Test1;
import com.example.demo.service.Test1Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Test1)表控制层
 *
 * @author makejava
 * @since 2021-07-22 20:27:26
 */
@RestController
@RequestMapping("test1")
public class Test1Controller {
    /**
     * 服务对象
     */
    @Resource
    private Test1Service test1Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Test1 selectOne(Integer id) {
        return this.test1Service.queryById(id);
    }

}
