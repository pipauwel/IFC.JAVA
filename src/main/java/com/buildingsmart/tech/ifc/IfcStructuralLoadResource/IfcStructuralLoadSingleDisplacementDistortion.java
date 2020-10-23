// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcCurvatureMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("eea1aab8-29e8-4975-b676-396ce73e5468")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadSingleDisplacementDistortion extends IfcStructuralLoadSingleDisplacement
{
	@Description("The distortion curvature (warping, i.e. a cross-sectional deplanation) given to the displacement load.")
	@DataMember(Order = 0)
	@Guid("6b02bca8-ae07-4a2e-a1de-9608381f6b99")
	@JacksonXmlProperty(isAttribute=false, localName = "distortion")
	private IfcCurvatureMeasure distortion;


	public IfcStructuralLoadSingleDisplacementDistortion()
	{
	}

	public IfcCurvatureMeasure getDistortion() {
		return this.distortion;
	}

	public void setDistortion(IfcCurvatureMeasure distortion) {
		this.distortion = distortion;
	}


}

