// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e3d3bfe0-c86d-4073-9f99-8d5705ca829c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcInterceptor extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDevice
{
	@DataMember(Order = 0)
	@Guid("56e98bc5-d9b1-41ef-ac13-f9517c351b31")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcInterceptorTypeEnum predefinedType;


	public IfcInterceptor()
	{
	}

	public IfcInterceptor(String globalId)
	{
		super(globalId);
	}

	public IfcInterceptorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcInterceptorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

