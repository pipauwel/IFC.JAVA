// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b4f9ba21-6b82-4bbb-a406-3aca970b5688")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTransportElementType extends IfcElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined types to define the particular type of the transport element. There may be property set definitions available for each predefined type.")
	@Required()
	@Guid("59d54e7c-05ef-4b69-8197-5d552e63c8f6")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcTransportElementTypeEnum predefinedType;


	public IfcTransportElementType()
	{
	}

	public IfcTransportElementType(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcTransportElementTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcTransportElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcProductExtension.IfcTransportElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

