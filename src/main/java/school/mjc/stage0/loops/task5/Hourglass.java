package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int half = (int) Math.ceil(height / 2.0);

        for (int row = 1, minus = 0; row <= height; row++) {
            for (int col = 1; col <= height; col++) {
                if (col <= minus || col > (height - minus)) {
                    System.out.print(' ');
                } else {
                    System.out.print('8');
                }

                if (col == height) {
                    System.out.println();
                }
            }
            if (row < half) {
                minus++;
            } else if (row > half || (height % 2 != 0 && row == half)) {
                minus--;
            }
        }
    }
}
