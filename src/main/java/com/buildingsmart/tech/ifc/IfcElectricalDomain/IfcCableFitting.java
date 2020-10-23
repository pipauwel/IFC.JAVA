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

@Guid("a981fcc0-253f-4511-8e27-f490e28f4ada")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableFitting extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting
{
	@Description("<p>Identifies the predefined types of cable fitting from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Guid("acc5a78e-537d-4725-bbec-f998f3e31f25")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCableFittingTypeEnum predefinedType;


	public IfcCableFitting()
	{
	}

	public IfcCableFitting(String globalId)
	{
		super(globalId);
	}

	public IfcCableFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

