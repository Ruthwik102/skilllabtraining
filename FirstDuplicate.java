public class FirstDuplicate {
    public static void main(String[] args) {
        int[] array = {12, 9, 5, 8, 4, 5, 10};
        int firstDuplicate = findFirstDuplicate(array);
        
        if (firstDuplicate != -1) { 
            System.out.println("The first duplicate is: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }

    public static int findFirstDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return array[i]; 
                }
            }
        }
        return -1; 
    }
}