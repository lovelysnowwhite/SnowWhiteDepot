
package tickets.service;
import java.util.*;
import tickets.property.*;
import tickets.dboperation.*;
/**
 *
 * @author 94540
 */
public class SessionService {
        private SessionDao sessionDao;
	public SessionService() {
		sessionDao=new SessionDao() ;
	}
	
	public int addSession(Session session) {
		// TODO Auto-generated method stub
		Session s=sessionDao.querySession(session);
		if(s==null) {
			boolean res_add=sessionDao.addSession(session);
			if(res_add) {
				return 1;//添加成功
			}else {
				return 2;//添加失败
			}
		}
		return 3;//添加失败
	}

	
	public boolean delSession(int sId) {
		// TODO Auto-generated method stub
		return sessionDao.delSession(sId);
	}

	
	public boolean updateSession(Session session) {
		// TODO Auto-generated method stub
		return sessionDao.updateSession(session);
	}

	
	public List<Session> queryAllSession() {
		// TODO Auto-generated method stub
		return sessionDao.queryAllSession();
	}
	
	public List<Session> querySessionBymId(int mId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionByMid(mId);
	}
	
	public Session querySessionById(int sId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionById(sId);
	}
	
	public List<Session> querySessionByHid(int hId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionByHid(hId);
	}
	
	public List<Session> querySessionBycIdandmId(int cId, int mId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionBycIdandmId(cId, mId);
	}
	
	public List<Session> querySessionBycId(int cId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionByCid(cId);
	}
}
