package com.example.mybatis.controller;

import com.example.mybatis.dto.UserDto;
import com.example.mybatis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/list")
    public List<UserDto> list() {
        return userService.getAllDataList();
    }

    @GetMapping("/if1")
    public List<UserDto> if1() {
        return userService.getAllDataListIf();
    }

    @GetMapping("/ifwhat")
    public List<UserDto> ifwhat(@RequestParam(required = true) String a ) {
        return userService.getAllDataListIfWhat(a);
    }

    @GetMapping("/foreach1")
    public List<UserDto> foreach1() {
        return userService.getAllDataListForeach();
    }

    @GetMapping("/foreachUnionAll")
    public List<UserDto> foreachUnionAll() {
        return userService.getDataListForeachUnionAll();
    }

}
