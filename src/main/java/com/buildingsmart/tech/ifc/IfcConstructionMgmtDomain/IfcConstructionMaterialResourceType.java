// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("affcff56-3734-44c1-8c8d-7681c02ae21b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConstructionMaterialResourceType extends IfcConstructionResourceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Defines types of construction material resources.  <p></p>")
	@Required()
	@Guid("bebb90d1-4de9-4d43-9119-c0f44b7dccc9")
	private com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionMaterialResourceTypeEnum predefinedType;


	public IfcConstructionMaterialResourceType()
	{
	}

	public IfcConstructionMaterialResourceType(String globalId, com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionMaterialResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionMaterialResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionMaterialResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

