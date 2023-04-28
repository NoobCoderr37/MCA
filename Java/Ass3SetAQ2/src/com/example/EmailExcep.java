package com.example;
import java.io.*;
import java.util.*;
class InvalidEmailException extends	Exception{
	String msg;
	public InvalidEmailException() {
	}
	public InvalidEmailException(String str) {
		super(str);
	}
}

public class EmailExcep {
	String name;
	String Email;
	public EmailExcep() {}
	public EmailExcep(String n,String e)throws InvalidEmailException{
		int flag=0;
		name=n;

		if(!((e.contains(".com"))||(e.contains(".org"))||(e.contains(".co.in"))||(e.contains(".in"))))
			throw new InvalidEmailException("Invalid Email id");
		else 
			Email=e;
	}
	public String toString() {
		return "Name "+name+"Email "+Email; 
	}
	public static void main(String[]args) {
		try { 
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name and Email-id");
			String n=br.readLine();
			String email=br.readLine();
			EmailExcep U=new EmailExcep(n,email);
			System.out.println(U);
		}catch(IOException e) {
			System.out.println(e);
		}catch(InvalidEmailException e) {
			System.out.println(e);
		}

	}



}