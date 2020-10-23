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

@Guid("1802d7e1-8d28-4916-80dd-a5f0a21f588b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWorkPlan extends IfcWorkControl
{
	@Description("Identifies the predefined types of a work plan from which       the type required may be set.")
	@DataMember(Order = 0)
	@Guid("d78ca6cb-0dfb-4ca5-acbb-8dd5ea6f5a0e")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcWorkPlanTypeEnum predefinedType;


	public IfcWorkPlan()
	{
	}

	public IfcWorkPlan(String globalId, String creationDate, String startTime)
	{
		super(globalId, creationDate, startTime);
	}

	public IfcWorkPlanTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWorkPlanTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

