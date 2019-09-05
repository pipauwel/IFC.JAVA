// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0d780540-b4aa-49d6-a0d5-4c6e14da3427")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEventTime extends IfcSchedulingTime
{
	@JacksonXmlProperty(isAttribute=true, localName = "ActualDate")
	@Description("The date on which an event actually occurs. It is a measured value.")
	@Guid("24660ff7-a750-4775-a759-5f64d94a1e08")
	private String actualDate;

	@JacksonXmlProperty(isAttribute=true, localName = "EarlyDate")
	@Description("The earliest date on which an event can occur. It is a calculated value.")
	@Guid("3b4e97d7-431a-44f5-9d89-13ba3b5cba59")
	private String earlyDate;

	@JacksonXmlProperty(isAttribute=true, localName = "LateDate")
	@Description("The latest date on which an event can occur. It is a calculated value.")
	@Guid("37d387ff-91bb-4657-bfbb-84c9979020c7")
	private String lateDate;

	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleDate")
	@Description("The date on which an event is scheduled to occur.       The value might be measured or somehow calculated, which is defined by      <em>ScheduleDataOrigin</em>.")
	@Guid("38045ee0-1365-46a3-b57b-32c6650aa56c")
	private String scheduleDate;


	public IfcEventTime()
	{
	}

	public String getActualDate() {
		return this.actualDate;
	}

	public void setActualDate(String actualDate) {
		this.actualDate = actualDate;
	}

	public String getEarlyDate() {
		return this.earlyDate;
	}

	public void setEarlyDate(String earlyDate) {
		this.earlyDate = earlyDate;
	}

	public String getLateDate() {
		return this.lateDate;
	}

	public void setLateDate(String lateDate) {
		this.lateDate = lateDate;
	}

	public String getScheduleDate() {
		return this.scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}


}

