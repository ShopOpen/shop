package com.chenfeng.app.shop.modul.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaochenfeng on 16/8/15.
 */
@RestController
public class TestController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
