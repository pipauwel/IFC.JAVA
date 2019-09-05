// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1603d564-704f-40ac-8e69-4434b6e56839")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic
{
	@JacksonXmlProperty(isAttribute=true, localName = "LinearForceX")
	@Description("Linear force value in x-direction.")
	@Guid("07bd00f7-628c-4fb3-849a-068046d193bc")
	private double linearForceX;

	@JacksonXmlProperty(isAttribute=true, localName = "LinearForceY")
	@Description("Linear force value in y-direction.")
	@Guid("ccc9d060-e726-4f98-bc5a-790e6dbfa119")
	private double linearForceY;

	@JacksonXmlProperty(isAttribute=true, localName = "LinearForceZ")
	@Description("Linear force value in z-direction.")
	@Guid("c6e146e6-8642-44f8-bd6e-a99646dc9944")
	private double linearForceZ;

	@JacksonXmlProperty(isAttribute=true, localName = "LinearMomentX")
	@Description("Linear moment about the x-axis.")
	@Guid("7129fb7a-05d8-4364-9e73-5fce1d479609")
	private double linearMomentX;

	@JacksonXmlProperty(isAttribute=true, localName = "LinearMomentY")
	@Description("Linear moment about the y-axis.")
	@Guid("30bdb5b4-1289-48de-9add-665b642a80a4")
	private double linearMomentY;

	@JacksonXmlProperty(isAttribute=true, localName = "LinearMomentZ")
	@Description("Linear moment about the z-axis.")
	@Guid("51e630c9-e1e0-4e19-b642-c1a96eff5bc2")
	private double linearMomentZ;


	public IfcStructuralLoadLinearForce()
	{
	}

	public double getLinearForceX() {
		return this.linearForceX;
	}

	public void setLinearForceX(double linearForceX) {
		this.linearForceX = linearForceX;
	}

	public double getLinearForceY() {
		return this.linearForceY;
	}

	public void setLinearForceY(double linearForceY) {
		this.linearForceY = linearForceY;
	}

	public double getLinearForceZ() {
		return this.linearForceZ;
	}

	public void setLinearForceZ(double linearForceZ) {
		this.linearForceZ = linearForceZ;
	}

	public double getLinearMomentX() {
		return this.linearMomentX;
	}

	public void setLinearMomentX(double linearMomentX) {
		this.linearMomentX = linearMomentX;
	}

	public double getLinearMomentY() {
		return this.linearMomentY;
	}

	public void setLinearMomentY(double linearMomentY) {
		this.linearMomentY = linearMomentY;
	}

	public double getLinearMomentZ() {
		return this.linearMomentZ;
	}

	public void setLinearMomentZ(double linearMomentZ) {
		this.linearMomentZ = linearMomentZ;
	}


}

