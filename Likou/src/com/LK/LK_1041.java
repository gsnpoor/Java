package com.LK;

public class LK_1041 {
    public static void main(String[] args) {
        System.out.println(isRobotBounded("GL"));
    }

    public static boolean isRobotBounded(String instructions) {
        int[] coordinate = {0, 0};
        int f = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'R') {
                f = (f + 1) % 4;
            }
            if (instructions.charAt(i) == 'L') {
                f = (f + 3) % 4;
            }
            if (instructions.charAt(i) == 'G') {
                coordinate = going(f, coordinate);
            }
        }
        if (f == 0 && (coordinate[1] != 0 || coordinate[0] != 0)) {
            return false;
        }
        return true;
    }

    public static int[] going(int f, int[] coordinate) {
        if (f == 0) {
            coordinate[1]++;
        } else if (f == 1) {
            coordinate[0]++;
        } else if (f == 2) {
            coordinate[1]--;
        } else {
            coordinate[0]--;
        }
        return coordinate;
    }
}
