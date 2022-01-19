package com.timesheet.test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import com.timesheet.impl.DefaultTimeSheet;
import com.timesheet.model.TimeSheet;

class TimeSheetInterfaceTest {

	@Test
	void test1() {
		DefaultTimeSheet ts = new DefaultTimeSheet();
		TimeSheet timesheet = ts.createTimesheet(0, 0, null, null, null, 0, null);
		
	    assertTrue(timesheet.getHrs()<=8);

}
	
	
	@Test
	void test2() {
		DefaultTimeSheet ts = new DefaultTimeSheet();
		TimeSheet timesheet = ts.createTimesheet(0, 0, null, null, null, 0, null);
	    assertTrue(timesheet.getHrs()<=0);

	
	
}
}
