package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import model.Book;

/**
 * Servlet implementation class AddBookController
 */
@WebServlet("/updatebook")
public class Updatebookcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatebookcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bid = request.getParameter("bid");
		String bname  =request.getParameter("bname");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");
		
		Book b = new Book();
		b.setBid(Integer.parseInt(bid));
		b.setBname(bname);
		b.setPrice(Double.parseDouble(price));
		b.setQty(Integer.parseInt(qty));
		
		
		BookDao d = new BookDao();
		int i = d.updateBook(b);
		
		PrintWriter pw  =response.getWriter();
		if(i>0)
		{
			pw.write("Book Updated successfully !!!");
		}
		
	}

}
