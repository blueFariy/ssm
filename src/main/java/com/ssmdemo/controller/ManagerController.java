package com.ssmdemo.controller;

import com.ssmdemo.bean.Manager;
import com.ssmdemo.service.ManagersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
    @Autowired
    private ManagersService managersService;
    @RequestMapping("/Manager/Login")
    public String doLogin(){
        return "Manager_Login";
    }
    @RequestMapping("/Manager/LoginVerify")
    public String doLoginVerify(String mgrname,String mgrpwd){
        Manager manager = managersService.check(new Manager(mgrname,mgrpwd));
        if(manager==null){
            return "Manager_Login";
        }else{
            return "Manager_List";
        }
    }
}
