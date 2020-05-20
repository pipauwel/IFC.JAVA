// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("43fbb978-b475-40b1-8fa8-494040d73aa4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSubContractResource extends IfcConstructionResource
{
	@Description("Defines types of subcontract resources.  <blockquote class=\"change-ifc2x4\">IFC4 New attribute.</blockquote>")
	@DataMember(Order = 0)
	@Guid("a02a4c25-90a4-46b2-93b8-146a851d4535")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSubContractResourceTypeEnum predefinedType;


	public IfcSubContractResource()
	{
	}

	public IfcSubContractResource(String globalId)
	{
		super(globalId);
	}

	public IfcSubContractResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSubContractResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

