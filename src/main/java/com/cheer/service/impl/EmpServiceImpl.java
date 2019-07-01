package com.cheer.service.impl;


import com.cheer.dao.EmpMapper;
import com.cheer.domain.Emp;
import com.cheer.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional // 声明事务 将该类下所有的公有方法都设置为事务方法
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;


    @Override
    public void deleteEmp(Integer empno) {
      empMapper.deleteEmp(empno);
    }

    @Override
    public void insertEmp(Emp emp) {

    }

    @Override
    public void updateEmp(Emp emp) {
         empMapper.updateEmp(emp);
    }

    @Override
    public Emp findEmp(Integer empno) {
        Emp emp = empMapper.findEmp(empno);
        return emp;
    }

    @Override
    public List<Emp> getEmp() {
        return empMapper.getEmp();
    }
}
