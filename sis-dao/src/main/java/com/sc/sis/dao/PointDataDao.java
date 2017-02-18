package com.sc.sis.dao;

import java.util.List;

import com.sc.sis.model.PointData;
import com.sc.sis.model.PointDataExample;

public interface PointDataDao {
	/**
	 * 根据Example获取点名列表
	 */
	List<PointData> getPintDataListByExample(PointDataExample example);

}