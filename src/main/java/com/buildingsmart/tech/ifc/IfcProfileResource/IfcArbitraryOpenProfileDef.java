// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("65ea2e1f-aa07-4338-9f78-43c237e707f8")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcCenterLineProfileDef.class, name = "IfcCenterLineProfileDef"))
public class IfcArbitraryOpenProfileDef extends IfcProfileDef
{
	@Description("Open bounded curve defining the profile.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a0dddda9-00b8-467a-9d3d-53cbc87fef54")
	@JacksonXmlProperty(isAttribute=false, localName = "curve")
	private IfcBoundedCurve curve;


	public IfcArbitraryOpenProfileDef()
	{
	}

	public IfcArbitraryOpenProfileDef(IfcProfileTypeEnum profileType, IfcBoundedCurve curve)
	{
		super(profileType);
		this.curve = curve;
	}

	public IfcBoundedCurve getCurve() {
		return this.curve;
	}

	public void setCurve(IfcBoundedCurve curve) {
		this.curve = curve;
	}


}

