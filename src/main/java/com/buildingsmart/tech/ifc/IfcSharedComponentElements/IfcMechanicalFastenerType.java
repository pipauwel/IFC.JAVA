// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("acdb4036-7f93-4d13-9988-d382967d60e0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMechanicalFastenerType extends IfcElementComponentType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Subtype of mechanical fastener")
	@Required()
	@Guid("b22546a4-d293-4734-996d-83e4dfe4fa45")
	private com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcMechanicalFastenerTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "NominalDiameter")
	@Description("The nominal diameter describing the cross-section size of the fastener type.")
	@Guid("2c61fce1-089c-434e-9f28-2ec15723443b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "NominalLength")
	@Description("The nominal length describing the longitudinal dimensions of the fastener type.")
	@Guid("287c53f4-0878-4cca-97a0-b8b5fcba97f2")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalLength;


	public IfcMechanicalFastenerType()
	{
	}

	public IfcMechanicalFastenerType(String globalId, com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcMechanicalFastenerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcMechanicalFastenerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcMechanicalFastenerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getNominalDiameter() {
		return this.nominalDiameter;
	}

	public void setNominalDiameter(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalDiameter) {
		this.nominalDiameter = nominalDiameter;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getNominalLength() {
		return this.nominalLength;
	}

	public void setNominalLength(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure nominalLength) {
		this.nominalLength = nominalLength;
	}


}

