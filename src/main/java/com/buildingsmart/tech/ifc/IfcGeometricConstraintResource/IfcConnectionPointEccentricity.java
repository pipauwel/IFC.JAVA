// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bdf3901b-3ab4-45b6-805b-4eebca105729")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConnectionPointEccentricity extends IfcConnectionPointGeometry
{
	@Description("Distance in x direction between the two points (or vertex points) engaged in the point connection.")
	@DataMember(Order = 0)
	@Guid("586cac5a-095b-42a4-a024-90f9d85b537b")
	@JacksonXmlProperty(isAttribute=false, localName = "eccentricityInX")
	private IfcLengthMeasure eccentricityInX;

	@Description("Distance in y direction between the two points (or vertex points) engaged in the point connection.")
	@DataMember(Order = 1)
	@Guid("b5d160c7-662e-48ac-ad93-31fc6a900f18")
	@JacksonXmlProperty(isAttribute=false, localName = "eccentricityInY")
	private IfcLengthMeasure eccentricityInY;

	@Description("Distance in z direction between the two points (or vertex points) engaged in the point connection.")
	@DataMember(Order = 2)
	@Guid("1d14a083-6900-4deb-9417-32886a4b34b5")
	@JacksonXmlProperty(isAttribute=false, localName = "eccentricityInZ")
	private IfcLengthMeasure eccentricityInZ;


	public IfcConnectionPointEccentricity()
	{
	}

	public IfcConnectionPointEccentricity(IfcPointOrVertexPoint pointOnRelatingElement)
	{
		super(pointOnRelatingElement);
	}

	public IfcLengthMeasure getEccentricityInX() {
		return this.eccentricityInX;
	}

	public void setEccentricityInX(IfcLengthMeasure eccentricityInX) {
		this.eccentricityInX = eccentricityInX;
	}

	public IfcLengthMeasure getEccentricityInY() {
		return this.eccentricityInY;
	}

	public void setEccentricityInY(IfcLengthMeasure eccentricityInY) {
		this.eccentricityInY = eccentricityInY;
	}

	public IfcLengthMeasure getEccentricityInZ() {
		return this.eccentricityInZ;
	}

	public void setEccentricityInZ(IfcLengthMeasure eccentricityInZ) {
		this.eccentricityInZ = eccentricityInZ;
	}


}

