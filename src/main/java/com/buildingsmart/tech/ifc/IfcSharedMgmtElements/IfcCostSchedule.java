// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedMgmtElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDateTime;
import com.buildingsmart.tech.ifc.IfcKernel.IfcControl;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ff373331-377a-4ddd-8781-060d4b4f0828")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCostSchedule extends IfcControl
{
	@Description("Predefined generic type for a cost schedule that is specified in an enumeration. There may be a property set given specifically for the predefined types.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been made optional.</blockquote>")
	@DataMember(Order = 0)
	@Guid("11588a64-9704-464e-859a-69c5c7ed8693")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCostScheduleTypeEnum predefinedType;

	@Description("The current status of a cost schedule. Examples of status values that might be used for a cost schedule status include:  <ul>  <li> PLANNED </li>  <li> APPROVED </li>  <li> AGREED </li>  <li> ISSUED </li>  <li> STARTED </li>  </ul>")
	@DataMember(Order = 1)
	@Guid("69cf6268-7c30-4f3d-a314-486cc0140ad1")
	@JacksonXmlProperty(isAttribute=false, localName = "status")
	private IfcLabel status;

	@Description("The date and time on which the cost schedule was submitted.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@DataMember(Order = 2)
	@Guid("01517834-9aeb-40dd-9b60-86a3bc514efc")
	@JacksonXmlProperty(isAttribute=false, localName = "submittedOn")
	private IfcDateTime submittedOn;

	@Description("The date and time that this cost schedule is updated; this allows tracking the schedule history.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@DataMember(Order = 3)
	@Guid("99952380-22fd-4754-9d3d-84dca6afe470")
	@JacksonXmlProperty(isAttribute=false, localName = "updateDate")
	private IfcDateTime updateDate;


	public IfcCostSchedule()
	{
	}

	public IfcCostSchedule(String globalId)
	{
		super(globalId);
	}

	public IfcCostScheduleTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCostScheduleTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcLabel getStatus() {
		return this.status;
	}

	public void setStatus(IfcLabel status) {
		this.status = status;
	}

	public IfcDateTime getSubmittedOn() {
		return this.submittedOn;
	}

	public void setSubmittedOn(IfcDateTime submittedOn) {
		this.submittedOn = submittedOn;
	}

	public IfcDateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(IfcDateTime updateDate) {
		this.updateDate = updateDate;
	}


}

