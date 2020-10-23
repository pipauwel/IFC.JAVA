// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0664744b-65e2-41ea-9b44-6b0a1749f000")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFooting extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("The generic type of the footing.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional.  Type information can be provided by <em>IfcRelDefinesByType</em> and <em>IfcFootingType</em>.</font></blockquote>")
	@DataMember(Order = 0)
	@Guid("ca295c37-cfea-4e1e-b397-13dac2aa1bd0")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFootingTypeEnum predefinedType;


	public IfcFooting()
	{
	}

	public IfcFooting(String globalId)
	{
		super(globalId);
	}

	public IfcFootingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFootingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

