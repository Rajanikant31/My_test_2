public class Array {
    public static void main(String[] args) {
        int flag = 0;
        char[] arr = {'A', 'c','B','Z','W','P','k'};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Alphabate is present");
        } else {
            System.out.println("Alphabate is not present");
        }
    }
}



