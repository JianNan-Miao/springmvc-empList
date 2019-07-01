package com.cheer.controller;

import com.cheer.domain.Emp;
import com.cheer.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("getEmplist")
    public String test(Model model){
        List<Emp> list= empService.getEmp();
        model.addAttribute("list",list);
        return "empList";
    }

    @RequestMapping("delete")
    public  String delete(String empno,Model model){
        int num = Integer.parseInt(empno);
        empService.deleteEmp(num);
        List<Emp> list= empService.getEmp();
        model.addAttribute("list",list);
        return  "empList";
    }

    @RequestMapping("update")
    public String update(String empno,Model model){
        Emp emp = empService.findEmp(Integer.parseInt(empno));
        model.addAttribute("emp",emp);
        return "update";
    }

    @PostMapping("updates")
    public String update1(Emp emp,Model model){
        System.out.println(emp);
        empService.updateEmp(emp);
        List<Emp> list= empService.getEmp();
        model.addAttribute("list",list);
        return  "empList";
    }
}
