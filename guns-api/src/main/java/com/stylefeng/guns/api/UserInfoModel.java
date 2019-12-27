package com.stylefeng.guns.api;

import lombok.Data;

@Data
public class UserInfoModel extends UserModel{
    private Integer uuid;
    private String nickname;
    private Integer sex;
    private String birthday;
    private Integer lifeState; //生活状态
    private String biography; //个性签名
    private String headAddress; //头像地址url
    private long beginTime;
    private long updateTime;

}
