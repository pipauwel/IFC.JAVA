// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0cce4f12-90b1-4e02-a09b-0dab4f9a731c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProcedure extends com.buildingsmart.tech.ifc.IfcKernel.IfcProcess
{
	@Description("Identifies the predefined types of a procedure from which       the type required may be set.")
	@DataMember(Order = 0)
	@Guid("3f02d565-aa4a-4a70-9763-24f2ee9e0e79")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcProcedureTypeEnum predefinedType;


	public IfcProcedure()
	{
	}

	public IfcProcedure(String globalId)
	{
		super(globalId);
	}

	public IfcProcedureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProcedureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

