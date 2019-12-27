package com.stylefeng.guns.api;

public interface UserApi {

    int login(String username, String password); //返回个int，即userid

    boolean register(UserModel userModel);

    boolean checkUsername(String username);

    UserInfoModel getUserInfo(int uuid);

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);

}
