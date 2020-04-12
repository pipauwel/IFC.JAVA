// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.List;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0110d280-1722-46bf-b12c-0b81868564a8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAxis2Placement2D extends IfcPlacement implements IfcAxis2Placement
{
	@Description("The direction used to determine the direction of the local X axis. If a value is omited that it defaults to [1.0, 0.0.].  </HTML>")
	@DataMember(Order = 0)
	@Guid("5e585783-4533-48ef-834e-1d2f291ac661")
	@JacksonXmlProperty(isAttribute=false, localName = "RefDirection")
	private IfcDirection refDirection;


	public IfcAxis2Placement2D()
	{
	}

	public IfcAxis2Placement2D(IfcCartesianPoint location)
	{
		super(location);
	}

	public IfcDirection getRefDirection() {
		return this.refDirection;
	}

	public void setRefDirection(IfcDirection refDirection) {
		this.refDirection = refDirection;
	}

	public List<IfcDirection> getP() {
		return null;
	}


}

