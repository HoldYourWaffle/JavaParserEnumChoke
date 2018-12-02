package main;

import main.UtilityClass.InnerEnum;

public class MainClass {
	
	public void choke() {
		UtilityClass.method(UtilityClass.InnerEnum.CONSTANT);
	}
	
	public void choke2() {
		UtilityClass.method(InnerEnum.CONSTANT);
	}
	
	public void choke3() {
		UtilityClass.method(OuterEnum.CONSTANT);
	}
	
	
	
	public void works() {
		UtilityClass.InnerEnum param = UtilityClass.InnerEnum.CONSTANT;
		UtilityClass.method(param);
	}
	
	public void works2() {
		InnerEnum param = InnerEnum.CONSTANT;
		UtilityClass.method(param);
	}
	
	public void works3() {
		OuterEnum param = OuterEnum.CONSTANT;
		UtilityClass.method(param);
	}
	
}
