// Java program to demonstrate
// varargs with normal arguments

class varargs2 {

	// Takes string as a argument followed by varargs
	static void fun2(String str, int... a) {
		System.out.println("String: " + str);
		System.out.println("Number of arguments is: "
				+ a.length);

		// using for each loop to display contents of a
		for (int i : a)
			System.out.print(i + " ");

		System.out.println();
	}

	public static void main(String args[]) {
		// Calling fun2() with different parameter
		fun2("GeeksforGeeks", 100, 200);
		fun2("CSPortal", 1, 2, 3, 4, 5);
		fun2("forGeeks");
	}
}

// Erroneous Varargs Examples
// Case 1: Specifying two Varargs in a single method:

// void method(String... gfg, int... q)
// {
// // Compile time error as there
// // are two varargs
// }
// Case 2: Specifying Varargs as the first parameter of the method instead of
// the last one:

// void method(int... gfg, String q)
// {
// // Compile time error as vararg
// // appear before normal argument
// }
