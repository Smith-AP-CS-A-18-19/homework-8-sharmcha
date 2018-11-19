public class Homework8 {

	/* Finish the constructor and create any necessary instance
	 * variables. A Homework8 object should have an array that
	 * holds n int values
	 */
	private int[] arr;

	public Homework8(int n) {
		arr = new int[n];
	}

	/* Return the stored array
	 */
	public int[] problem1() {
		return arr;
	}

	/* Fill the stored array with the provided int
	 */
	public void problem2(int n) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = n;
		}
	}

	/* Fill the stored array. The first value should be
	 * n, the second n-1, the third n-2, etc.
	 */
	public void problem3(int n) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = n-i;
		}
	}

	/* Find and return the maximum value in the
	 * provided array
	 */
	public double problem4(double[] arr) {
		double max = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/* Find and return the index of num in the
	 * provided array
	 */
	public int problem5(int[] arr, int num) {
		int location = -1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num) {
				location = i;
			}
		}
		return location;
	}

	public static void main(String[] args) {
          boolean pass = true;

          Homework8 hw8 = new Homework8(11);

          int[] arr = hw8.problem1();
          if (arr.length == 11) {
                          System.out.println("Pass 1");
          } else {
                          System.out.println("Fail 1");
                          pass = false;
          }

          hw8.problem2(7);
          boolean pass2 = true;
          for (int n : arr) {
                          if (n != 7) {
                                          pass2 = false;
                          }
          }
          if (pass2) {
                          System.out.println("Pass 2");
          } else {
                          System.out.println("Fail 2");
                          pass = false;
          }

          boolean pass3 = true;
          int value = 13;
          hw8.problem3(value);
          for (int i = 0; i < arr.length; i++) {
                          if (arr[i] != value) {
                                          pass3 = false;
                          }
                          value--;
          }
          if (pass3) {
                          System.out.println("Pass 3");
          } else {
                          System.out.println("Fail 3");
                          pass = false;
          }

          double[] arr2 = {2.3, 3.5, 5.7, 7.11, 5.13, 3.17, 2.19};
          if (hw8.problem4(arr2) == 7.11) {
                          System.out.println("Pass 4");
          } else {
                          System.out.println("Fail 4");
                          pass = false;
          }

          int[] arr3 = {2, 3, 5, 7, 11, 13};
          if (hw8.problem5(arr3, 5) == 2) {
                          System.out.println("Pass 5.1");
          } else {
                          System.out.println("Fail 5.1");
                          pass = false;
          }
          if (hw8.problem5(arr3, 9) == -1) {
                          System.out.println("Pass 5.2");
          } else {
                          System.out.println("Fail 5.2");
                          pass = false;
          }

          if (pass) {
                          System.out.println("All Pass");
          } else {
                          System.out.println("Fail");
          }
	                }
}
