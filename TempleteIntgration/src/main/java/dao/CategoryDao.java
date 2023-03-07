package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;

public class CategoryDao {
		
	Connection cn = null;
	public CategoryDao() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/olx","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<Category> getallCat()
	{
		List<Category> list = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from category");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Category cat = new Category();
				cat.setCid(rs.getInt(1));
				cat.setCname(rs.getString(2));
				
				list.add(cat);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
}
