package com.careerit.cj.day17;

public class TypeCastExample {

	// if obj is string trim and print it in upper case, if number print hex string
	// otherwise print to string
	public static void showInfo(Object obj) {
		if (obj instanceof String) {
			String str = (String) obj;
			System.out.println(str.trim().toUpperCase());
		}else if(obj instanceof Number) {
			Number num =(Number)obj;
			System.out.println(Integer.toHexString(num.intValue()));
		}else {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		showInfo("HellO ");
		showInfo(15123);
		showInfo(new Object());
	}
}
