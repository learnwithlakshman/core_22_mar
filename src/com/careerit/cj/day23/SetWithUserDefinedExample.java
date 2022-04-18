package com.careerit.cj.day23;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Shirt{
	int size;

	public Shirt(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return Objects.hash(size);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shirt other = (Shirt) obj;
		return size == other.size;
	}
	
	
	
	
}
public class SetWithUserDefinedExample {

		public static void main(String[] args) {
			
			Set<Shirt> set = new HashSet<Shirt>();
			
			set.add(new Shirt(34));
			set.add(new Shirt(36));
			set.add(new Shirt(34));
			set.add(new Shirt(36));
			set.add(new Shirt(38));
			set.add(new Shirt(40));
			set.add(new Shirt(42));
			
			System.out.println(set.size());
			
			
		}
}
