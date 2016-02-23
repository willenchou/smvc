package com.test.service.impl;

import javax.annotation.Resource;  
import org.springframework.stereotype.Service;  
import com.test.model.UserInfo;  
import com.test.Dao.UserInfoMapper;  
import com.test.service.IUserInfoService; 

@Service("userinfoService") 
public class UserInfoServiceImpl implements IUserInfoService {
	@Resource  
    private UserInfoMapper userinfoDao;  
	
	@Override  
    public UserInfo getUserInfoById(long pos_int) {  
        return this.userinfoDao.selectByPrimaryKey(pos_int);  
    }  
}
