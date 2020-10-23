// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcWarpingMomentMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7b1156ec-8ae8-43ea-b693-2aa47577acb3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadSingleForceWarping extends IfcStructuralLoadSingleForce
{
	@Description("The warping moment at the point load.")
	@DataMember(Order = 0)
	@Guid("5d032fb3-22be-4ef3-8a8c-0303b0c5a13b")
	@JacksonXmlProperty(isAttribute=false, localName = "warpingMoment")
	private IfcWarpingMomentMeasure warpingMoment;


	public IfcStructuralLoadSingleForceWarping()
	{
	}

	public IfcWarpingMomentMeasure getWarpingMoment() {
		return this.warpingMoment;
	}

	public void setWarpingMoment(IfcWarpingMomentMeasure warpingMoment) {
		this.warpingMoment = warpingMoment;
	}


}

