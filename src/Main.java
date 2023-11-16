public class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static int[] combine(int[] firstarray, int[] secondarray) {
        int alength = firstarray.length;
        int[] result = new int[alength+secondarray.length];
        for (int i = 0; i<alength;i++) {
            result[i] = firstarray[i];
        }
        for (int i = alength;i<secondarray.length + alength;i++) {
            result[i] = secondarray[i-alength];
        }

        return result;

    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] zip(int[] firstarray, int[] secondarray) {
        int[] out = new int[secondarray.length+firstarray.length];
        int one = 0;
        int two = 0;
        for (int i = 0; i<secondarray.length+firstarray.length; i++) {
            if (i%2 == 0) {
                out[i] = firstarray[one];
                one = one+1;
            }
            else {
                out[i] = secondarray[two];
                two = two+1;
            }
        }
        return out;
    }

    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] firstarray, int[] secodnarray) {
        int[] out = new int[firstarray.length];
        for (int i = 0; i<firstarray.length;i++) {
            out[i] = firstarray[i]*secodnarray[i];
        }
        return out;

    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    public static int[] capitalCount(String[] words) {
        int[] count = new int[words.length];
        for (int i = 0; i< words.length; i++) {
            count[i] = countCapitalLetters(words[i]);
        }

        return count;

    }

    public static int countCapitalLetters(String Words) {
        int counter = 0;
        for (int x = 0; x<Words.length();x++) {
            char c = Words.charAt(x);
            int a = c;
            if (a>64&&a<91) {
                counter = counter + 1;
            }
        }

        return counter;

    }

}
