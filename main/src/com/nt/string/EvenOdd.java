package com.nt.programs;

public class EvenOdd {

	public static void main(String[] args) {
		int num = -2;
		if (num == 0) {
			System.out.println("Number is zero : " + num);
		} else if (num < 0) {
			System.out.println("Number is negative : " + num);
		} else if (num % 2 == 0) {
			System.out.println("Number is even : " + num);
		} else {
			System.out.println("Number is odd : " + num);
		}
	}

}

/*package com.nt.programs;

public class EvenOdd {

    public static void main(String[] args) {
        int num = -2;

        // Outer if-else for positive/negative/zero check
        if (num >= 0) {
            // Inner if for zero
            if (num == 0) {
                System.out.println("Number is zero : " + num);
            } else {
                // Nested if for even/odd check
                if (num % 2 == 0) {
                    System.out.println("Number is even : " + num);
                } else {
                    System.out.println("Number is odd : " + num);
                }
            }
        } else {
            System.out.println("Number is negative : " + num);
        }
    }
}
*/