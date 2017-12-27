package com.techlabs.array;

public class TestSplit {
	public static void main(String args[]) {
		String url = "https://www.swabhavtechlabs.com/studn=?Krishna";
		String brokenUrl[] = url.split("/");

		String domainName = brokenUrl[2];
		System.out.println(domainName);

		String brokenBrokenUrl[] = brokenUrl[3].split("\\?");
		String Name = brokenBrokenUrl[1];
		System.out.println(Name);
	}
}