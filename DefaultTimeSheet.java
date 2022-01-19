package com.timesheet.impl;

import java.util.Date;




import com.timesheet.model.TimeSheet;
import com.timesheet.TimeSheetInterface;

public class DefaultTimeSheet  implements TimeSheetInterface {


	
	

	@Override
	public TimeSheet createTimesheet(int timesheetId, int empId, Date date, String activity, String descripition,
	float hrs, String status) {
	TimeSheet timeSheet = new TimeSheet();
	timeSheet.setTimesheetId(100);
	timeSheet.setEmpId(21507);
	timeSheet.setDate(new Date());
	timeSheet.setActivity("Training ");
	timeSheet.setDescripition("test case to create time sheet");
	timeSheet.setHrs(7);
	timeSheet.setStatus("status");
	return timeSheet;
	}



}
