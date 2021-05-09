package neustar;

public class LikeAndDislikeProblem {

	public static void main(String[] args) {

		int A[] = { 0, 1, 1, 1, 0, 1 };
		int B[] = { 1, 0, 1, 1, 0, 1 };
		System.out.println(" Number of like: " + likeVote(A, B));

	}

	private static int likeVote(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				count++;
			}
		}
		return count;
	}

}
