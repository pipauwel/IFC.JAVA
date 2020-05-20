// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("297645fa-0024-45cd-8573-d15fd241897a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcZone extends IfcSystem
{
	@Description("Long name for a zone, used for informal purposes. It should be used, if available, in conjunction with the inherited <em>Name</em> attribute.  <blockquote class=\"note\">NOTE&nbsp; In many scenarios the <em>Name</em> attribute refers to the short name or number of a zone, and the <em>LongName</em> refers to the full name.    </blockquote>  </br>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 0)
	@Guid("58291dd6-3dbe-48bb-bb0d-0856aa595dd6")
	@JacksonXmlProperty(isAttribute=false, localName = "longName")
	private IfcLabel longName;


	public IfcZone()
	{
	}

	public IfcZone(String globalId)
	{
		super(globalId);
	}

	public IfcLabel getLongName() {
		return this.longName;
	}

	public void setLongName(IfcLabel longName) {
		this.longName = longName;
	}


}

