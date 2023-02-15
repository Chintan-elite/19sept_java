package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.UserDao;
import model.User;

@WebServlet("/reg")
@MultipartConfig
public class RegistrationServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid = request.getParameter("uid");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		Part file = request.getPart("file");
		String filename = Paths.get(file.getSubmittedFileName()).getFileName().toString();
		
		String path = request.getRealPath("");
		String filePath = path+File.separator+"img";
		
		File f = new File(filePath);
		if(!f.exists())
		{
			f.mkdir();
		}
		file.write(filePath+File.separator+filename);
		
		User u = new User();
		if(!uid.equals(""))
		{
			u.setId(Integer.parseInt(uid));
		}
		
		u.setName(name);
		u.setEmail(email);
		u.setGender(gender);
		u.setCountry(country);
		u.setFilename(filename);
		
		UserDao dao = new UserDao();
		dao.addUser(u);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
		
		
		
		
		
	}

}
