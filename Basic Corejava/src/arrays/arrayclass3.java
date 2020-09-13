package arrays;

public class arrayclass3 {

	public static void main(String[] args) {
		String[][] arr = new String[5][2];

		// row1
		arr[0][0] = "U1";
		arr[0][1] = "P1";

		// row2

		arr[1][0] = "U2";
		arr[1][1] = "P2";

		// Row3

		arr[2][0] = "U3";
		arr[2][1] = "P3";

		// Row4

		arr[3][0] = "U4";
		arr[3][1] = "P4";

		// Row5

		arr[4][0] = "U4";
		arr[4][1] = "P4";

		for (int r = 0; r < 5; r++)

		{
			for (int c = 0; c < 2; c++)

			{
				System.out.print(" "+arr[r][c]);
			}
			System.out.println(" ");
		}
	}
}

// System.out.println(arr[])
