package com.song.ssm.service;

import com.song.ssm.bean.UserBean;
import com.song.ssm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by song2 on 2018/4/27.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<UserBean> getAll(){
        return  userDao.selectAll();
    }
    public void insertOne(UserBean userBean){
        userDao.insertOne(userBean);
    }
    public void updateOne(UserBean userBean){
        userDao.updateOne(userBean);
    }
    public void deleteOne(int id){
        userDao.deleteOne(id);
    }
    public UserBean selectOne(int id){
        return userDao.selectOne(id);
    }
}
