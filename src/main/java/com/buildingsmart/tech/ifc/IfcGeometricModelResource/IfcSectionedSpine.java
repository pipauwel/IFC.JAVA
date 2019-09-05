// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d92abdea-e3e3-4799-9cb5-39b1c40f03aa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSectionedSpine extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "SpineCurve")
	@Description("A single composite curve, that defines the spine curve. Each of the composite curve segments correspond to the part between two cross-sections.")
	@Required()
	@Guid("9972a3cc-e10b-4958-b69a-cff36403a20f")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve spineCurve;

	@Description("A list of at least two cross sections, each defined within the xy plane of the position coordinate system of the cross section. The position coordinate system is given by the corresponding list CrossSectionPositions.")
	@Required()
	@MinLength(2)
	@Guid("ab186537-69aa-4b04-909e-0a50fb0c39a8")
	private List<com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef> crossSections = new ArrayList<com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef>();

	@Description("Position coordinate systems for the cross sections that form the sectioned spine. The profiles defining the cross sections are positioned within the xy plane of the corresponding position coordinate system.")
	@Required()
	@MinLength(2)
	@Guid("248f7801-8a52-417a-a51f-43ba0fbb601d")
	private List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D> crossSectionPositions = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D>();


	public IfcSectionedSpine()
	{
	}

	public IfcSectionedSpine(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve spineCurve, com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef[] crossSections, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D[] crossSectionPositions)
	{
		this.spineCurve = spineCurve;
		this.crossSections = new ArrayList<>(Arrays.asList(crossSections));
		this.crossSectionPositions = new ArrayList<>(Arrays.asList(crossSectionPositions));
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve getSpineCurve() {
		return this.spineCurve;
	}

	public void setSpineCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve spineCurve) {
		this.spineCurve = spineCurve;
	}

	public List<com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef> getCrossSections() {
		return this.crossSections;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D> getCrossSectionPositions() {
		return this.crossSectionPositions;
	}

	public int getDim() {
		return 0;
	}


}

