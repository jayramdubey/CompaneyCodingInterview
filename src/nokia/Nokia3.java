package nokia;

public class Nokia3 {

	public static void main(String[] args) {
		String str = "6a5b#d@ef&;h4";
		char ch[] = str.toCharArray();

		int len = ch.length;
		char tmp;
		int i = 0, j = len - 1;
		while (i < j) {

			if ((ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 48 && ch[i] <= 57)
					&& (ch[j] >= 'a' && ch[j] <= 'z' || ch[i] >= 48 && ch[i] <= 57)) {
				
				tmp = ch[i];
				ch[i] = ch[j];
				ch[j] = tmp;
				i++;
				j--;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				j--;
			}
			else
				i++;
		}
		System.out.println("Reverse of String is ");
		for (i = 0; i < len; i++) {
			System.out.print(ch[i]);
		}
	}

}
