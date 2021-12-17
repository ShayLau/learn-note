package com.copy;

/**
 * 商品信息
 *
 * @author  lemon
 */
public class Commodity implements Cloneable{

    private String commodityName;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityName='" + commodityName + '\'' +
                '}';
    }

}
