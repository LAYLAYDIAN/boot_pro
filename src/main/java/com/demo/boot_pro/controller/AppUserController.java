package com.demo.boot_pro.controller;


import com.demo.boot_pro.common.vo.ResponseResult;
import com.demo.boot_pro.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-11-10
 */
@RestController
@RequestMapping("/basis/user")
public class AppUserController {

    @Autowired
    private IAppUserService iAppUserService;
    @RequestMapping("/getAll")
    public ResponseResult getAll(){
        ResponseResult responseResult =new ResponseResult<>();
        responseResult.setData(iAppUserService.list());
        return responseResult;
    }
}

