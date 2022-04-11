package com.careerit.cj.day18;

import java.io.Serializable;

interface I{
	
}

class T1 implements I{
	
}
class T2 extends T1{
	
}
class One implements I,Cloneable,Serializable{
	
		public Object changeType() {
			if(this instanceof I) {
				return this;
			}
			throw new IllegalAccessError();
			
		}
}
public class MarkerInterfaceDemo {

		public static void main(String[] args) {
			
				One obj = new One();
				Object i = obj.changeType();
				System.out.println(i);
				
				
				
		}
}
