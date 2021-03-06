package com.analytic.portal.module.report.service.interfaces;

import java.util.List;
import java.util.Map;

import com.analytic.portal.module.report.model.ReportTool;

/**
 * 报表工具service
 * @author pengbo
 * 2016-03-09
 */
public interface ReportToolService {

	public boolean deleteReportToolById(String id) throws Exception;
	
	public boolean addReportTool(ReportTool reportTool) throws Exception; 
	
	public boolean updateReportTool(ReportTool reportTool) throws Exception; 
	
	public ReportTool getReportToolById(String id) throws Exception;
	
	public List<ReportTool> getReportToolList() throws Exception;

	@SuppressWarnings("rawtypes")
	public ReportTool getReportTool(Map formMap) throws Exception;
	
	@SuppressWarnings("rawtypes")
	public Map getReportToolListByPage(Map formMap) throws Exception;
	
}
