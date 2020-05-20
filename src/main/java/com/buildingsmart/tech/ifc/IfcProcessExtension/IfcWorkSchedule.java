// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("863af35b-d9f7-458e-816e-351ab24b707b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWorkSchedule extends IfcWorkControl
{
	@Description("Identifies the predefined types of a work schedule from which       the type required may be set.")
	@DataMember(Order = 0)
	@Guid("9e068dd0-fcd2-4639-937b-c0dc5dc78127")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcWorkScheduleTypeEnum predefinedType;


	public IfcWorkSchedule()
	{
	}

	public IfcWorkSchedule(String globalId, String creationDate, String startTime)
	{
		super(globalId, creationDate, startTime);
	}

	public IfcWorkScheduleTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWorkScheduleTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

