// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c42cad26-bc65-4c32-b181-80ca37d4d95f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTaskTimeRecurring extends IfcTaskTime
{
	@DataMember(Order = 0)
	@Required()
	@Guid("3c6d532f-0c6f-40ab-8054-31a135a37a4b")
	@JacksonXmlProperty(isAttribute=false, localName = "recurrence")
	private IfcRecurrencePattern recurrence;


	public IfcTaskTimeRecurring()
	{
	}

	public IfcTaskTimeRecurring(IfcRecurrencePattern recurrence)
	{
		this.recurrence = recurrence;
	}

	public IfcRecurrencePattern getRecurrence() {
		return this.recurrence;
	}

	public void setRecurrence(IfcRecurrencePattern recurrence) {
		this.recurrence = recurrence;
	}


}

