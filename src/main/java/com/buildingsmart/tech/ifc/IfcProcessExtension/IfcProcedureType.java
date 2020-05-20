// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a91157ae-e871-49c4-bbff-a0b9224d6a3a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProcedureType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess
{
	@Description("Identifies the predefined types of a procedure from which       the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("d373b84f-93fb-46fc-be52-d46907ae3f8b")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcProcedureTypeEnum predefinedType;


	public IfcProcedureType()
	{
	}

	public IfcProcedureType(String globalId, IfcProcedureTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcProcedureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProcedureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

