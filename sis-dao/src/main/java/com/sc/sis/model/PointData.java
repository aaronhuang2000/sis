package com.sc.sis.model;

public class PointData {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point_data.id
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point_data.poin_name
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    private String poinName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point_data.unit
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column point_data.desc
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_data.id
     *
     * @return the value of point_data.id
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_data.id
     *
     * @param id the value for point_data.id
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_data.poin_name
     *
     * @return the value of point_data.poin_name
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    public String getPoinName() {
        return poinName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_data.poin_name
     *
     * @param poinName the value for point_data.poin_name
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    public void setPoinName(String poinName) {
        this.poinName = poinName == null ? null : poinName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_data.unit
     *
     * @return the value of point_data.unit
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_data.unit
     *
     * @param unit the value for point_data.unit
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column point_data.desc
     *
     * @return the value of point_data.desc
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column point_data.desc
     *
     * @param desc the value for point_data.desc
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}