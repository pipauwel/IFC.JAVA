// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("686e69fb-789c-4cef-a1b2-e9bb3345a558")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConstructionProductResource extends IfcConstructionResource
{
	@Description("Defines types of construction product resources.  <blockquote class=\"change-ifc2x4\">IFC4 New attribute.</blockquote>")
	@DataMember(Order = 0)
	@Guid("b9b8af92-d306-433d-b5ca-40dae047b2ba")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcConstructionProductResourceTypeEnum predefinedType;


	public IfcConstructionProductResource()
	{
	}

	public IfcConstructionProductResource(String globalId)
	{
		super(globalId);
	}

	public IfcConstructionProductResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcConstructionProductResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

