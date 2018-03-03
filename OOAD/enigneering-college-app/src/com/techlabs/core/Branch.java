package com.techlabs.core;

public enum Branch {
	COMPS, MECH, CIVIL, EXTC;

	@Override
	public String toString() {
		switch (this) {
		case COMPS:
			return "Computers";
		case MECH:
			return "Mechanical";
		case CIVIL:
			return "Civil";
		case EXTC:
			return "Electronics and Tele-Communication";
		}
		return null;
	}
}
