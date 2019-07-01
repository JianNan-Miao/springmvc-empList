package com.cheer.service.impl;

import com.cheer.config.AppConfig;
import com.cheer.domain.Emp;
import com.cheer.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class EmpServiceImplTest {
    @Autowired
   private EmpService empService;

    @Test
    public void getEmp() {
        List<Emp> empList = empService.getEmp();
        System.out.println(empList);
    }

    @Test
    public void deleteEmp() {
       empService.deleteEmp(9999);
    }
}