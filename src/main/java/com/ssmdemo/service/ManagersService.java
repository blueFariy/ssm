package com.ssmdemo.service;

import com.ssmdemo.bean.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagersService {
    List<Manager> getAll();
    Manager check(Manager manager);
    Manager getById(@Param("mgrid") int id);
    int insert(Manager manager);
    int delete(@Param("mgrid") int id);
    int update(Manager manager);
}
