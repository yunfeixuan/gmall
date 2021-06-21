package com.atguigu.gmall.gmallusermanage.ServiceImpl;

import com.atguigu.gmall.gmallusermanage.Service.UserMapper;
import com.atguigu.gmall.gmallusermanage.Service.UserService;
import com.atguigu.gmall.gmallusermanage.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoListAll() {
        List<UserInfo> userInfoList = userInfoMapper.selectAll();
        return userInfoList;
    }
    public UserInfo getUserInfo(String id){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        return userInfo;
    }


    @Override
    public void addUser(UserInfo userInfo) {

        userInfoMapper.insert(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);

    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userInfoMapper.updateByExample(userInfo,example);

    }

    @Override
    public void delUser(String id) {

    }


}

