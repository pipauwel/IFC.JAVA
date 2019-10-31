// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.*;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingElement;

@Guid("60c27225-1396-4914-94fa-e4ace351eb81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingMesh extends IfcReinforcingElement
{
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("929cee77-3ee9-4b9e-b6c4-e51b3c464dcd")
	@JacksonXmlProperty(isAttribute=false, localName = "MeshLength")
	private IfcPositiveLengthMeasure meshLength;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("c4ca873f-37e9-46e2-975b-1ea01b175277")
	@JacksonXmlProperty(isAttribute=false, localName = "MeshWidth")
	private IfcPositiveLengthMeasure meshWidth;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("28a5d2d7-6956-44c1-b5c3-f9125a3cbddb")
	@JacksonXmlProperty(isAttribute=false, localName = "LongitudinalBarNominalDiameter")
	private IfcPositiveLengthMeasure longitudinalBarNominalDiameter;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("1850d827-0b23-46d4-b544-3144f3e62eb8")
	@JacksonXmlProperty(isAttribute=false, localName = "TransverseBarNominalDiameter")
	private IfcPositiveLengthMeasure transverseBarNominalDiameter;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("57f9fc2a-39af-4d9d-9a04-6ae1b2268252")
	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalBarCrossSectionArea")
	private double longitudinalBarCrossSectionArea;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("f656228b-a259-494d-8674-2588809f6e8d")
	@JacksonXmlProperty(isAttribute=true, localName = "TransverseBarCrossSectionArea")
	private double transverseBarCrossSectionArea;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("8fd100ee-aea6-4df8-a43b-d67217dfac8a")
	@JacksonXmlProperty(isAttribute=false, localName = "LongitudinalBarSpacing")
	private IfcPositiveLengthMeasure longitudinalBarSpacing;

	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional and deprecated.  Use respective attribute at <em>IfcReinforcingMeshType</em> instead.</blockquote>")
	@Guid("ef12d9b6-be33-48f7-ae77-4eb75b2b6b3f")
	@JacksonXmlProperty(isAttribute=false, localName = "TransverseBarSpacing")
	private IfcPositiveLengthMeasure transverseBarSpacing;

	@Description("Kind of mesh.")
	@Guid("277b46ce-652d-43d4-9ceb-8f12fe34537c")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
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

