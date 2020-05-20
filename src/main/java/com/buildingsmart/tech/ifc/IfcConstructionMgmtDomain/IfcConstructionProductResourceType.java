// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f91f11b0-b549-4807-8ebb-0801f1abe42a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConstructionProductResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of construction product resources.  <p></p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("c781b383-53af-42a9-8adc-fcc77aaea3d3")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcConstructionProductResourceTypeEnum predefinedType;


	public IfcConstructionProductResourceType()
	{
	}

	public IfcConstructionProductResourceType(String globalId, IfcConstructionProductResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcConstructionProductResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcConstructionProductResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

