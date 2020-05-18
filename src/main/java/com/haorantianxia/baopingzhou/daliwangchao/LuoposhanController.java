package com.haorantianxia.baopingzhou.daliwangchao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuoposhanController {

    @RequestMapping("/getMasterOfMountain")
    public String getMasterOfMountain()
    {
        return "ChenPingAn";
    }

}
