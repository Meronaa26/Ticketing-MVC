package com.cydeo.controller;

import com.cydeo.bootStrap.DataGenerator;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("roles",roleService.findAll());  // bring me all roles from roles(since that's a business logic it is coming from service 
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

@GetMapping("/update/{username}")
    public String editUser(@PathVariable("username") String username ,Model model){



         model.addAttribute("user",userService.findById(username));
         model.addAttribute("users",userService.findAll());
         model.addAttribute("roles",roleService.findAll());

        return "/user/update";
    }
    @PostMapping("/update/{username}")
    public String updateUser(@PathVariable("username")String username,UserDTO user){

                  userService.update(user);
          return "redirect:/user/create";
    }

    @GetMapping("/delete/{username}")
    public String deleteUser(@PathVariable("username")String username){
        //delete first
        userService.deleteById(username);
        return "redirect:/user/create";
    }
}
