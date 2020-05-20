// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("fd9b5bec-e42a-4c5e-bc8a-bd72ae76b43a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableCarrierFittingType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@Description("<p>Identifies the predefined types of cable carrier fitting from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("8608a724-6294-4993-ac2b-b30f39f1853a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCableCarrierFittingTypeEnum predefinedType;


	public IfcCableCarrierFittingType()
	{
	}

	public IfcCableCarrierFittingType(String globalId, IfcCableCarrierFittingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCableCarrierFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableCarrierFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

