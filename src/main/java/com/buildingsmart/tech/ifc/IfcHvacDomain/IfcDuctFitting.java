// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("760a81f2-5681-4856-8e70-144d4bd1d61a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctFitting extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting
{
	@DataMember(Order = 0)
	@Guid("4f963f62-427b-4df0-9553-0271dd9a6efe")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcDuctFittingTypeEnum predefinedType;


	public IfcDuctFitting()
	{
	}

	public IfcDuctFitting(String globalId)
	{
		super(globalId);
	}

	public IfcDuctFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDuctFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

