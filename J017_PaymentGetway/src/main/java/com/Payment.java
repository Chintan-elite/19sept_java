package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;


@WebServlet("/payment")
public class Payment extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int amt = Integer.parseInt(request.getParameter("amt"));
		
		try {
			  JSONObject orderRequest = new JSONObject();
			  orderRequest.put("amount", amt); // amount in the smallest currency unit
			  orderRequest.put("currency", "INR");
			  orderRequest.put("receipt", "order_rcptid_11");
			  RazorpayClient razorpay = new RazorpayClient("rzp_test_WOONFY9u511Byr", "t9ROVnSqZbzNZr59d3KLWzJO");
			  Order order = razorpay.orders.create(orderRequest);
			  System.out.println(order);
			  PrintWriter pw  =response.getWriter();
			  
			  pw.append(order.toString());
			  
			  
		} catch (RazorpayException | JSONException e) {
			  // Handle Exception
			  System.out.println(e.getMessage());
			}
		
		
	}

}
