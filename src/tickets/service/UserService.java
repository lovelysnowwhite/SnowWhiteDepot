
package tickets.service;

import tickets.property.User;
import tickets.dboperation.UserDao;

/**
 *
 * @author 94540
 */
public class UserService {
    

	private UserDao mUserDao;
	public UserService() {
		mUserDao=new UserDao();				
	}
	
	public User login(User user) {
		// TODO Auto-generated method stub
		return mUserDao.queryUser(user);
	}
    
	
	public int register(User user) {
		// TODO Auto-generated method stub
		User u = mUserDao.queryUserByName(user.getuName());
		if (u == null) {
			boolean res_add = mUserDao.addUser(user);
			if (res_add) {
				return 1;//注册成功
			} else {
				return 2;//注册失败
			}

		}
		return 3;//注册失败-用户名已存在
	}

	
	public User queryUserByName(String uName) {
		// TODO Auto-generated method stub
		return mUserDao.queryUserByName(uName);
	}
	
	public boolean updateUserPass(User user,String pass) {
		// TODO Auto-generated method stub
		return mUserDao.updateUserPass(user,pass);
	}
	
	public User queryUser(User user) {
		// TODO Auto-generated method stub
		return mUserDao.queryUser(user);
	}
	
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return mUserDao.updateUser(user);
	}
	
	public User queryUserByid(int uid) {
		// TODO Auto-generated method stub
		return mUserDao.queryUserByid(uid);
	}

}

