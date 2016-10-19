package com.naga.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.naga.beans.Employee;
import com.naga.beans.StudentBean;
import com.naga.utils.XMLGenerator;


@Path("EmployeeService")
public class FirstWebService
{

	@Path("geEmployees")
	@POST
	@Consumes("application/xml")
	@Produces("application/xml")
	
	/**
	 *  URL to hit : http://localhost:8081/RestfulWebService/rs/EmployeeService/geEmployees
	 *  
	 *  Request :
	 *  
	 *   data =	<Employee><name>naga</name>
				<age>25</age><salary>3232</salary>
				</Employee>
				
	 * @param data
	 * @param version
	 * @return
	 */
	public String getEmployeeDetails(@FormParam("data") String data,@DefaultValue("1") @FormParam("version") int version)
	{
		// convert the input xml to java object
		Employee employee = (Employee) XMLGenerator.convertFromXML(data); 
		
		System.out.println("Employee details" +employee.toString());
		
		
		// send the response
		
		StudentBean studentBean = new StudentBean();
		studentBean.setStudentAge(24);
		studentBean.setStudentName("Prasad");
		studentBean.setStudentSalary(10000);
		return XMLGenerator.convertToXML(studentBean);
	}
	
	
	@GET
	@Path("addMethod")
	@Produces("application/text")
	
	/**
	 *  url: http://localhost:8085/RestfulWebService/rs/EmployeeService/addMethod?a=2&b=3
	 *  
	 * @param a
	 * @param b
	 * @return
	 */
	public String addMethod(@QueryParam("a") int a, @QueryParam("b") int b)
	{
		return String.valueOf(a+b);
	}
}
