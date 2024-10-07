import java.util.Arrays;

public class UserDefinedForBuiltinFunctions {

    // mismatch()
    int mismatch(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }

        return -1;
    }

    // compare()
    int compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return arr1[i] - arr2[i]; // Early return on mismatch
            }
        }

        return 0;
    }

    // copy()
    public void copy(int[] source, int[] target) {
        if (source.length != target.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        System.arraycopy(source, 0, target, 0, source.length);
    }

    // copyOfRange()
    public int[] copyOfRange(int[] original, int from, int to) {
        if (from < 0 || to > original.length || from > to) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int newLength = to - from;
        int[] newArray = new int[newLength];
        System.arraycopy(original, from, newArray, 0, newLength);
        return newArray;
    }

    // clone()
    public int[] clone(int[] original) {
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        return copy;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 5};

        UserDefinedForBuiltinFunctions obj = new UserDefinedForBuiltinFunctions();

        System.out.println("Mismatch index: " + obj.mismatch(arr1, arr2));

        // Test compare
        int comparisonResult = obj.compare(arr1, arr2);
        if (comparisonResult < 0) {
            System.out.println("arr1 is less than arr2");
        } else if (comparisonResult > 0) {
            System.out.println("arr1 is greater than arr2");
        } else {
            System.out.println("arr1 is equal to arr2");
        }

        // Test copy
        int[] targetArray = new int[arr1.length];
        obj.copy(arr1, targetArray);
        System.out.println("Copied array: " + Arrays.toString(targetArray));

        // Test copyOfRange
        int[] subArray = obj.copyOfRange(arr1, 2, 4);
        System.out.println("Subarray: " + Arrays.toString(subArray));

        // Test clone
        int[] clonedArray = obj.clone(arr1);
        System.out.println("Cloned array: " + Arrays.toString(clonedArray));
    }
}