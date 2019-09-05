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

@Guid("6d52ef81-4176-4ab5-a2d3-39b86c31c378")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoxedHalfSpace extends IfcHalfSpaceSolid
{
	@JacksonXmlProperty(isAttribute=false, localName = "Enclosure")
	@Description("The box which bounds the resulting solid of the Boolean operation involving the half space solid for computational purposes only.")
	@Required()
	@Guid("1dfdfca3-ec6b-45af-8bdf-d2bdffe279bc")
	private com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBoundingBox enclosure;


	public IfcBoxedHalfSpace()
	{
	}

	public IfcBoxedHalfSpace(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface baseSurface, Boolean agreementFlag, com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBoundingBox enclosure)
	{
		super(baseSurface, agreementFlag);
		this.enclosure = enclosure;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBoundingBox getEnclosure() {
		return this.enclosure;
	}

	public void setEnclosure(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBoundingBox enclosure) {
		this.enclosure = enclosure;
	}


}

