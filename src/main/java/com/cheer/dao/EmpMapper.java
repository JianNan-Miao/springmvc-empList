package com.cheer.dao;

import com.cheer.domain.Emp;


import java.util.List;


public interface EmpMapper {
    public void deleteEmp(Integer empno);

    public void insertEmp(Emp emp);

    public void updateEmp(Emp emp);

    public Emp findEmp(Integer empno);

    public List<Emp> getEmp();
}
