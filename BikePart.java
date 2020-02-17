package com.company;

import java.util.Comparator;

public class BikePart implements Comparable<BikePart> {

    private String partName;
    private int partNumber;
    private double price;
    private double salesPrice;
    private boolean onSale;
    private int quantity;


    /**
     * @param partName This is the name of the Bikepart
     * @param partNumber This is the number of the Bikepart
     * @param price This is the price of the Bikepart
     * @param salesPrice This is the price of the item on sale
     * @param onSale this is the value if the item is on sale
     * The most of the methods are setters and getters
     *
     */
    public BikePart() {}

    public BikePart(String partName, int partNumber, double price, double salesPrice, boolean onSale, int quantity) {
        this.partName = partName;
        this.partNumber = partNumber;
        this.price = price;
        this.salesPrice = salesPrice;
        this.onSale = onSale;
        this.quantity = quantity;
    }

    /**
     * Sets the Bicycle Part name
     * @param x the local part's name
     */
    public void setPartName(String x) {
        this.partName = x;
    }

    /**
     * Retrieves the Bicycle Part's name
      * @return the name
     */
    public String getPartName() {
        return this.partName;
    }

    /**
     * Sets the Bicycle Part number
     * @param x the local part's number
     */
    public void setPartNumber(int x) {
        this.partNumber = x;
    }

    /**
     * Retrieves the Bicycle Part's number
     * @return the number
     */
    public int getPartNumber() {
        return this.partNumber;
    }

    /**
     * Sets the Bicycle Part price
     * @param x the local part's price
     */
    public void setPrice(double x) {
        this.price = x;
    }

    /**
     * Retrieves the Bicycle Part's price
     * @return the price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the Bicycle Part's price on sale
     * @param x the local part's sale price
     */
    public void setSalesPrice(double x) {
        this.salesPrice = x;
    }

    /**
     * Retrieves the Bicycle Part's on sale price
     * @return the on sale price
     */
    public double getSalesPrice() {
        return this.salesPrice;
    }

    /**
     * Sets the Bicycle Part's price on sale
     * @param x the local part's sale price
     */
    public void setOnSale(boolean x) {
        this.onSale = x;
    }

    /**
     * Retrieves whether the Bicycle Part is on sale price or not
     * @return True/False if the part is on sale
     */
    public boolean getOnSale() {
        return this.onSale;
    }

    public void setQuantity(int x) {this.quantity = x; }

    public int getQuantity() { return this.quantity; }

    /**
     * converts output to be well formatted
     * @return formatted output
     */
    public String toString() {
        return("name: " + partName + " id: " + partNumber + " price: " + price);
    }


    public int compareTo(BikePart part) {
        return getPartName().compareTo(part.getPartName());
    }

}