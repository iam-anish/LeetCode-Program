class Solution {
   public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<Cell> cells = new ArrayList<>();

        for (int row = 0; row < rows; ++row)
            for (int column = 0; column < cols; ++column)
                cells.add(new Cell(row, column, Math.abs(row - rCenter) + Math.abs(column - cCenter)));

        return cells.stream().sorted(Comparator.comparing(Cell::distance)).map(cell -> new int[]{cell.row(), cell.column()}).toArray(int[][]::new);
    }

    private record Cell(int row, int column, int distance) {}
}
