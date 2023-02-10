package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Book;

public class BookDao {
	
	Connection cn=null;
	public BookDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int addBook(Book b)
	{
		int i=0;
		try {
			PreparedStatement ps  =cn.prepareStatement("insert into book values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, b.getBname());
			ps.setDouble(3, b.getPrice());
			ps.setInt(4, b.getQty());
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public ArrayList<Book> viewAllBook()
	{
		ArrayList<Book> al = new ArrayList();
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from book");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Book b = new Book();
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setPrice(rs.getDouble(3));
				b.setQty(rs.getInt(4));
				
				al.add(b);
			}
				
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return al;
	}

	public Book getbyId(int bid)
	{
		
		Book b = new Book();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from book where bid=?");
			ps.setInt(1, bid);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setPrice(rs.getDouble(3));
				b.setQty(rs.getInt(4));
				
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return b;
	}

	public int deletebook(int bid) {
		int i = 0;
		try {
			PreparedStatement ps =cn.prepareStatement("delete from book where bid=?");
			ps.setInt(1, bid);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public int updateBook(Book b) {
		
		int i=0;
		try {
			PreparedStatement ps  =cn.prepareStatement("update book set bname=?,price=?,qty=? where bid=?");
			ps.setInt(4, b.getBid());
			ps.setString(1, b.getBname());
			ps.setDouble(2, b.getPrice());
			ps.setInt(3, b.getQty());
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<Book> searchBook(String keyword) {
		
		
ArrayList<Book> al = new ArrayList();
		
		try {
			Statement st = cn.createStatement();
		
			ResultSet rs = st.executeQuery("select * from book where bname like '"+keyword+"%'");
			while(rs.next())
			{
				Book b = new Book();
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setPrice(rs.getDouble(3));
				b.setQty(rs.getInt(4));
				
				al.add(b);
			}
				
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return al;
	}
	
	
	
}
