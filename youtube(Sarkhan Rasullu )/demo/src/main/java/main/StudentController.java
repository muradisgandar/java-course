/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import main.entities.User;
import java.util.List;
import main.dto.UserDTO;
import main.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import main.services.UserServiceInter;
import org.springframework.beans.factory.annotation.Qualifier;
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
    User student() {
        return new User();
    }

    @Autowired
    @Qualifier("user123")
    User user;

    @GetMapping("/students")
    public String pageStudentAll(Model model) {
        System.out.println("user" + user);
        List<User> l = userService.getAll();

        model.addAttribute("studentList", convertToDTO(l));
//        if (l != null) {
//            throw new MyException("exception bash verdi");
//        }
        return "students";
    }

    @GetMapping("/students/test")
    public String test() {
        return "/test";
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

        System.out.println("id " + id);
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
