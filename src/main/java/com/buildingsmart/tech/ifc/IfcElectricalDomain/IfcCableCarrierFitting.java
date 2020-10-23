// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("47539a87-e549-4786-85f9-b5b8c8fb705b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableCarrierFitting extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting
{
	@Description("<p>Identifies the predefined types of cable carrier fitting from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Guid("0917bc75-0d6c-43bd-ba87-63cf43158146")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCableCarrierFittingTypeEnum predefinedType;


	public IfcCableCarrierFitting()
	{
	}

	public IfcCableCarrierFitting(String globalId)
	{
		super(globalId);
	}

	public IfcCableCarrierFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableCarrierFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

