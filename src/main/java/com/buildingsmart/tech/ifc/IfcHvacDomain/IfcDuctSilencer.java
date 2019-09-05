// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a31bfbd0-af30-4a94-a395-16bd8b02ae79")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctSilencer extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("aaa8fe96-302d-489d-8e43-b0705cec0bc4")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctSilencerTypeEnum predefinedType;


	public IfcDuctSilencer()
	{
	}

	public IfcDuctSilencer(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctSilencerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctSilencerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

