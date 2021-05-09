package synechron;

import java.util.Date;

final class Test {
	final String name;
	final int regNo;

	Test(String name, int regNo) {
		this.name = name;
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;

	}

}
public  class MyImutableClass {
	
	 public static void main(String args[]) 
	    { 
		    Test s = new Test("ABC", 101); 
	        System.out.println(s.getName()); 
	        System.out.println(s.getRegNo()); 
	        
	        ImmutableClass2 im = ImmutableClass2.createNewInstance(100,"test", new Date());
	        System.out.println(im);
	        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
	        System.out.println(im);
	    }
	 private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)
	    {
	        immutableField1 = 10000;
	        immutableField2 = "test changed";
	        mutableField.setDate(10);
	    }


}
