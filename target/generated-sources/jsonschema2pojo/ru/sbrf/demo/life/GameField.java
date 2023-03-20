
package ru.sbrf.demo.life;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "height",
    "width",
    "cells"
})
@Generated("jsonschema2pojo")
public class GameField implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    private BigInteger height;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("width")
    private BigInteger width;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cells")
    private List<Cell> cells = new ArrayList<Cell>();
    private final static long serialVersionUID = -5459562813857694052L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    public BigInteger getHeight() {
        return height;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    public void setHeight(BigInteger height) {
        this.height = height;
    }

    public GameField withHeight(BigInteger height) {
        this.height = height;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("width")
    public BigInteger getWidth() {
        return width;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("width")
    public void setWidth(BigInteger width) {
        this.width = width;
    }

    public GameField withWidth(BigInteger width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cells")
    public List<Cell> getCells() {
        return cells;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cells")
    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    public GameField withCells(List<Cell> cells) {
        this.cells = cells;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GameField.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("cells");
        sb.append('=');
        sb.append(((this.cells == null)?"<null>":this.cells));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.cells == null)? 0 :this.cells.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameField) == false) {
            return false;
        }
        GameField rhs = ((GameField) other);
        return ((((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width)))&&((this.cells == rhs.cells)||((this.cells!= null)&&this.cells.equals(rhs.cells))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
