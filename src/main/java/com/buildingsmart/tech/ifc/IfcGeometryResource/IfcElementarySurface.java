// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("dab568ba-aad6-4d74-963d-d3f397cfcea1")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCylindricalSurface.class, name = "IfcCylindricalSurface"), @JsonSubTypes.Type(value = IfcPlane.class, name = "IfcPlane"), @JsonSubTypes.Type(value = IfcSphericalSurface.class, name = "IfcSphericalSurface"), @JsonSubTypes.Type(value = IfcToroidalSurface.class, name = "IfcToroidalSurface")})
public abstract class IfcElementarySurface extends IfcSurface
{
	@Description("The position and orientation of the surface. This attribute is used in the definition of the parameterization of the surface.")
	@DataMember(Order = 0)
	@Required()
	@Guid("f91d2366-0868-4189-a462-5254202e97dc")
	@JacksonXmlProperty(isAttribute=false, localName = "position")
	private IfcAxis2Placement3D position;


	public IfcElementarySurface()
	{
	}

	public IfcElementarySurface(IfcAxis2Placement3D position)
	{
		this.position = position;
	}

	public IfcAxis2Placement3D getPosition() {
		return this.position;
	}

	public void setPosition(IfcAxis2Placement3D position) {
		this.position = position;
	}


}

