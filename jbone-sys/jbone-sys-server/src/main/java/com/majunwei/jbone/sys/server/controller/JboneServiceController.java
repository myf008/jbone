package com.majunwei.jbone.sys.server.controller;

import com.majunwei.jbone.sys.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("service")
public class JboneServiceController {
    @Autowired
    private SystemService systemService;

    @RequestMapping("getTheme")
    @ResponseBody
    public String getServiceTheme(@RequestParam("service")String service){
        return systemService.findServiceTheme(service);
    }
}
