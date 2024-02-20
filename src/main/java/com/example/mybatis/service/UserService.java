package com.example.mybatis.service;

import com.example.mybatis.dao.UserMapper;
import com.example.mybatis.dto.UserDto;
import com.example.mybatis.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public List<UserDto> getAllDataList() {
        return userMapper.getAllDataList();
    }

    public List<UserDto> getAllDataListIf() {
        return userMapper.getDataListIf();
    }

    public List<UserDto> getAllDataListIfWhat(String a) {
        return userMapper.getDataListIfWhat(a);
    }

    public List<UserDto> getAllDataListForeach() {
        String[] aArray = {"1","3","5"};

        return userMapper.getDataListForeach(aArray);
    }

    public List<UserDto> getDataListForeachUnionAll() {
        List<User> aUserList = new ArrayList<>();
        aUserList.add(User.builder().id(1L).name("1").a("1").b("1").c("1").build());
        aUserList.add(User.builder().id(4L).name("4").a("4").b("4").c("4").build());

        return userMapper.getDataListForeachUnionAll(aUserList);
    }
}
