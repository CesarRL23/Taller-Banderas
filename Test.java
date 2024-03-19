import java.awt.Color;

public class Test {

    public static final int YELLOW = new Color(250, 201, 20).getRGB();
    public static final int RED = new Color(196, 0, 15).getRGB();
    public static final int BLUE = new Color(17, 13, 99).getRGB();
    public static final int WHITE = new Color(255, 255, 255).getRGB();
    public static final int GREEN = new Color(35, 138, 51).getRGB();

    public static int[][] createCOLflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
        rowIni = (height * 0) / 4;
        rowEnd = (height * 2) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;

        rowIni = (height * 2) / 4;
        rowEnd = (height * 3) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 3) / 4;
        rowEnd = (height * 4) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;
        return flag;

    }

    public static int[][] createVENflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;

        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;
        return flag;

    }

    public static int[][] createPOLflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        return flag;

    }

    public static int[][] createPANflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;

    }

    public static int[][] createCHIflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 3;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 1) / 3;
        colEnd = (width * 3) / 3;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        return flag;

    }

    public static int[][] createCZEflag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;
        for (int c = colIni; c < colEnd; c += 1) {
            for (int r = rowIni; r < rowEnd - (c * 2); r++)
                flag[r + c][c] = BLUE;
        }

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = 0;
        colEnd = widht;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni + r + 1; c < colEnd; c += 1) {
                flag[r][c] = WHITE;
                flag[height - 1 - r][c] = RED;
            }
        }

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (height * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;
        }
        return flag;
    }

    public static int[][] createKWTflag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = ((height * 0) / 2) + 1;
        colEnd = (height * 1) / 2;
        for (int c = colIni; c < colEnd; c += 1) {
            for (int r = rowIni; r < rowEnd - (c * 2); r++)
                flag[r + c][c] = 0;
        }

        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = 0;
        colEnd = widht;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni + r + 1; c < colEnd; c += 1) {
                flag[r][c] = GREEN;
                flag[height - 1 - r][c] = RED;
            }
        }

        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = 0;
        colEnd = widht;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni + r + 1; c < colEnd; c += 1) {
                flag[r][c] = WHITE;

            }
        }

        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = (height * 1) / 3;
        colEnd = (widht * 3) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni + 1; c < colEnd; c += 1)
                flag[r][c] = WHITE;
        }
        return flag;
    }

    public static int[][] createDNKflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 2) / 6; // |
        rowEnd = (height * 3) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 6) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 2) / 12;
        colEnd = (width * 3) / 12;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 0) / 6; // |
        rowEnd = (height * 2) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 1) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 3) / 6; // |
        rowEnd = (height * 6) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 1) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;
        rowIni = (height * 3) / 6; // |
        rowEnd = (height * 6) / 6;
        colIni = (width * 2) / 8; // --
        colEnd = (width * 8) / 8;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 0) / 2; // |
        rowEnd = (height * 4) / 12;
        colIni = (width * 2) / 8; // --
        colEnd = (width * 8) / 8;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;


        rowIni = (height * 2) / 6; // |
        rowEnd = (height * 3) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 6) / 6;
        
                for (int r = rowIni; r < rowEnd; r += 1)
                    for (int c = colIni; c < colEnd; c += 1)
                        flag[r][c] = WHITE;
        
                rowIni = (height * 0) / 2;
                rowEnd = (height * 2) / 2;
                colIni = (width * 2) / 12;
                colEnd = (width * 3) / 12;
        
                for (int r = rowIni; r < rowEnd; r += 1)
                    for (int c = colIni; c < colEnd; c += 1)
                        flag[r][c] = WHITE;

        return flag;

    }

    public static int[][] createFINflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 2) / 6; // |
        rowEnd = (height * 4) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 6) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 2) / 12;
        colEnd = (width * 4) / 12;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 6; // |
        rowEnd = (height * 2) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 1) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 4) / 6; // |
        rowEnd = (height * 6) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 1) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 4) / 6; // |
        rowEnd = (height * 6) / 6;
        colIni = (width * 4) / 12; // --
        colEnd = (width * 12) / 12;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 0) / 2; // |
        rowEnd = (height * 4) / 12;
        colIni = (width * 4) / 12; // --
        colEnd = (width * 12) / 12;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        return flag;

    }

    public static int[][] createUSAflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        for (int b = 0; b < 12; b += 1) {
            rowIni = (height * b) / 12;
            rowEnd = (height * (b + 1)) / 12;
            colIni = (b < 6) ? (height * 1) / 2 : (width * 0) / 1;
            colEnd = (width * 1) / 1;

            for (int r = rowIni; r < rowEnd; r += 1) {

                for (int c = colIni; c < colEnd; c += 1) {

                    if (b % 2 == 0)

                        flag[r][c] = RED;
                    else
                        flag[r][c] = WHITE;

                }
            }
        }

        rowIni = (height * 0) / 6; // |
        rowEnd = (height * 3) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 2) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        return flag;
    }

    public static int[][] createSUZflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 1; // |
        rowEnd = (height * 1) / 1;
        colIni = (width * 0) / 1; // --
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 4) / 12; // |
        rowEnd = (height * 8) / 12;
        colIni = (width * 5) / 20; // --
        colEnd = (width * 15) / 20;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 12;
        rowEnd = (height * 11) / 12;
        colIni = (width * 9) / 20;
        colEnd = (width * 12) / 20;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        return flag;
    }

    public static int[][] createNORflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 2) / 6; // |
        rowEnd = (height * 4) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 6) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 2) / 12;
        colEnd = (width * 4) / 12;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 0) / 6; // |
        rowEnd = (height * 2) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 1) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 4) / 6; // |
        rowEnd = (height * 6) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 1) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 4) / 6; // |
        rowEnd = (height * 6) / 6;
        colIni = (width * 4) / 12; // --
        colEnd = (width * 12) / 12;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 0) / 2; // |
        rowEnd = (height * 4) / 12;
        colIni = (width * 4) / 12; // --
        colEnd = (width * 12) / 12;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 5) / 12; // |
        rowEnd = (height * 7) / 12;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 6) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 4) / 20;
        colEnd = (width * 6) / 20;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni + 1; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        return flag;

    }

    public static int[][] createRDflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 8; // |
        rowEnd = (height * 4) / 8;
        colIni = (width * 0) / 4; // --
        colEnd = (width * 2) / 4;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 3) / 6; // |
        rowEnd = (height * 6) / 6;
        colIni = (width * 0) / 6; // --
        colEnd = (width * 3) / 6;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;
        rowIni = (height * 3) / 6; // |
        rowEnd = (height * 6) / 6;
        colIni = (width * 4) / 8; // --
        colEnd = (width * 8) / 8;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 2; // |
        rowEnd = (height * 4) / 12;
        colIni = (width * 4) / 8; // --
        colEnd = (width * 8) / 8;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 0) / 2; // |
        rowEnd = (height * 2) / 2;
        colIni = (width * 8) / 20; // --
        colEnd = (width * 12) / 20;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 8) / 20;
        rowEnd = (height * 12) / 20;
        colIni = (width * 0) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        return flag;

    }

    public static int[][] createBENflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 3;
        colEnd = (width * 1) / 3;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = GREEN;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 3;
        colEnd = (width * 1) / 3;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = GREEN;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 1) / 3;
        colEnd = (width * 3) / 3;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 1) / 3;
        colEnd = (width * 3) / 3;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;

        return flag;

    }

    public static void main(String[] args) {

        int[][] flag_matrix = new int[24][48];

        for (int h = 1; h <= 2; h += 1)
            for (int w = 1; w <= 2; w += 1) {

                flag_matrix = new int[12 * h][24 * w];
                flag_matrix = createBENflag(h * 12, w * 24);

                JOptionPaneArrays.showColorArray2D(null, flag_matrix);
            }

    }
}
