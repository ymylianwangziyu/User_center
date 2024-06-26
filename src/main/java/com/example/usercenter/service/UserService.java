package com.example.usercenter.service;

import com.example.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * 用户服务
* @author lian
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-03-24 10:31:08
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param planetCode 星球编号
     * @return 新用户id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword,String planetCode);
    //接口中的方法默认都是public的

    /**
     * 用户登录
     *
     * @param userAccount 用户账户
     * @param userPassword    用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return 用户是否已经成功注销的标识位
     */
    int userLogout(HttpServletRequest request);
}
