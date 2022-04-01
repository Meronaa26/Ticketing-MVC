package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService extends CrudService<UserDTO ,String> {

    List<UserDTO>findManagers();

//    UserDTO save(UserDTO user);   this uncommented lines are defined in the crud that's why we extend that calse
//    UserDTO findById(String userName);
//    List<UserDTO> findAll();
//    void delete(UserDTO user);
//    void deleteById(String username);

}
