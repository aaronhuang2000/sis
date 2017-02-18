package com.sc.sis.controller.pc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.sis.model.PointData;
import com.sc.sis.model.PointDataExample;
import com.sc.sis.service.PointDataService;
import com.sc.sis.util.JsonUtil;

@Controller
@RequestMapping("pointDataManage_pc")
public class PointDataManageController {
	
	@Autowired
	PointDataService pointService;
	
	public String toPage(Model model){
		List<PointData> pointList = pointService.getPintDataListByExample(new PointDataExample());
		model.addAttribute("pointList", JsonUtil.toJson(pointList));
		return "pc/pointDataManage";
	}
	
	
}