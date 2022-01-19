package com.timesheet;

import java.util.Date;
import com.timesheet.model.TimeSheet;

public interface TimeSheetInterface {
	
	public TimeSheet createTimesheet(int timesheetId, int empId, Date date, String activity, String descripition, float hrs, String status) ;

	



}

