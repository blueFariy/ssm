package com.ssmdemo.service;

import com.ssmdemo.bean.Manager;
import com.ssmdemo.dao.ManagersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagersServiceImpl implements ManagersService{
    @Autowired
    private ManagersMapper managersMapper;
    @Override
    public List<Manager> getAll() {
        return managersMapper.getAll();
    }

    @Override
    public Manager check(Manager manager) {
        return managersMapper.check(manager);
    }

    @Override
    public Manager getById(int id) {
        return managersMapper.getById(id);
    }

    @Override
    public int insert(Manager manager) {
        return managersMapper.insert(manager);
    }

    @Override
    public int delete(int id) {
        return managersMapper.delete(id);
    }

    @Override
    public int update(Manager manager) {
        return managersMapper.update(manager);
    }
}
