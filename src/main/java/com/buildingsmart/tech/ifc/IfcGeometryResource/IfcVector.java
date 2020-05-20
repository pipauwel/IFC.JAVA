// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("aa519614-ac30-463c-82ff-1733470ef911")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVector extends IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcHatchLineDistanceSelect, IfcVectorOrDirection
{
	@Description("The direction of the vector.")
	@DataMember(Order = 0)
	@Required()
	@Guid("724c6299-4acc-41c6-bbed-b436c1426e7a")
	@JacksonXmlProperty(isAttribute=false, localName = "orientation")
	private IfcDirection orientation;

	@Description("The magnitude of the vector. All vectors of Magnitude 0.0 are regarded as equal in value regardless of the orientation attribute.")
	@DataMember(Order = 1)
	@Required()
	@Guid("5c2c3892-dc4c-467b-95af-92f6de1b2abe")
	@JacksonXmlProperty(isAttribute=false, localName = "magnitude")
	private IfcLengthMeasure magnitude;


	public IfcVector()
	{
	}

	public IfcVector(IfcDirection orientation, IfcLengthMeasure magnitude)
	{
		this.orientation = orientation;
		this.magnitude = magnitude;
	}

	public IfcDirection getOrientation() {
		return this.orientation;
	}

	public void setOrientation(IfcDirection orientation) {
		this.orientation = orientation;
	}

	public IfcLengthMeasure getMagnitude() {
		return this.magnitude;
	}

	public void setMagnitude(IfcLengthMeasure magnitude) {
		this.magnitude = magnitude;
	}

	@JsonIgnore
	public int getDim() {
		//Dim:=Orientation.Dim
		return orientation.getDim();
	}


}

