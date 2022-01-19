package com.timesheet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.timesheet.impl.DefaultTimeSheet;
import com.timesheet.model.Timesheet;

public class Hourstest {
	DefaultTimeSheet ts;

	public void setup() {
		ts = new DefaultTimeSheet();
	}

	@Test
	void test1() {
		
		DefaultTimeSheet ts=new DefaultTimeSheet();
		Timesheet timesheet=ts.createTimesheet(0, 0, null, null, null, 0, null);
		
	assertTrue(timesheet.getHours() <=8);
	
	
	}

	@Test
	void test2() {
		
		DefaultTimeSheet ts=new DefaultTimeSheet();
		Timesheet timesheet=ts.createTimesheet(0, 0, null, null, null, 0, null);
		
	assertTrue(timesheet.getHours() <=0);

}

}
