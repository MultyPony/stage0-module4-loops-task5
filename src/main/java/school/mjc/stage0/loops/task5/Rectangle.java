package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= length; col++) {
                if (row == 1 || row == height) {
                    System.out.print('8');
                } else if (col == 1 || col == length) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
                if (col == length) {
                    System.out.println();
                }
            }
        }
    }
}
