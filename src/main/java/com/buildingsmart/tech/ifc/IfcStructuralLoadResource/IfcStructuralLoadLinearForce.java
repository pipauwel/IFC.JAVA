// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLinearForceMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLinearMomentMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1603d564-704f-40ac-8e69-4434b6e56839")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic
{
	@Description("Linear force value in x-direction.")
	@DataMember(Order = 0)
	@Guid("07bd00f7-628c-4fb3-849a-068046d193bc")
	@JacksonXmlProperty(isAttribute=false, localName = "linearForceX")
	private IfcLinearForceMeasure linearForceX;

	@Description("Linear force value in y-direction.")
	@DataMember(Order = 1)
	@Guid("ccc9d060-e726-4f98-bc5a-790e6dbfa119")
	@JacksonXmlProperty(isAttribute=false, localName = "linearForceY")
	private IfcLinearForceMeasure linearForceY;

	@Description("Linear force value in z-direction.")
	@DataMember(Order = 2)
	@Guid("c6e146e6-8642-44f8-bd6e-a99646dc9944")
	@JacksonXmlProperty(isAttribute=false, localName = "linearForceZ")
	private IfcLinearForceMeasure linearForceZ;

	@Description("Linear moment about the x-axis.")
	@DataMember(Order = 3)
	@Guid("7129fb7a-05d8-4364-9e73-5fce1d479609")
	@JacksonXmlProperty(isAttribute=false, localName = "linearMomentX")
	private IfcLinearMomentMeasure linearMomentX;

	@Description("Linear moment about the y-axis.")
	@DataMember(Order = 4)
	@Guid("30bdb5b4-1289-48de-9add-665b642a80a4")
	@JacksonXmlProperty(isAttribute=false, localName = "linearMomentY")
	private IfcLinearMomentMeasure linearMomentY;

	@Description("Linear moment about the z-axis.")
	@DataMember(Order = 5)
	@Guid("51e630c9-e1e0-4e19-b642-c1a96eff5bc2")
	@JacksonXmlProperty(isAttribute=false, localName = "linearMomentZ")
	private IfcLinearMomentMeasure linearMomentZ;


	public IfcStructuralLoadLinearForce()
	{
	}

	public IfcLinearForceMeasure getLinearForceX() {
		return this.linearForceX;
	}

	public void setLinearForceX(IfcLinearForceMeasure linearForceX) {
		this.linearForceX = linearForceX;
	}

	public IfcLinearForceMeasure getLinearForceY() {
		return this.linearForceY;
	}

	public void setLinearForceY(IfcLinearForceMeasure linearForceY) {
		this.linearForceY = linearForceY;
	}

	public IfcLinearForceMeasure getLinearForceZ() {
		return this.linearForceZ;
	}

	public void setLinearForceZ(IfcLinearForceMeasure linearForceZ) {
		this.linearForceZ = linearForceZ;
	}

	public IfcLinearMomentMeasure getLinearMomentX() {
		return this.linearMomentX;
	}

	public void setLinearMomentX(IfcLinearMomentMeasure linearMomentX) {
		this.linearMomentX = linearMomentX;
	}

	public IfcLinearMomentMeasure getLinearMomentY() {
		return this.linearMomentY;
	}

	public void setLinearMomentY(IfcLinearMomentMeasure linearMomentY) {
		this.linearMomentY = linearMomentY;
	}

	public IfcLinearMomentMeasure getLinearMomentZ() {
		return this.linearMomentZ;
	}

	public void setLinearMomentZ(IfcLinearMomentMeasure linearMomentZ) {
		this.linearMomentZ = linearMomentZ;
	}


}

