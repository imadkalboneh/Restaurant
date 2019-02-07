package objects;

import java.sql.Date;

public class Member
{
	public String fname, lname, email, phone, pass;
	public int month, day;
	public Date joined;
	
	public Member() {}
	
	public Member(String fname, String lname, int month, int day, String phone, String email, String pass, Date joined)
	{
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.pass = pass;
		this.month = month;
		this.day = day;
		this.joined = joined;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getPass()
	{
		return pass;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}

	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getDay()
	{
		return day;
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public Date getJoined()
	{
		return joined;
	}

	public void setJoined(Date joined)
	{
		this.joined = joined;
	}
}
