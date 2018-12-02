package main;

public class UtilityClass {
	
	@SuppressWarnings("unused")
	public static void method(InnerEnum parameter) {
		//do something smart
	}
	
	@SuppressWarnings("unused")
	public static void method(OuterEnum parameter) {
		//do something smart
	}
	
	public enum InnerEnum {
		CONSTANT
	}
	
}
