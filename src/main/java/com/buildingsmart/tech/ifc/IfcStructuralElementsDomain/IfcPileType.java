// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3694a657-5c71-4fa9-8223-0f80ab28ae3b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPileType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Subtype of pile.")
	@DataMember(Order = 0)
	@Required()
	@Guid("2fa8112b-beb2-4918-976d-46637c548b07")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcPileTypeEnum predefinedType;


	public IfcPileType()
	{
	}

	public IfcPileType(String globalId, IfcPileTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcPileTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPileTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

