package com.park.biz;

import com.park.DataSource.TargetDataSource;
import com.park.bean.Finger_userinfo;
import com.park.bean.Finger_userinfo_relation;
import com.park.bean.ReturnDataNew;
import com.park.bean.User_info;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peter Wu
 */
@Service
public class UserInfoBiz extends BaseBiz {


  /**
   * 获取用户信息
   * @throws Exception
   */
//  @TargetDataSource("slave")
  public User_info returnUserInfo() throws Exception {
//    System.out.println(getDB().getDs().determineCurrentLookupKey().toString());
    String sql = "select *  from user_info where ui_id=40 limit 1";
    User_info user_info = getDB().queryUniqueT(sql,User_info.class);
    log.info("this is my method telephone={}",user_info.ui_tel);
    return user_info;
  }
}
