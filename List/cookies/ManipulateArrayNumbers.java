import java.util.List;

public class ManipulateArrayNumbers {
	public static int findNumberPosition(List<Integer> list, int numberToFind) {
		return list.indexOf(numberToFind);
	}

	public static void addNumber(List<Integer> list, int numberToAdd) {
		if (findNumberPosition(list, numberToAdd) != -1)
			throw new IllegalArgumentException("Number already in the list");
		list.add(numberToAdd);
	}

	public static void removeNumber(List<Integer> list, int numberToRemove) {
		int index = findNumberPosition(list, numberToRemove);
		if (index == -1)
			throw new IllegalArgumentException("Number not found in the list");
		list.remove(index);
	}

	public static void replaceNumber(List<Integer> list, int numberToReplace, int replacementNumber) {
		int index = findNumberPosition(list, numberToReplace);
		if (index == -1)
			list.add(replacementNumber);
		else
			list.set(index, replacementNumber);
	}
}
