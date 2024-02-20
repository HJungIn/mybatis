package com.example.mybatis.dao;

import com.example.mybatis.dto.UserDto;
import com.example.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<UserDto> getAllDataList();
    List<UserDto> getDataListIf();
    List<UserDto> getDataListIfWhat(String a);

    List<UserDto> getDataListForeach(String[] aArray);
    List<UserDto> getDataListForeachUnionAll(List<User> aUserList);
}
