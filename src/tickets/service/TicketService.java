
package tickets.service;
import java.util.*;
import tickets.property.*;
import tickets.dboperation.*;
/**
 *
 * @author 94540
 */
public class TicketService {
        private TicketDao ticketDao;
        public TicketService(){
	   ticketDao=new TicketDao();
        }
	
	public boolean addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.addTicket(ticket);
	}

	
	public boolean delTicket(int tId) {
		// TODO Auto-generated method stub
		return ticketDao.delTicket(tId);
	}

	
	public List<Ticket> queryAllTicket() {
		// TODO Auto-generated method stub
		return ticketDao.queryAllTicket();
	}
	
	public List<Ticket> queryAllTicketsId(int sId) {
		// TODO Auto-generated method stub
		return ticketDao.queryAllTicketsId(sId);
	}
	
	public List<Ticket> queryAllTicketuId(int uId) {
		// TODO Auto-generated method stub
		return ticketDao.queryAllTicketuId(uId);
	}
}
