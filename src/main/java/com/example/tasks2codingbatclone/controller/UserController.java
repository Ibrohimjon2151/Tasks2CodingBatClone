package com.example.tasks2codingbatclone.controller;

import com.example.tasks2codingbatclone.entity.ApiResponce;
import com.example.tasks2codingbatclone.entity.User;
import com.example.tasks2codingbatclone.peliod.UserDTO;
import com.example.tasks2codingbatclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public HttpEntity<ApiResponce> addElement(@RequestBody UserDTO userDTO) {
        ApiResponce apiResponce = userService.addElement(userDTO);
        return ResponseEntity.status(apiResponce.isSuccess() ? HttpStatus.CREATED : HttpStatus.CONFLICT).body(apiResponce);
    }

    @GetMapping
    public HttpEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/{id}")
    public HttpEntity<?> getOne(@PathVariable Integer id) {
//        return ResponseEntity.status(categoryService.getOne(id).isSuccess()
//                ? HttpStatus.OK
//                : HttpStatus.NOT_FOUND)
//                .body(categoryService.getOne(id));
        return ResponseEntity.ok(userService.getById(id));
    }
    @PutMapping("/edit/{id}")
    public HttpEntity<?> edit(@PathVariable Integer id, @RequestBody UserDTO categoryDTO) {
        ApiResponce response = userService.update(id, categoryDTO);
        return ResponseEntity.status(response.isSuccess()
                ? HttpStatus.ACCEPTED
                : HttpStatus.CONFLICT).body(response);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> delete(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.deleteById(id));
    }


}
