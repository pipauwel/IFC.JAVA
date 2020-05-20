// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcReal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("283bc76c-8d97-414d-a5ef-96f76f53702f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D
{
	@Description("The scaling value specified for the transformation along the axis 2. This is normally the y scale factor.")
	@DataMember(Order = 0)
	@Guid("a8e81164-ed5f-4e59-a76e-ab0907154bf2")
	@JacksonXmlProperty(isAttribute=false, localName = "scale2")
	private IfcReal scale2;

	@Description("The scaling value specified for the transformation along the axis 3. This is normally the z scale factor.")
	@DataMember(Order = 1)
	@Guid("9efce9a5-63f1-44d1-bb62-a02be5a7092f")
	@JacksonXmlProperty(isAttribute=false, localName = "scale3")
	private IfcReal scale3;


	public IfcCartesianTransformationOperator3DnonUniform()
	{
	}

	public IfcCartesianTransformationOperator3DnonUniform(IfcCartesianPoint localOrigin)
	{
		super(localOrigin);
	}

	public IfcReal getScale2() {
		return this.scale2;
	}

	public void setScale2(IfcReal scale2) {
		this.scale2 = scale2;
	}

	public IfcReal getScale3() {
		return this.scale3;
	}

	public void setScale3(IfcReal scale3) {
		this.scale3 = scale3;
	}

	public IfcReal getScl2() {
		//Scl2:=NVL(Scale2, SELF\IfcCartesianTransformationOperator.Scl)
		if(scale2 != null)
			return scale2;
		else
			return this.getScl();
	}

	public IfcReal getScl3() {
		//Scl3:=NVL(Scale3, SELF\IfcCartesianTransformationOperator.Scl)
		if(scale3 != null)
			return scale3;
		else
			return this.getScl();
	}


}

