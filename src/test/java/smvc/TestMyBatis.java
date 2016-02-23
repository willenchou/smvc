package smvc;

import javax.annotation.Resource;  
import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
import com.alibaba.fastjson.JSON;  
import com.test.model.UserInfo;  
import com.test.service.IUserInfoService;  


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })  
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);  
	
	 @Resource  
	 private IUserInfoService userinfoService = null;  
	 
	 @Test  
	    public void test1() {  
	        UserInfo userinfo = userinfoService.getUserInfoById((long) 1);  
	        logger.info(JSON.toJSONString(userinfo));  
	    }  
}
