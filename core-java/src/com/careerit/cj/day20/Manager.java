package com.careerit.cj.day20;

class TokeCollector{
	
	private String[] tokens;
	private int count = 0;
	
	public TokeCollector() {
		tokens = new String[5];
	}
	
	public void addToken(String token) {
		if(count < tokens.length) {
			tokens[count++] = token;
		}else {
			String[] temp = new String[tokens.length + tokens.length/2];
			System.arraycopy(tokens, 0, temp, 0, count);
			tokens = temp;
			tokens[count++] = token;
		}
	}
	
	public void removeToken(String token) {
		
	}
	
	public void showElements() {
		StringBuffer sb = new StringBuffer();
		if(count == 0) {
			System.out.println("[]");
		}else {
			sb.append("[");
			for(int i=0;i<count;i++) {
				if(i == count-1)
					sb.append(tokens[i]);
				else
					sb.append(tokens[i]+", ");
			}
			sb.append("]");
			System.out.println(sb.toString());
		}
		
	}
	
	
}

public class Manager {

		public static void main(String[] args) {
			TokeCollector obj = new TokeCollector();
			obj.showElements();
			obj.addToken("123");
			obj.addToken("234");
			obj.addToken("345");
			obj.showElements();
		}
}
