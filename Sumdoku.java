public class Sumdoku {
    public static void main(String[] args) {
        SumdokuGrid grelha = new SumdokuGrid(3);
        grelha.fill(rowOfSquare(5, 3), columnOfSquare(5, 3), 5);
        int linha, coluna;
        linha = rowOfSquare(75, 9);
        coluna = columnOfSquare(3, 4);
        System.out.println("Linha: " + linha + " / Coluna: " + coluna);
        System.out.println(grelha.toString());
    }

    public static int rowOfSquare(int square, int gridSize) {
        int row = 0;
        do {
            square -= gridSize;
            row++;
        } while(square > 0);

        return row;
    }

    public static int columnOfSquare(int square, int gridSize) {
        int column = 0;
        if(square < gridSize) {
            square += gridSize;
        }
        while(square > gridSize) {
            square -= gridSize;
            column = square;
        }

        return column;
    }

    public static boolean isValidForPuzzle(SumdokuGrid grid) {
        if(grid == null) {
            return false;
        }
        return true;
    }
}