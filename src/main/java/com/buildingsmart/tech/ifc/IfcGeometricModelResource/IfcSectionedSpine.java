// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("d92abdea-e3e3-4799-9cb5-39b1c40f03aa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSectionedSpine extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("A single composite curve, that defines the spine curve. Each of the composite curve segments correspond to the part between two cross-sections.")
	@DataMember(Order = 0)
	@Required()
	@Guid("9972a3cc-e10b-4958-b69a-cff36403a20f")
	@JacksonXmlProperty(isAttribute=false, localName = "spineCurve")
	private IfcCompositeCurve spineCurve;

	@Description("A list of at least two cross sections, each defined within the xy plane of the position coordinate system of the cross section. The position coordinate system is given by the corresponding list CrossSectionPositions.")
	@DataMember(Order = 1)
	@Required()
	@Guid("ab186537-69aa-4b04-909e-0a50fb0c39a8")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProfileDef")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "crossSections")
	private List<IfcProfileDef> crossSections;

	@Description("Position coordinate systems for the cross sections that form the sectioned spine. The profiles defining the cross sections are positioned within the xy plane of the corresponding position coordinate system.")
	@DataMember(Order = 2)
	@Required()
	@Guid("248f7801-8a52-417a-a51f-43ba0fbb601d")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcAxis2Placement3D")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "crossSectionPositions")
	private List<IfcAxis2Placement3D> crossSectionPositions;


	public IfcSectionedSpine()
	{
	}

	public IfcSectionedSpine(IfcCompositeCurve spineCurve, IfcProfileDef[] crossSections, IfcAxis2Placement3D[] crossSectionPositions)
	{
		this.spineCurve = spineCurve;
		this.crossSections = new ArrayList<>(Arrays.asList(crossSections));
		this.crossSectionPositions = new ArrayList<>(Arrays.asList(crossSectionPositions));
	}

	public IfcCompositeCurve getSpineCurve() {
		return this.spineCurve;
	}

	public void setSpineCurve(IfcCompositeCurve spineCurve) {
		this.spineCurve = spineCurve;
	}

	public List<IfcProfileDef> getCrossSections() {
		return this.crossSections;
	}

	public List<IfcAxis2Placement3D> getCrossSectionPositions() {
		return this.crossSectionPositions;
	}

	@JsonIgnore
	public int getDim() {
		return 3;
	}


}

