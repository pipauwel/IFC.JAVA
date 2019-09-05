// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0ae997a0-8ed2-4ce0-aaf7-1b4d33ce64bb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToGroupByFactor extends IfcRelAssignsToGroup
{
	@JacksonXmlProperty(isAttribute=true, localName = "Factor")
	@Description("Factor provided as a ratio measure that identifies the fraction or weighted factor that applies to the group assignment.")
	@Required()
	@Guid("86db296d-a43f-4cfa-a264-7820e7638718")
	private double factor;


	public IfcRelAssignsToGroupByFactor()
	{
	}

	public IfcRelAssignsToGroupByFactor(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition[] relatedObjects, com.buildingsmart.tech.ifc.IfcKernel.IfcGroup relatingGroup, double factor)
	{
		super(globalId, relatedObjects, relatingGroup);
		this.factor = factor;
	}

	public double getFactor() {
		return this.factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}


}

