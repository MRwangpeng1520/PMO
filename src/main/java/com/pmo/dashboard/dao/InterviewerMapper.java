package com.pmo.dashboard.dao;

import java.util.List;
import java.util.Map;
import com.pmo.dashboard.entity.Interviewer;

public interface InterviewerMapper
{
	
	public List<Interviewer> queryInterviewerList(Map<String,Object> map);
	public int queryInterviewerCount(Map<String,Object> map);
	public List<Interviewer> queryAllInterviewer(Map<String,Object> map);
	public boolean interviewerRenDing(Interviewer interviewer);
	//执行插入
	public int insertInterviewerToUser(Interviewer interviewer);
	public int update(Interviewer interviewer);
	public Interviewer select(String employeeId);
}
