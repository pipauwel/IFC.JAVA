// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a50d65b5-c2d5-47ea-a0a6-786fe005e10b")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcManifoldSolidBrep extends IfcSolidModel
{
	@JacksonXmlProperty(isAttribute=false, localName = "Outer")
	@Description("A closed shell defining the exterior boundary of the solid. The shell normal shall point away from the interior of the solid.")
	@Required()
	@Guid("037a2664-7d98-4059-af1b-cf56b8255a6f")
	private com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell outer;


	public IfcManifoldSolidBrep()
	{
	}

	public IfcManifoldSolidBrep(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell outer)
	{
		this.outer = outer;
	}

	public com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell getOuter() {
		return this.outer;
	}

	public void setOuter(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell outer) {
		this.outer = outer;
	}


}

