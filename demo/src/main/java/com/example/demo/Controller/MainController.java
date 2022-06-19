package com.example.demo.Controller;

import com.example.demo.Entities.Users;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private UserService userService;

    //    @GetMapping
//    public String getAllUsers(Model model) {
//       model.addAttribute("users",userService.getAllUsers());
//        return "index";
//    }
    @GetMapping
    public List<Users> allUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/user")
    public String addUser(@RequestBody Users users){
        userService.addUser(users);
        return "success";
    }
    @DeleteMapping(value = "/user/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "deleted";
    }
    @PutMapping(value = "/user/{id}")
    public ResponseEntity<Users> updateUser(@PathVariable (name = "id") Long id, @RequestBody Users user){
    Optional <Users> c = Optional.ofNullable(userService.getUserById(id));
    Users cN = new Users();
        if(c.isPresent()) {
            cN = c.get();
            cN.setId(user.getId());
            cN.setName(user.getName());
            cN.setEmail(user.getEmail());
        }
        final Users updatedUser = userService.updateUsers(cN);
        return ResponseEntity.ok(updatedUser);
    }

}
