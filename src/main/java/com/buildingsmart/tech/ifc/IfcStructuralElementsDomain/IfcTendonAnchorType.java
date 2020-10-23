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

@Guid("6591c79a-0b26-4315-8d59-cd0e5ef03555")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTendonAnchorType extends IfcReinforcingElementType
{
	@Description("Subtype of tendon anchor.")
	@DataMember(Order = 0)
	@Required()
	@Guid("bc3db412-e609-4c5f-8be2-4f8b21f27a08")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcTendonAnchorTypeEnum predefinedType;


	public IfcTendonAnchorType()
	{
	}

	public IfcTendonAnchorType(String globalId, IfcTendonAnchorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcTendonAnchorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTendonAnchorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

