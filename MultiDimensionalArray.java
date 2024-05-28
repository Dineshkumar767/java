public class MultiDimensionalArray {
    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    nums[i][j][k] = (int) (Math.random() * 10);
                    // System.out.print(nums[i][j][k] + " ");
                }
            }
        }

        for (int One[][] : nums) {
            for (int Two[] : One) {
                for (int Three : Two) {
                    System.out.println(Three);
                }
                System.out.println();
            }
        }

    }
}
