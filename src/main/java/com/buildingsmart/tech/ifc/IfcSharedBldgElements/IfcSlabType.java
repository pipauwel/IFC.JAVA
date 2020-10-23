// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c5119b23-0614-4223-839d-d6e3f491a378")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSlabType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a slab element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("ce96f799-1e75-4c3d-a10e-ea5f31bda91e")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSlabTypeEnum predefinedType;


	public IfcSlabType()
	{
	}

	public IfcSlabType(String globalId, IfcSlabTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSlabTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSlabTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

