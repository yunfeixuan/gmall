package com.atguigu.gmall.gmallusermanage.Service;

import com.atguigu.gmall.gmallusermanage.pojo.UserInfo;
import org.apache.logging.log4j.message.StringFormattedMessage;

import java.util.List;

public interface UserService {
    List<UserInfo> getUserInfoListAll();
    void addUser(UserInfo userInfo);
    void updateUser(UserInfo userInfo);
    void updateUserByName(String name,UserInfo userInfo);
    void delUser(String id);
    UserInfo getUserInfo(String id);
}
