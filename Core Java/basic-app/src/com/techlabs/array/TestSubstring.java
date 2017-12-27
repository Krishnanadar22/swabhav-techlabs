package com.techlabs.array;

public class TestSubstring {
	public static void main(String urls[]) {
		System.out.println("Found " + urls.length + " urls");

		for (String url : urls) {
			int locOfSlash = url.indexOf("/");
			int locOfLastSlash = url.lastIndexOf("/");
			String domainName = url.substring(locOfSlash + 2, locOfLastSlash);
			System.out.println("Domain name of url:");
			System.out.println(domainName);

			System.out.println("Name found in url:");
			int locOfName = url.indexOf("?");
			if (locOfName != -1) {
				String Name = url.substring(locOfName + 1);
				System.out.println(Name);
			} else {
				System.out.println("NULL");
			}
		}
	}
}
