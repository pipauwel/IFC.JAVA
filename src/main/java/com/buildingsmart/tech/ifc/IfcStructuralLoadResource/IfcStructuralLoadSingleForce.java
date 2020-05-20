// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcForceMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcTorqueMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c501d0e9-6233-4df9-859a-4a2adf4a47b3")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralLoadSingleForceWarping.class, name = "IfcStructuralLoadSingleForceWarping"))
public class IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic
{
	@Description("Force value in x-direction.")
	@DataMember(Order = 0)
	@Guid("8431526b-0b25-451b-a59f-07fb9e510a75")
	@JacksonXmlProperty(isAttribute=false, localName = "forceX")
	private IfcForceMeasure forceX;

	@Description("Force value in y-direction.")
	@DataMember(Order = 1)
	@Guid("69b32ae7-a18f-4257-b273-2d29d13aac4e")
	@JacksonXmlProperty(isAttribute=false, localName = "forceY")
	private IfcForceMeasure forceY;

	@Description("Force value in z-direction.")
	@DataMember(Order = 2)
	@Guid("8d66ace6-6703-4ec5-87ea-965d5821c756")
	@JacksonXmlProperty(isAttribute=false, localName = "forceZ")
	private IfcForceMeasure forceZ;

	@Description("Moment about the x-axis.")
	@DataMember(Order = 3)
	@Guid("6a9e3e2e-1022-476f-99b5-3f2e32665aca")
	@JacksonXmlProperty(isAttribute=false, localName = "momentX")
	private IfcTorqueMeasure momentX;

	@Description("Moment about the y-axis.")
	@DataMember(Order = 4)
	@Guid("8811d283-68df-4ddd-9c7b-8b146d04a12b")
	@JacksonXmlProperty(isAttribute=false, localName = "momentY")
	private IfcTorqueMeasure momentY;

	@Description("Moment about the z-axis.")
	@DataMember(Order = 5)
	@Guid("8448fee7-7bd3-42d1-b6f1-ab7d46fdeba2")
	@JacksonXmlProperty(isAttribute=false, localName = "momentZ")
	private IfcTorqueMeasure momentZ;


	public IfcStructuralLoadSingleForce()
	{
	}

	public IfcForceMeasure getForceX() {
		return this.forceX;
	}

	public void setForceX(IfcForceMeasure forceX) {
		this.forceX = forceX;
	}

	public IfcForceMeasure getForceY() {
		return this.forceY;
	}

	public void setForceY(IfcForceMeasure forceY) {
		this.forceY = forceY;
	}

	public IfcForceMeasure getForceZ() {
		return this.forceZ;
	}

	public void setForceZ(IfcForceMeasure forceZ) {
		this.forceZ = forceZ;
	}

	public IfcTorqueMeasure getMomentX() {
		return this.momentX;
	}

	public void setMomentX(IfcTorqueMeasure momentX) {
		this.momentX = momentX;
	}

	public IfcTorqueMeasure getMomentY() {
		return this.momentY;
	}

	public void setMomentY(IfcTorqueMeasure momentY) {
		this.momentY = momentY;
	}

	public IfcTorqueMeasure getMomentZ() {
		return this.momentZ;
	}

	public void setMomentZ(IfcTorqueMeasure momentZ) {
		this.momentZ = momentZ;
	}


}

