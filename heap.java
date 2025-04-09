public class heap {

    public static void generatePermutations(char[] lst, int size, String[] lst1, int index) {
        if (size == 1) {
            lst1[index] = new String(lst);  
            return;  
        } else {
            for (int i = 0; i < size; i++) {
                generatePermutations(lst, size - 1, lst1, index); 
                if (size % 2 == 0) {
                    char temp = lst[0];
                    lst[0] = lst[size - 1];
                    lst[size - 1] = temp;
                } else {
                    char temp = lst[i];
                    lst[i] = lst[size - 1];
                    lst[size - 1] = temp;
                }
                index++; 
            }
        }
    }

    public static String[] GenerateCombinations(char[] lst, int size) {
        int totalCombinations = fact.factorial(size); 
        String[] lst1 = new String[totalCombinations];
        generatePermutations(lst, size, lst1, 0);  
        return lst1;
    }

    public static void main(String[] args) {
        String str = "abc";
        char[] arr = str.toCharArray();
        String[] result = GenerateCombinations(arr, arr.length);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
