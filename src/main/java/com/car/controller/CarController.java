package com.car.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.car.bean.Car;
import com.car.dao.CarDAO;


/**
 * Servlet implementation class CarController
 */
public class CarController extends HttpServlet {
	
    CarDAO dao =new CarDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	String CarNo = request.getParameter("no");
	String Manufacturer = request.getParameter("manu");
	String Model = request.getParameter("model");
	int KmsRun = Integer.parseInt(request.getParameter("run"));
	int PriceExpected = Integer.parseInt(request.getParameter("Excepted"));
	int NoOfOwner = Integer.parseInt(request.getParameter("Owner"));
	
	
		
		Car bean = new Car(CarNo,Manufacturer,Model,KmsRun,PriceExpected,NoOfOwner);
		int n =dao.insertCar(bean);

		if (n == 1) {
			response.sendRedirect("InsertCarSuccess.jsp");
		} else {
			response.sendRedirect("InsertCarFail.jsp");
		}
	}

	
}
