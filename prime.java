public class prime {
    public static boolean Prime(int number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        } else {
            int i = 3;
            while (i < (number / 2) + 1) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int no1 = 1;
        int no2 = 50;
        for (int i = no1; i <= no2; i++) {
            if (Prime(i) == true) {
                System.out.println(i);
            }
        }

    }
}
