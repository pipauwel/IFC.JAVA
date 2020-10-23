// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcRatioMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0ae997a0-8ed2-4ce0-aaf7-1b4d33ce64bb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToGroupByFactor extends IfcRelAssignsToGroup
{
	@Description("Factor provided as a ratio measure that identifies the fraction or weighted factor that applies to the group assignment.")
	@DataMember(Order = 0)
	@Required()
	@Guid("86db296d-a43f-4cfa-a264-7820e7638718")
	@JacksonXmlProperty(isAttribute=false, localName = "factor")
	private IfcRatioMeasure factor;


	public IfcRelAssignsToGroupByFactor()
	{
	}

	public IfcRelAssignsToGroupByFactor(String globalId, IfcObjectDefinition[] relatedObjects, IfcGroup relatingGroup, IfcRatioMeasure factor)
	{
		super(globalId, relatedObjects, relatingGroup);
		this.factor = factor;
	}

	public IfcRatioMeasure getFactor() {
		return this.factor;
	}

	public void setFactor(IfcRatioMeasure factor) {
		this.factor = factor;
	}


}

