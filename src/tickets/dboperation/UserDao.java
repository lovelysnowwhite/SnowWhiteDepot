
package tickets.dboperation;
import tickets.dboperation.BaseDao;
import tickets.property.User;
import java.util.*;
/**
 *
 * @author 94540
 */
public class UserDao extends BaseDao{
    public boolean addUser(User user) {
		// TODO Auto-generated method stub
		if(user == null) {
			return false;
		}
		String sql="insert into user (uName,uPass,balance,uType) values(?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(user.getuName());
		params.add(user.getuPass());
		params.add(user.getBalance());
		params.add(user.getuType());
		return operUpdate(sql, params);
    }
    public boolean delUser(int uid) {
		// TODO Auto-generated method stub
		String sql="delete from user  where uId="+uid;
		
		return operUpdate(sql, null);
    }
    public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		String sql="update user set uName=?,uPass=?,balance=?,uType=? where uId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(user.getuName());
		params.add(user.getuPass());
		params.add(user.getBalance());
		params.add(user.getuType());
		params.add(user.getUid());
		return operUpdate(sql,params);
    }
    public User queryUser(User user) {
		// TODO Auto-generated method stub
		String sql = "select * from User where uName=? and uPass=? and uType=?";
		List<Object> params = new ArrayList<Object>();
		params.add(user.getuName());
		params.add(user.getuPass());
		params.add(user.getuType());
		List<User> list = null;
		try {
			list = operQuery(sql,params,User.class);			
			if(list.size() == 0){
				return null;
			}else{
				return list.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    public User queryUserByName(String uName) {
		// TODO Auto-generated method stub
		String sql = "select uId from User where uName=? ";
		List<Object> params = new ArrayList<Object>();
		params.add(uName);
		List<User> list = null;
		try {
			list = operQuery(sql,params,User.class);

			if(list.size() == 0){
				return null;
			}else{
				return list.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
    }
    public boolean updateUserPass(User user,String pass) {
		// TODO Auto-generated method stub
		String sql="update user set uPass=? where uName=?";
		List<Object> params = new ArrayList<Object>();
		params.add(pass);
		params.add(user.getuName());
		return operUpdate(sql,params);
    }
    public User queryUserByid(int uid) {
		// TODO Auto-generated method stub
		String sql="select * from user where uId="+uid;
		List<User> list=null;
		try {
			list = operQuery(sql, null,User.class);
			if(list.size() == 0){
				return null;
			}else{
				return list.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
}
