
package ru.sbrf.demo.life;

import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "x",
    "y",
    "isAlive"
})
@Generated("jsonschema2pojo")
public class Cell implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("x")
    private BigInteger x;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("y")
    private BigInteger y;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isAlive")
    private Boolean isAlive;
    private final static long serialVersionUID = 2872760557799104952L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("x")
    public BigInteger getX() {
        return x;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("x")
    public void setX(BigInteger x) {
        this.x = x;
    }

    public Cell withX(BigInteger x) {
        this.x = x;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("y")
    public BigInteger getY() {
        return y;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("y")
    public void setY(BigInteger y) {
        this.y = y;
    }

    public Cell withY(BigInteger y) {
        this.y = y;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isAlive")
    public Boolean getIsAlive() {
        return isAlive;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isAlive")
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Cell withIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cell.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("x");
        sb.append('=');
        sb.append(((this.x == null)?"<null>":this.x));
        sb.append(',');
        sb.append("y");
        sb.append('=');
        sb.append(((this.y == null)?"<null>":this.y));
        sb.append(',');
        sb.append("isAlive");
        sb.append('=');
        sb.append(((this.isAlive == null)?"<null>":this.isAlive));
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
        result = ((result* 31)+((this.x == null)? 0 :this.x.hashCode()));
        result = ((result* 31)+((this.y == null)? 0 :this.y.hashCode()));
        result = ((result* 31)+((this.isAlive == null)? 0 :this.isAlive.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cell) == false) {
            return false;
        }
        Cell rhs = ((Cell) other);
        return ((((this.x == rhs.x)||((this.x!= null)&&this.x.equals(rhs.x)))&&((this.y == rhs.y)||((this.y!= null)&&this.y.equals(rhs.y))))&&((this.isAlive == rhs.isAlive)||((this.isAlive!= null)&&this.isAlive.equals(rhs.isAlive))));
    }


}
