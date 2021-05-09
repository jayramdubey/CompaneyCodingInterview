package com.Lowes;

public class FebonicciSeriesRipitative {

	public static void main(String[] args) {
		int x = 0, y = 1, z = 0;
		
		FebonicciSeriesRipitative obj = new FebonicciSeriesRipitative();
		
		obj.febonicci(x, y, z);
	}

	private void febonicci(int x, int y, int z) {
		
		System.out.print(x + " " + y);
        for(int i=1;i<=50;i++){
        	z=x+y;
        	x=y;
        	y=z;
        	System.out.print(" "+z);
        }
		
	}

}
