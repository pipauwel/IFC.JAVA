// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadStatic;

@Guid("2b69ecd6-ac6b-4bbe-b84f-4f4ec62e97ad")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadPlanarForce extends IfcStructuralLoadStatic
{
	@Description("Planar force value in x-direction.")
	@DataMember(Order = 0)
	@Guid("6eb58171-0dcb-41c6-8d57-65ba25daf21f")
	@JacksonXmlProperty(isAttribute=true, localName = "PlanarForceX")
	private double planarForceX;

	@Description("Planar force value in y-direction.")
	@DataMember(Order = 1)
	@Guid("b44e2300-fb5e-48e9-be76-dbfc689e30cd")
	@JacksonXmlProperty(isAttribute=true, localName = "PlanarForceY")
	private double planarForceY;

	@Description("Planar force value in z-direction.")
	@DataMember(Order = 2)
	@Guid("9247264a-9686-4133-bd06-98fb14f99e97")
	@JacksonXmlProperty(isAttribute=true, localName = "PlanarForceZ")
	private double planarForceZ;


	public IfcStructuralLoadPlanarForce()
	{
	}

	public double getPlanarForceX() {
		return this.planarForceX;
	}

	public void setPlanarForceX(double planarForceX) {
		this.planarForceX = planarForceX;
	}

	public double getPlanarForceY() {
		return this.planarForceY;
	}

	public void setPlanarForceY(double planarForceY) {
		this.planarForceY = planarForceY;
	}

	public double getPlanarForceZ() {
		return this.planarForceZ;
	}

	public void setPlanarForceZ(double planarForceZ) {
		this.planarForceZ = planarForceZ;
	}


}

