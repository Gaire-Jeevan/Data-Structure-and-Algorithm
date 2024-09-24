public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,0},{0,0,0}};

        System.out.println("The image before flipping is:- ");
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

        int[][] result = flipAndInvertImage(image);

        System.out.println("The image after flippig is:- ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row: image) {
            // reverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap and do XOR with element at the time of swapping
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
