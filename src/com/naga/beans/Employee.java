package com.naga.beans;

import com.thoughtworks.xstream.annotations.XStreamAlias;



@XStreamAlias("Employee")
public class Employee
{
	private String name;
	private int age;
	private int salary;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("[name=");
		builder.append(this.getName());
		builder.append(']');
		builder.append("[age=");
		builder.append(this.getAge());
		builder.append(']');
		builder.append("[salary=");
		builder.append(this.getSalary());
		builder.append(']');
		return builder.toString();
	}

}
