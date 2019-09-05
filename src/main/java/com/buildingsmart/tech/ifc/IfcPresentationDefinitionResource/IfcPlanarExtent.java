// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("33b1599e-416e-4c94-9726-005a8cc6c9ef")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPlanarExtent extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=true, localName = "SizeInX")
	@Description("The extent in the direction of the x-axis.")
	@Required()
	@Guid("a8a8144f-33f1-4701-af25-f640045b7e3c")
	private double sizeInX;

	@JacksonXmlProperty(isAttribute=true, localName = "SizeInY")
	@Description("The extent in the direction of the y-axis.")
	@Required()
	@Guid("3408c0ce-a4db-4fbb-8425-e56b5aa384ea")
	private double sizeInY;


	public IfcPlanarExtent()
	{
	}

	public IfcPlanarExtent(double sizeInX, double sizeInY)
	{
		this.sizeInX = sizeInX;
		this.sizeInY = sizeInY;
	}

	public double getSizeInX() {
		return this.sizeInX;
	}

	public void setSizeInX(double sizeInX) {
		this.sizeInX = sizeInX;
	}

	public double getSizeInY() {
		return this.sizeInY;
	}

	public void setSizeInY(double sizeInY) {
		this.sizeInY = sizeInY;
	}


}

