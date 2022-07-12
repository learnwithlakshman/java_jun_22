package com.careerit.cj.day22;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Order{
	
		private String productName;
		private float price;
		
		public Order(String productName, float price) {
			super();
			this.productName = productName;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Order [productName=" + productName + ", price=" + price + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(price, productName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			return Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
					&& Objects.equals(productName, other.productName);
		}
		
		
		
		
}
public class SetWithUserObjects {

		public static void main(String[] args) {
			
			Order order1 = new Order("iPhone13",98000);
			Order order2 = new Order("iPhone13",98000);
			Order order3 = new Order("Samsung Galaxy",68000);
			
			Set<Order> set = new HashSet<Order>();
			set.add(order1);
			set.add(order2);
			set.add(order3);
			set.add(order1);
			System.out.println(set.size());
			
		}
}
