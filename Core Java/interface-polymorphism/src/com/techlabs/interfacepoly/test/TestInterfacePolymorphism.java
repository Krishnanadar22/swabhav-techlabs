package com.techlabs.interfacepoly.test;

import com.techlabs.interfacepoly.Boy;
import com.techlabs.interfacepoly.IEmotionable;
import com.techlabs.interfacepoly.IMannerable;
import com.techlabs.interfacepoly.Man;

public class TestInterfacePolymorphism {
	public static void main(String args[]) {

		Man man = new Man();
		Boy boy = new Boy();

		atTheParty(man);
		atTheParty(boy);

		atTheMovie(boy);
		// atTheMovie(man);
	}

	public static void atTheParty(IMannerable im) {
		System.out.println("At the Party");
		im.wish();
		im.depart();
	}

	public static void atTheMovie(IEmotionable ie) {
		System.out.println("At the Movie");
		ie.cry();
		ie.laugh();
	}
}
