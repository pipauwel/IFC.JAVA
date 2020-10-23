// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("acdb4036-7f93-4d13-9988-d382967d60e0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMechanicalFastenerType extends IfcElementComponentType
{
	@Description("Subtype of mechanical fastener")
	@DataMember(Order = 0)
	@Required()
	@Guid("b22546a4-d293-4734-996d-83e4dfe4fa45")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcMechanicalFastenerTypeEnum predefinedType;

	@Description("The nominal diameter describing the cross-section size of the fastener type.")
	@DataMember(Order = 1)
	@Guid("2c61fce1-089c-434e-9f28-2ec15723443b")
	@JacksonXmlProperty(isAttribute=false, localName = "nominalDiameter")
	private IfcPositiveLengthMeasure nominalDiameter;

	@Description("The nominal length describing the longitudinal dimensions of the fastener type.")
	@DataMember(Order = 2)
	@Guid("287c53f4-0878-4cca-97a0-b8b5fcba97f2")
	@JacksonXmlProperty(isAttribute=false, localName = "nominalLength")
	private IfcPositiveLengthMeasure nominalLength;


	public IfcMechanicalFastenerType()
	{
	}

	public IfcMechanicalFastenerType(String globalId, IfcMechanicalFastenerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcMechanicalFastenerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMechanicalFastenerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcPositiveLengthMeasure getNominalDiameter() {
		return this.nominalDiameter;
	}

	public void setNominalDiameter(IfcPositiveLengthMeasure nominalDiameter) {
		this.nominalDiameter = nominalDiameter;
	}

	public IfcPositiveLengthMeasure getNominalLength() {
		return this.nominalLength;
	}

	public void setNominalLength(IfcPositiveLengthMeasure nominalLength) {
		this.nominalLength = nominalLength;
	}


}

