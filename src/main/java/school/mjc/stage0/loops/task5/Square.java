package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 1; i <= sideLength; i++) {
            for (int y = 1; y <= sideLength; y++) {
                if (i == 1 || i == sideLength) {
                    System.out.print('8');
                } else if (y == 1 || y == sideLength) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
                if (y == sideLength) {
                    System.out.println();
                }
            }
        }
    }
}
