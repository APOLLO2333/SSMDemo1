package com.song.ssm.dao;

import com.song.ssm.bean.UserBean;

import java.util.List;

/**
 * Created by song2 on 2018/4/27.
 */
public interface UserDao {
    List<UserBean> selectAll();
    void insertOne(UserBean userBean);
    void updateOne(UserBean userBean);
    void deleteOne(int id);
    UserBean selectOne(int id);
}
