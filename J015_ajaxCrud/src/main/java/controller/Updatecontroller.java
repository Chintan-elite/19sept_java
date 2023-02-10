package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.BookDao;
import model.Book;

/**
 * Servlet implementation class Updatecontroller
 */
@WebServlet("/update")
public class Updatecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bid  =Integer.parseInt(request.getParameter("bid"));
		BookDao dao = new BookDao();
		Book b = dao.getbyId(bid);
		Gson g = new Gson();
		String book = g.toJson(b);
		PrintWriter pw = response.getWriter();
		pw.write(book);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bid  =Integer.parseInt(request.getParameter("bid"));
		BookDao dao = new BookDao();
		int i = dao.deletebook(bid);
		PrintWriter pw = response.getWriter();
		
		if(i>0)
		{
			pw.write("book deleted...");
		}
	}

}
