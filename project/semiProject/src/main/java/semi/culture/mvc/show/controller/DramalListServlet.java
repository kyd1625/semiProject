 package semi.culture.mvc.show.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.culture.common.util.PageInfo;
import semi.culture.mvc.show.model.service.ShowService;
import semi.culture.mvc.show.model.vo.Show;
import semi.culture.mvc.show.model.vo.ShowDetail;

@WebServlet("/drama")
public class DramalListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private ShowService service = new ShowService();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<ShowDetail> listRank = null;
		List<ShowDetail> listAll = null;
		
		
		
	
		
//		뮤지컬 추천 리스트
		listRank = service.DramaRankList();
		req.setAttribute("listRank",listRank);
		System.out.println(listRank.get(0).getPrfid());
		
		listAll=service.DramaAllList();
		req.setAttribute("listAll", listAll);
//		System.out.println(listAll);
		
		req.getRequestDispatcher("/drama.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	

}

