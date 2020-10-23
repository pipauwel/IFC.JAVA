// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcAreaMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("60c27225-1396-4914-94fa-e4ace351eb81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingMesh extends IfcReinforcingElement
{
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@DataMember(Order = 0)
	@Guid("929cee77-3ee9-4b9e-b6c4-e51b3c464dcd")
	@JacksonXmlProperty(isAttribute=false, localName = "meshLength")
	private IfcPositiveLengthMeasure meshLength;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@DataMember(Order = 1)
	@Guid("c4ca873f-37e9-46e2-975b-1ea01b175277")
	@JacksonXmlProperty(isAttribute=false, localName = "meshWidth")
	private IfcPositiveLengthMeasure meshWidth;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@DataMember(Order = 2)
	@Guid("28a5d2d7-6956-44c1-b5c3-f9125a3cbddb")
	@JacksonXmlProperty(isAttribute=false, localName = "longitudinalBarNominalDiameter")
	private IfcPositiveLengthMeasure longitudinalBarNominalDiameter;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@DataMember(Order = 3)
	@Guid("1850d827-0b23-46d4-b544-3144f3e62eb8")
	@JacksonXmlProperty(isAttribute=false, localName = "transverseBarNominalDiameter")
	private IfcPositiveLengthMeasure transverseBarNominalDiameter;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@DataMember(Order = 4)
	@Guid("57f9fc2a-39af-4d9d-9a04-6ae1b2268252")
	@JacksonXmlProperty(isAttribute=false, localName = "longitudinalBarCrossSectionArea")
	private IfcAreaMeasure longitudinalBarCrossSectionArea;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@DataMember(Order = 5)
	@Guid("f656228b-a259-494d-8674-2588809f6e8d")
	@JacksonXmlProperty(isAttribute=false, localName = "transverseBarCrossSectionArea")
	private IfcAreaMeasure transverseBarCrossSectionArea;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@DataMember(Order = 6)
	@Guid("8fd100ee-aea6-4df8-a43b-d67217dfac8a")
	@JacksonXmlProperty(isAttribute=false, localName = "longitudinalBarSpacing")
	private IfcPositiveLengthMeasure longitudinalBarSpacing;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@DataMember(Order = 7)
	@Guid("ef12d9b6-be33-48f7-ae77-4eb75b2b6b3f")
	@JacksonXmlProperty(isAttribute=false, localName = "transverseBarSpacing")
	private IfcPositiveLengthMeasure transverseBarSpacing;

	@Description("Kind of mesh.")
	@DataMember(Order = 8)
	@Guid("277b46ce-652d-43d4-9ceb-8f12fe34537c")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcReinforcingMeshTypeEnum predefinedType;


	public IfcReinforcingMesh()
	{
	}

	public IfcReinforcingMesh(String globalId)
	{
		super(globalId);
	}

	public IfcPositiveLengthMeasure getMeshLength() {
		return this.meshLength;
	}

	public void setMeshLength(IfcPositiveLengthMeasure meshLength) {
		this.meshLength = meshLength;
	}

	public IfcPositiveLengthMeasure getMeshWidth() {
		return this.meshWidth;
	}

	public void setMeshWidth(IfcPositiveLengthMeasure meshWidth) {
		this.meshWidth = meshWidth;
	}

	public IfcPositiveLengthMeasure getLongitudinalBarNominalDiameter() {
		return this.longitudinalBarNominalDiameter;
	}

	public void setLongitudinalBarNominalDiameter(IfcPositiveLengthMeasure longitudinalBarNominalDiameter) {
		this.longitudinalBarNominalDiameter = longitudinalBarNominalDiameter;
	}

	public IfcPositiveLengthMeasure getTransverseBarNominalDiameter() {
		return this.transverseBarNominalDiameter;
	}

	public void setTransverseBarNominalDiameter(IfcPositiveLengthMeasure transverseBarNominalDiameter) {
		this.transverseBarNominalDiameter = transverseBarNominalDiameter;
	}

	public IfcAreaMeasure getLongitudinalBarCrossSectionArea() {
		return this.longitudinalBarCrossSectionArea;
	}

	public void setLongitudinalBarCrossSectionArea(IfcAreaMeasure longitudinalBarCrossSectionArea) {
		this.longitudinalBarCrossSectionArea = longitudinalBarCrossSectionArea;
	}

	public IfcAreaMeasure getTransverseBarCrossSectionArea() {
		return this.transverseBarCrossSectionArea;
	}

	public void setTransverseBarCrossSectionArea(IfcAreaMeasure transverseBarCrossSectionArea) {
		this.transverseBarCrossSectionArea = transverseBarCrossSectionArea;
	}

	public IfcPositiveLengthMeasure getLongitudinalBarSpacing() {
		return this.longitudinalBarSpacing;
	}

	public void setLongitudinalBarSpacing(IfcPositiveLengthMeasure longitudinalBarSpacing) {
		this.longitudinalBarSpacing = longitudinalBarSpacing;
	}

	public IfcPositiveLengthMeasure getTransverseBarSpacing() {
		return this.transverseBarSpacing;
	}

	public void setTransverseBarSpacing(IfcPositiveLengthMeasure transverseBarSpacing) {
		this.transverseBarSpacing = transverseBarSpacing;
	}

	public IfcReinforcingMeshTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcReinforcingMeshTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

