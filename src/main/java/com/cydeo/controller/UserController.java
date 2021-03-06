package com.cydeo.controller;

import com.cydeo.bootStrap.DataGenerator;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    RoleService roleService;
    UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("create")
    public String create(Model model){

        model.addAttribute("user",new UserDTO());
        model.addAttribute("roles",roleService.findAll());
        model.addAttribute("users",userService.findAll());
        return "user/create";
    }
    @PostMapping("create")
    public String insertUser(@ModelAttribute("user") UserDTO user, Model model){

       // model.addAttribute("user",new UserDTO()); // empty object need it after we save it==> we need an empty one after we saved it
       // model.addAttribute("roles",roleService.findAll());
        userService.save(user);
       // model.addAttribute("users",userService.findAll());  if we redirecting it we don't need the uncommented line anymore
        //return "/user/create";
        return "redirect:/user/create";
    }
}
