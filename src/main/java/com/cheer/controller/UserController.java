package com.cheer.controller;

import com.cheer.domain.Emp;
import com.cheer.domain.User;
import com.cheer.dto.ResponseMessage;
import com.cheer.service.EmpService;
import com.cheer.service.UserService;
import com.cheer.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private  EmpService empService;


    ResponseMessage responseMessage;

    @ResponseBody
    @PostMapping("usernames")
    public ResponseMessage userNameCheck(String username){
        User user = userService.findUser(username);
        System.out.println(username);
        if(user==null){
            responseMessage=new ResponseMessage("0","用户名不存在");
        }else{
            responseMessage=new ResponseMessage("-1","用户名已经存在");
        }
        return responseMessage;
    }

    @GetMapping("regist")
    public String regist(){
        return "regist";
    }

    @PostMapping("regist")
    public  String regist(User user, MultipartFile upload, HttpServletRequest request) throws Exception {

        String pic_path=null;
        String originalFilename = upload.getOriginalFilename();
        if(upload!=null&&originalFilename!=null){
            pic_path= "c:/avatar/";
            String newFilename=user.getUsername()+originalFilename;
            System.out.println(newFilename);
            user.setAvatar(newFilename);
            File file=new File(pic_path,newFilename);
            upload.transferTo(file);
            userService.insertUser(user);
        }
        String realPath = request.getServletContext().getRealPath("/imgs");
        String dest = realPath + "/" + user.getAvatar();
        File avatar=new File(dest);
        if(!avatar.exists()){
            String src = pic_path + user.getAvatar();
            IOUtils.copy(src, dest);
        }

        return "login";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public String login(User user, HttpSession session, Model model){
        User users = userService.getUser(user.getUsername(), user.getPassword());
        System.out.println(users);
        if(users==null){
            return "login";
        }else{
            session.setAttribute("users",users);
            model.addAttribute("users",users);
            List<Emp> list = empService.getEmp();
            model.addAttribute("list",list);
            return "empList";
        }
    }

    @RequestMapping("test")
    public  String test(Model model){
        Emp emp = empService.findEmp(7788);
        model.addAttribute("emp",emp);
        return "test";
    }


}
