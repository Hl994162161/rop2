package cn.itheima.Service.Impl;

import cn.itheima.Service.UserService;
import cn.itheima.dao.UserDao;
import cn.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userservices")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User findById(int id) {
        return userDao.findById(id);
    }
}
