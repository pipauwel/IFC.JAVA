// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("60c27225-1396-4914-94fa-e4ace351eb81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingMesh extends IfcReinforcingElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "MeshLength")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("929cee77-3ee9-4b9e-b6c4-e51b3c464dcd")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure meshLength;

	@JacksonXmlProperty(isAttribute=true, localName = "MeshWidth")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("c4ca873f-37e9-46e2-975b-1ea01b175277")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure meshWidth;

	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalBarNominalDiameter")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("28a5d2d7-6956-44c1-b5c3-f9125a3cbddb")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure longitudinalBarNominalDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "TransverseBarNominalDiameter")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("1850d827-0b23-46d4-b544-3144f3e62eb8")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure transverseBarNominalDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalBarCrossSectionArea")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("57f9fc2a-39af-4d9d-9a04-6ae1b2268252")
	private double longitudinalBarCrossSectionArea;

	@JacksonXmlProperty(isAttribute=true, localName = "TransverseBarCrossSectionArea")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("f656228b-a259-494d-8674-2588809f6e8d")
	private double transverseBarCrossSectionArea;

	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalBarSpacing")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("8fd100ee-aea6-4df8-a43b-d67217dfac8a")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure longitudinalBarSpacing;

	@JacksonXmlProperty(isAttribute=true, localName = "TransverseBarSpacing")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("ef12d9b6-be33-48f7-ae77-4eb75b2b6b3f")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure transverseBarSpacing;

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Kind of mesh.")
	@Guid("277b46ce-652d-43d4-9ceb-8f12fe34537c")
	private com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshTypeEnum predefinedType;


	public IfcReinforcingMesh()
	{
	}

	public IfcReinforcingMesh(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getMeshLength() {
		return this.meshLength;
	}

	public void setMeshLength(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure meshLength) {
		this.meshLength = meshLength;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getMeshWidth() {
		return this.meshWidth;
	}

	public void setMeshWidth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure meshWidth) {
		this.meshWidth = meshWidth;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getLongitudinalBarNominalDiameter() {
		return this.longitudinalBarNominalDiameter;
	}

	public void setLongitudinalBarNominalDiameter(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure longitudinalBarNominalDiameter) {
		this.longitudinalBarNominalDiameter = longitudinalBarNominalDiameter;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getTransverseBarNominalDiameter() {
		return this.transverseBarNominalDiameter;
	}

	public void setTransverseBarNominalDiameter(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure transverseBarNominalDiameter) {
		this.transverseBarNominalDiameter = transverseBarNominalDiameter;
	}

	public double getLongitudinalBarCrossSectionArea() {
		return this.longitudinalBarCrossSectionArea;
	}

	public void setLongitudinalBarCrossSectionArea(double longitudinalBarCrossSectionArea) {
		this.longitudinalBarCrossSectionArea = longitudinalBarCrossSectionArea;
	}

	public double getTransverseBarCrossSectionArea() {
		return this.transverseBarCrossSectionArea;
	}

	public void setTransverseBarCrossSectionArea(double transverseBarCrossSectionArea) {
		this.transverseBarCrossSectionArea = transverseBarCrossSectionArea;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getLongitudinalBarSpacing() {
		return this.longitudinalBarSpacing;
	}

	public void setLongitudinalBarSpacing(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure longitudinalBarSpacing) {
		this.longitudinalBarSpacing = longitudinalBarSpacing;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getTransverseBarSpacing() {
		return this.transverseBarSpacing;
	}

	public void setTransverseBarSpacing(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure transverseBarSpacing) {
		this.transverseBarSpacing = transverseBarSpacing;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

