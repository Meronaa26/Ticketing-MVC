package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service     // when we creat bean from services instead of saying component we can say services
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {
    //first extend and then implement the interface
    // since i am implementing the interface i have to implement the methods


    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(), object);  //super keyword helps to call parent method on child
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void update(RoleDTO object) {
        super.update(object.getId(),object);
    }


    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }

}
