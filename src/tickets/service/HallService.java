
package tickets.service;
import java.util.*;
import tickets.property.*;
import tickets.dboperation.*;
/**
 *
 * @author 94540
 */
public class HallService {
        private HallDao hallDao=new HallDao();
 
	
	public int addHall(Hall hall) {
		// TODO Auto-generated method stub
		Hall h=hallDao.queryHall(hall);
		if(h==null) {
			boolean res_add=hallDao.addHall(hall);
			if (res_add) {
				return 1;//添加成功
			}else {
				return 2;//添加失败
			}
		}
		return 3;//添加失败
	}

	
	public boolean delHall(int hId) {
		// TODO Auto-generated method stub
		return hallDao.delHall(hId);
	}

	
	public boolean updateHall(Hall hall) {
		// TODO Auto-generated method stub
		return hallDao.updateHall(hall);
	}

	
	public List<Hall> queryAllHall() {
		// TODO Auto-generated method stub
		return hallDao.queryAllHall();
	}

	
	public Hall queryHallById(int hId) {
		// TODO Auto-generated method stub
		return hallDao.queryHallById(hId);
	}

	
	public List<Hall> queryAllHallcId(int cId) {
		// TODO Auto-generated method stub
		return hallDao.queryAllHallcId(cId);
	}
}
