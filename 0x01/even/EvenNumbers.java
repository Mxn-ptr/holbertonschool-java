public class EvenNumbers {
	public static void main(String[] args) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < 100; i += 2)
		{
			output.append(i);
			if (i != 98)
				output.append(", ");
		}
		System.out.print(output + "\n");
	}
}
