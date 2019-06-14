
package tickets.service;
import java.util.*;
import tickets.property.*;
import tickets.dboperation.*;
/**
 *
 * @author 94540
 */
public class MovieService {
        private MovieDao movieDao;

	public MovieService() {
		movieDao = new MovieDao();
	}

	
	public int addMovie(Movie movie) {
		// TODO Auto-generated method stub
		Movie m=movieDao.queryMovie(movie);
		if(m==null) {
			boolean res_add =movieDao.addMovie(movie);
			if (res_add) {
				return 1;//添加成功
			}else {
				return 2;//添加失败
			}
		}
		return 3;//添加失败-电影已存在
	}

	
	public boolean delMovie(int mid) {
		// TODO Auto-generated method stub
		return movieDao.delMovie(mid);
	}

	
	public boolean updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieDao.updateMovie(movie);
	}

	
	public List<Movie> queryAllMovie() {
		// TODO Auto-generated method stub
		return movieDao.queryAllMovie();
	}

	
	public List<Movie> OrderMovieTen() {
		// TODO Auto-generated method stub
		return movieDao.OrderMovieTen();
	}

	
	public Movie queryMovieById(int mId) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieById(mId);
	}

	
	public List<Movie> queryMovieByType(String mType) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieByType(mType);
	}

	
	public List<Movie> queryMovieBymovieName(String mName) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieBymovieName(mName);
	}

	
	public Movie queryMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Movie> queryMovieByTypeandName(String mType, String mName) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieByTypeandName(mType, mName);
	}

	
	public Movie queryMovieByName(String mName) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieByName(mName);
	}
}
