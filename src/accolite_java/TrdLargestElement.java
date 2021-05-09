package accolite_java;

public class TrdLargestElement {
	
	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 6, 1, 8, 10, 12 };

		int fstMax = 0, sndMax = 0, trdMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (fstMax < arr[i]) {
				trdMax = sndMax;
				sndMax = fstMax;
				fstMax = arr[i];
			} else if (sndMax < arr[i]) {
				trdMax = sndMax;
				sndMax = arr[i];
			} else if (trdMax < arr[i])
				trdMax = arr[i];
		}
		System.out.println("3rd max:  " + trdMax);
	}

}
