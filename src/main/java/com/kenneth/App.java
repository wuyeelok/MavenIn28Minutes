package com.kenneth;

public class App {
	public String returnSomething() {
		return "DUMMY: " + parseToInt("00000005", 0) + "!";
	}

	public int parseToInt(String stringToParse, int defaultValue) {
		int phasedInt;
		try {
			phasedInt = Integer.parseInt(stringToParse);
		} catch (NumberFormatException ex) {
			phasedInt = defaultValue; // Use default value if parsing failed
		}
		return phasedInt;
	}
}
