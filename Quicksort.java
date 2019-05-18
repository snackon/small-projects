import java.util.Arrays;
import java.util.Scanner;

class Qsort {
    int partition(int arr[], int lo, int hi) {
        int piv = arr[hi];
        int i = lo;
        for (int count = lo; count < hi; count++) {
            if (arr[count] < piv) {
				System.out.println("Current array is " + Arrays.toString(arr) + ".\n"
								   + "Rightmark is " + piv
								   + "\n"
								   + "Rightmar index is " + hi
								   + "\n"
								   + "leftmark is " + arr[i]
								   + "\n"
								   + "leftmark index is " + i
								   + "\n"
								   + "count is " + arr[count]
								   + "\n"
								   + "count index is " + count
								   + "\n");
				if (arr[i] == arr[count]) {
					System.out.println("Leftmark and count are identical, so the partitioned array is sorted.\n");
				} else if (arr[i] < arr[count]) {
					System.out.println("Didn't switch anything because leftmark is less than count.\n");
				} else {
					System.out.println("Switched " + arr[i] + " with " + arr[count] + "\n");
				}
                int t = arr[i];
                arr[i] = arr[count];
                arr[count] = t;
                i++;
            }
        }
		System.out.println("Current array is " + Arrays.toString(arr) + ".\n"
						   + "Rightmark is " + piv
						   + "\n"
						   + "Rightmark index is " + hi
						   + "\n"
						   + "leftmark is " + arr[i]
						   + "\n"
						   + "leftmark index is " + i
						   + "\n"
						   + "count is " + arr[hi]
						   + "\n"
						   + "count index is " + hi
						   + "\n");
		if (arr[i] == arr[hi]) {
			System.out.println("Leftmark and count are identical, so the partitioned array is sorted.\n");
		} else if (arr[i] < arr[hi]) {
			System.out.println("Didn't switch anything because leftmark is less than count.\n");
		} else {
			System.out.println("Switched " + arr[i] + " with " + arr[hi] + "\n");
		}
        int t = arr[i];
        arr[i] = arr[hi];
        arr[hi] = t;
		System.out.println("Current array is " + Arrays.toString(arr) + ".\n"
						   + "Rightmark is " + piv
						   + "\n"
						   + "Rightmark index is " + hi
						   + "\n"
						   + "leftmark is " + arr[i]
						   + "\n"
						   + "leftmark index is " + i
						   + "\n"
						   + "count is " + arr[hi]
						   + "\n"
						   + "count index is " + hi
						   + "\n");
		if (arr[i] == arr[hi]) {
			System.out.println("Leftmark and count are identical, so the partitioned array is sorted.\n");
		} else if (arr[i] < arr[hi]) {
			System.out.println("Didn't switch anything because leftmark is less than count.\n");
		} else {
			System.out.println("Switched " + arr[i] + " with " + arr[hi] + "\n");
		}
		System.out.println("|=====| PARTITION HAPPENS HERE |=====|\n");

		return i;
    }

    void quicksort(int arr[], int lo, int hi) {
        if (lo < hi) {
            int p = partition(arr, lo, hi);
            quicksort(arr, lo, p - 1);
            quicksort(arr, p + 1, hi);
        }
    }
}

class QsortDemo{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Qsort object = new Qsort();
		int[] array = new int[6];

		System.out.println("Please enter 6 numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("\nUnsorted array: " + Arrays.toString(array) + "\n");
		
		object.quicksort(array, 0, array.length - 1);
		
		System.out.println("Final sorted array: " + Arrays.toString(array));
	}
}
