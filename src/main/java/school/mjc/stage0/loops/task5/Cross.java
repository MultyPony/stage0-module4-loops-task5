package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int halfToCross = (int) Math.ceil(sideLength / 2.0);

        for (int i = 1; i <= sideLength; i++) {
            for (int y = 1; y <= sideLength; y++) {
                if (i != halfToCross) {
                    if (y != halfToCross) {
                        System.out.print(' ');
                    } else {
                        System.out.print('8');
                    }
                } else {
                    System.out.print('8');
                }
                if (y == sideLength) {
                    System.out.println();
                }
            }
        }
    }
}
