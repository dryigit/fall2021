package stringManipulation;

import java.util.Scanner;

public class checkPassword {
public static void main(String[] args) {
	//check the password according to the given rules
	//1-no space at the beginnning
	//2-no space at the end
	//3-it must contain at least 1 digit
	//4-it must contain at least one lowercase letter
	//5-it must contain at least one uppercase letter
	//6-it must contain at least one character different from digits and letters
	
	conditions();
}

private static void conditions() {
	
	
	String psw="Abc123!";
	
	boolean isThereSpaceAtTheBeginnign=psw.startsWith(" ");
	boolean isThereSpaceAtTheEnd=psw.endsWith(" ");
	int containAtLeastOneDigit=psw.replaceAll("\\D","").length();
	int atLeastOneLowerCase=psw.replaceAll("[^a-z]","").length();
	int atLeastOneUpperCase=psw.replaceAll("[^A-Z]","").length();
	int chrDifferentFromDN=psw.replaceAll("[a-zA-Z0-9]","").length();
	
	if (!isThereSpaceAtTheBeginnign && !isThereSpaceAtTheEnd &&
			containAtLeastOneDigit>=1 &&atLeastOneLowerCase>=1&&
			atLeastOneUpperCase>=1 && chrDifferentFromDN>=1){
		System.out.println();
		System.out.println("Your password is set");
	} else{
		System.out.println();
		System.out.println("Please make the necessary corrections.");
		System.out.println();
	}
	
	if(isThereSpaceAtTheBeginnign){
		System.out.println("Your password should not include space at the beginning");
	}
	if(isThereSpaceAtTheEnd){
		System.out.println("Yor password should not include space at the end");
	}
	if(containAtLeastOneDigit==0){
		System.out.println("Your password should include at least one digit");
	}
	if(atLeastOneLowerCase==0){
		System.out.println("Your password should have at least one lowecase letter");
	}
	if(atLeastOneUpperCase==0){
		System.out.println("Your password should have at lears one upper case letter");
	}
	if(chrDifferentFromDN==0){
		System.out.println("Your password should have at least one character different from letters and digits");
	}
}
}
