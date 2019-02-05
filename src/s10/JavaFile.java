package s10;

public class JavaFile {
	public static void main(String[] args) {
		System.out.println(isJavaFile("MyClass.java")); // true
		System.out.println(isJavaFile("test.txt")); // false
		System.out.println(isJavaFile("java.txt")); // false
		System.out.println(isJavaFile(".java.txt")); // false
	}

	private static boolean isJavaFile(String name) {
		// if (name.endsWith(".java")) {
		// return true;
		// }
		// return false; // ?
		return name.endsWith(".java");
	}
}
