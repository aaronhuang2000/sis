package com.sc.sis.mapper;

import com.sc.sis.model.PointData;
import com.sc.sis.model.PointDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    long countByExample(PointDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    int deleteByExample(PointDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    int insert(PointData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    int insertSelective(PointData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    List<PointData> selectByExample(PointDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    PointData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    int updateByExampleSelective(@Param("record") PointData record, @Param("example") PointDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    int updateByExample(@Param("record") PointData record, @Param("example") PointDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    int updateByPrimaryKeySelective(PointData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_data
     *
     * @mbg.generated Sat Feb 18 22:02:24 CST 2017
     */
    int updateByPrimaryKey(PointData record);
}