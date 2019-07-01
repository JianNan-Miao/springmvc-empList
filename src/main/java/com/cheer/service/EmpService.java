package com.cheer.service;


import com.cheer.domain.Emp;

import java.util.List;

public interface EmpService {
    public void deleteEmp(Integer empno);

    public void insertEmp(Emp emp);

    public void updateEmp(Emp emp);

    public Emp findEmp(Integer empno);

    public List<Emp> getEmp();
}
