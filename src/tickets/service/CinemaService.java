
package tickets.service;
import java.util.*;
import tickets.property.*;
import tickets.dboperation.*;

public class CinemaService {
        private CinemaDao cinemaDao;
	public CinemaService() {
	// TODO Auto-generated constructor stub
	  cinemaDao=new CinemaDao();
        }
	
	public int addCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		Cinema c=cinemaDao.queryCinema(cinema);
		if(c==null) {
			boolean res_add =cinemaDao.addCinema(cinema);
			if (res_add) {
				return 1;//添加成功
			}else {
				return 2;//添加失败
			}
		}
		return 3;//添加失败-电影院已存在
	}

	
	public boolean delCinema(int cid) {
		// TODO Auto-generated method stub
		return cinemaDao.delCinema(cid);
	}

	
	public boolean updateCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		return cinemaDao.updateCinema(cinema);
	}

	
	public List<Cinema> queryAllCinema() {
		// TODO Auto-generated method stub
		return cinemaDao.queryAllCinema();
	}
	
	public Cinema queryCinemaById(int cId) {
		// TODO Auto-generated method stub
		return cinemaDao.queryCinemaById(cId);
	}
	
	public List<Cinema> queryCinemaByCinemaName(String cName) {
		// TODO Auto-generated method stub
		return cinemaDao.queryCinemaByCinemaName(cName);
	}
	
	public List<Cinema> queryCinemaByCinemaAddress(String cAddress) {
		// TODO Auto-generated method stub
		return cinemaDao.queryCinemaByCinemaAddress(cAddress);
	}
	
	public List<Cinema> queryCinemaByCinemaNameAndCinemaAddress(String cName, String cAddress) {
		// TODO Auto-generated method stub
		return cinemaDao.queryCinemaByCinemaNameAndCinemaAddress(cName, cAddress);
	}

}
