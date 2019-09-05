// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("98531769-b684-4095-a8e0-843609f7cef0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralSurfaceMember extends IfcStructuralMember
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Type of member with respect to its load carrying behavior in this analysis idealization.")
	@Required()
	@Guid("7f571c3a-8900-4457-889e-282980a58f89")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMemberTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "Thickness")
	@Description("Defines the typically understood thickness of the structural surface member, measured normal to its reference surface.")
	@Guid("dc70652b-1bc6-4bef-8a4f-70049ac774f9")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure thickness;


	public IfcStructuralSurfaceMember()
	{
	}

	public IfcStructuralSurfaceMember(String globalId, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMemberTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMemberTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMemberTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getThickness() {
		return this.thickness;
	}

	public void setThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure thickness) {
		this.thickness = thickness;
	}


}

