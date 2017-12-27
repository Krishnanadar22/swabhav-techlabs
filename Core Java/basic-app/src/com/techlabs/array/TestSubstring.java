package com.techlabs.array;

public class TestSubstring {
	public static void main(String args[]) {
		String url = "https://www.swabhavtechlabs.com/studtn=?Krishna";
		int locOfDot = url.indexOf("//");
		int locOfLastDot = url.lastIndexOf("/");
		String domainName = url.substring(locOfDot + 2, locOfLastDot);
		System.out.println(domainName);

		int locOfName = url.indexOf("?");
		String Name = url.substring(locOfName + 1);
		System.out.println(Name);
	}
}
