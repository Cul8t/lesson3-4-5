package ru.sbrf.demo.entity;

import ru.sbrf.demo.life.Cell;
import ru.sbrf.demo.life.GameField;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LifeGameField extends GameField {

    public LifeGameField(List<Cell> cells, BigInteger width, BigInteger height) {
        super();
        setCells(cells);
        setWidth(width);
        setHeight(height);
    }

    public LifeGameField() {
    }

    public Cell getCell(int x, int y) {
        int cellIndex = (y * getHeight().intValue()) + x;
        return getCells().get(cellIndex);
    }


    public List<Cell> getNeighborCells(Cell cell) {
        List<Cell> cells = new ArrayList<>();
        for (int dX = -1; dX < 2; dX++) {
            for (int dY = -1; dY < 2; dY++) {
                int x = cell.getX().intValue() + dX;
                int y = cell.getY().intValue() + dY;
                if (dX == 0 && dY == 0) continue;
                if (x < 0 || x >= getWidth().intValue()) continue;
                if (y < 0 || y >= getHeight().intValue()) continue;
                cells.add(getCell(x, y));
            }
        }
        return cells;
    }

    public Long getCountOfNeighborAliveCells(Cell cell) {

        return getNeighborCells(cell).stream().filter(Cell::getIsAlive).count();

    }

    public String print() {
        StringBuilder field = new StringBuilder();
        for (int x = 0; x < getWidth().intValue(); x++) {
            field.append("\n");
            for (int y = 0; y < getHeight().intValue(); y++) {
                if ((getCell(x,y).getIsAlive())) {
                    field.append(" * ");
                } else field.append(" . ");
            }
        }

        return field.toString();
    }


    public LifeGameField nextGeneration(LifeGameField gameField) {
         List<Cell> cells = getCells().stream().map( (cell ) -> {
            long count = getCountOfNeighborAliveCells(cell);
            if (!cell.getIsAlive() && count == 3) {
                return new LifeCell(true, cell.getX(), cell.getY()); }
            return new LifeCell((count == 2 || count == 3) && cell.getIsAlive(), cell.getX(), cell.getY());
        } ).collect(Collectors.toList());
        return new LifeGameField(cells, getWidth(), getHeight());

    }



}
