/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.main;

import com.example.main.dto.UserDTO;
import com.example.main.entities.User;
import com.example.main.services.UserServiceInter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author murad_isgandar
 */
@Controller
public class StudentController {

    @Autowired(required = true)
    UserServiceInter userService;

    @ModelAttribute("student")
    User student(){
        
        return new User();
    }
    
            
    @GetMapping("/students")
    public String pageStudentAll(Model model) {
        List<User> l = userService.getAll();

        model.addAttribute("studentList", convertToDTO(l));
        return "students";
    }
    
    
    @GetMapping("/students/test")
    public String test() {
        return "/test";
    }
    
    @GetMapping("/login")
    public String login() {
        return "myLoginPage";
    }

    @PostMapping("/students")
    public String pageAddStudent(@ModelAttribute("student") User u) {
        userService.addStudent(u);
        return "redirect:/students";
    }

    @RequestMapping("/students/search")
    public String searchStudents(@RequestParam(name = "nm", required = false) String name,
            @RequestParam(name = "surname", required = false) String surname,
            @RequestParam(name = "age", required = false) Integer age,
            Model model) {
        
        List<User> l = userService.getAllStudents(name, surname, age);

        model.addAttribute("studentList", convertToDTO(l));
        return "/students";
    }

    @RequestMapping("/students/{id}")
    public String searchStudentsById(
            @PathVariable(name = "id", required = false) Integer id,
            Model model) {

        System.out.println("id "+id);
        return "redirect:/students";
    }

    public static List<UserDTO> convertToDTO(List<User> l) {
        List<UserDTO> r = new ArrayList<>();
        if (l == null) {
            return r;
        }

        for (int i = 0; i < l.size(); i++) {
            User uu = l.get(i);
            r.add(new UserDTO(uu.getId(), uu.getName(), uu.getSurname(), uu.getUsername(), uu.getAge()));
        }

        return r;
    }

}
