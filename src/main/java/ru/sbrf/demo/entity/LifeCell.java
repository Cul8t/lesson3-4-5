package ru.sbrf.demo.entity;

import ru.sbrf.demo.life.Cell;

import java.math.BigInteger;

public class LifeCell extends Cell {


    public LifeCell(boolean isAlive, BigInteger x, BigInteger y) {
        super ();
        setIsAlive(isAlive);
        setX(x);
        setY(y);
    }
}
