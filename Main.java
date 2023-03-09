import java.util.Scanner;

/*

permutation of N

summation of p[j], where 1 <= j <= i, should not be divisible by i
where 1 < i <= N (index 1 is not included)

------------------------

n = 4

3 4 1 2:
3 + 4 = 7 (for 2)
3 + 4 + 1 = 8 (for 3)
3 + 4 + 1 + 2 = 10 (for 4)

------------------------

n = 6

1 2 4 6 3 5

2 => 3
3 => 7
4 => 13
5 => 16
6 => 21

1 => 1
2 => 2
3 => 4
4 => 3
5 => 6
6 => 5

----------------------------------------

n = 8
1 => 1
2 => 2
3 => 4
4 => 3
5 => 6
6 => 5
7 => 8
8 => 7

----------------------------------------

n = 10
1 => 1
2 => 2
3 => 4
4 => 3
5 => 6
6 => 5
7 => 8
8 => 7
9 => 10
10 => 9

 */

public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			if ((n * (n + 1) / 2) % n == 0) {
				System.out.println(-1);
				continue;
			}
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = i + 1;
			}
			for (int i = 2; i < n; i += 2) {
				int temp = p[i];
				p[i] = p[i+1];
				p[i+1] = temp;
			}
			for (int x : p) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		fs.close();
	}
}
