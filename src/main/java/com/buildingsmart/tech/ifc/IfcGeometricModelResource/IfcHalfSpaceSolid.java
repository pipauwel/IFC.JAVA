// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c9679787-14e8-44ff-b62a-a511bb58005d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoxedHalfSpace.class, name = "IfcBoxedHalfSpace"), @JsonSubTypes.Type(value = IfcPolygonalBoundedHalfSpace.class, name = "IfcPolygonalBoundedHalfSpace")})
public class IfcHalfSpaceSolid extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand
{
	@Description("Surface defining side of half space.")
	@DataMember(Order = 0)
	@Required()
	@Guid("110e5354-e95f-42b1-81d2-f4de74eb9085")
	@JacksonXmlProperty(isAttribute=false, localName = "baseSurface")
	private IfcSurface baseSurface;

	@Description("The agreement flag is TRUE if the normal to the BaseSurface points away from the material of the IfcHalfSpaceSolid. Otherwise it is FALSE.")
	@DataMember(Order = 1)
	@Required()
	@Guid("689e63ba-3c13-477c-810a-69a5acc44e82")
	@JacksonXmlProperty(isAttribute=false, localName = "agreementFlag")
	private IfcBoolean agreementFlag;


	public IfcHalfSpaceSolid()
	{
	}

	public IfcHalfSpaceSolid(IfcSurface baseSurface, IfcBoolean agreementFlag)
	{
		this.baseSurface = baseSurface;
		this.agreementFlag = agreementFlag;
	}

	public IfcSurface getBaseSurface() {
		return this.baseSurface;
	}

	public void setBaseSurface(IfcSurface baseSurface) {
		this.baseSurface = baseSurface;
	}

	public IfcBoolean getAgreementFlag() {
		return this.agreementFlag;
	}

	public void setAgreementFlag(IfcBoolean agreementFlag) {
		this.agreementFlag = agreementFlag;
	}

	@JsonIgnore
	public int getDim() {
		return 3;
	}


}

