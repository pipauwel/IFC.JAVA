// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c9679787-14e8-44ff-b62a-a511bb58005d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcHalfSpaceSolid extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand
{
	@JacksonXmlProperty(isAttribute=false, localName = "BaseSurface")
	@Description("Surface defining side of half space.")
	@Required()
	@Guid("110e5354-e95f-42b1-81d2-f4de74eb9085")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface baseSurface;

	@JacksonXmlProperty(isAttribute=true, localName = "AgreementFlag")
	@Description("The agreement flag is TRUE if the normal to the BaseSurface points away from the material of the IfcHalfSpaceSolid. Otherwise it is FALSE.")
	@Required()
	@Guid("689e63ba-3c13-477c-810a-69a5acc44e82")
	private Boolean agreementFlag;


	public IfcHalfSpaceSolid()
	{
	}

	public IfcHalfSpaceSolid(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface baseSurface, Boolean agreementFlag)
	{
		this.baseSurface = baseSurface;
		this.agreementFlag = agreementFlag;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface getBaseSurface() {
		return this.baseSurface;
	}

	public void setBaseSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface baseSurface) {
		this.baseSurface = baseSurface;
	}

	public Boolean getAgreementFlag() {
		return this.agreementFlag;
	}

	public void setAgreementFlag(Boolean agreementFlag) {
		this.agreementFlag = agreementFlag;
	}

	public int getDim() {
		return 0;
	}


}

