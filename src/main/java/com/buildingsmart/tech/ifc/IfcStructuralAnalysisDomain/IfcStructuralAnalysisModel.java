// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("2e087fc5-d46f-48f2-82c1-7c7b5162f4c3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralAnalysisModel extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem
{
	@Description("Defines the type of the structural analysis model.")
	@DataMember(Order = 0)
	@Required()
	@Guid("aaf6e058-ebfd-4b13-9c28-9e2226a7cd29")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcAnalysisModelTypeEnum predefinedType;

	@Description("If the selected model type (<em>PredefinedType</em>) describes a 2D system, the orientation defines  the analysis plane (P[1], P[2]) and the normal to the analysis plane (P[3]).  This is needed because  structural items and activities are always defined in three-dimensional space even if they are  meant to be analysed in a two-dimensional manner.    <ul>  <li>In case of predefined type IN_PLANE_LOADING_2D, the analysis is to be performed within the  projection into the P[1], P[2] plane.</li>  <li>In case of predefined type OUT_PLANE_LOADING_2D, only the P[3] component of loads and their  effects is meant to be analyzed.  This is used for beam grids and for typical slab analyses.</li>  <li>In case of predefined type LOADING_3D, <em>OrientationOf2DPlane</em> shall be omitted.</li>  </ul>")
	@DataMember(Order = 1)
	@Guid("3d198530-7da9-431b-a6f6-2a133dfe8481")
	@JacksonXmlProperty(isAttribute=false, localName = "orientationOf2DPlane")
	private IfcAxis2Placement3D orientationOf2DPlane;

	@Description("References to all load groups to be analyzed.")
	@DataMember(Order = 2)
	@Guid("db84f7ed-e47b-43d7-a93c-f42d6aa1eda4")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcStructuralLoadGroup")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "loadedBy")
	private Set<IfcStructuralLoadGroup> loadedBy;

	@Description("References to all result groups available for this structural analysis model.")
	@DataMember(Order = 3)
	@Guid("a3f409db-16db-429e-8788-f03d45464f8a")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcStructuralResultGroup")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasResults")
	private Set<IfcStructuralResultGroup> hasResults;

	@Description("Object placement which shall be common to all items and activities which are grouped into this instance of <em>IfcStructuralAnalysisModel</em>.  This placement establishes a coordinate system which is referred to as 'global coordinate system' in use definitions of various classes of structural items and activities.    <blockquote class=\"note\">NOTE&nbsp; Most commonly, but not necessarily, the <em>SharedPlacement</em> is an <em>IfcLocalPlacement</em> whose z axis is parallel with the z axis of the <em>IfcProject</em>'s world coordinate system and directed like the WCS z axis (i.e. pointing &quot;upwards&quot;) or directed against the WCS z axis (i.e. points &quot;downwards&quot;).</blockquote>    <blockquote class=\"note\">NOTE&nbsp; Per informal proposition, this attribute is <b>not optional</b> as soon as at least one <em>IfcStructuralItem</em> is grouped into the instance of <em>IfcStructuralAnalysisModel</em>.</blockquote>")
	@DataMember(Order = 4)
	@Guid("49d1b310-6cdc-4f50-8efa-70ff55bba65e")
	@JacksonXmlProperty(isAttribute=false, localName = "sharedPlacement")
	private IfcObjectPlacement sharedPlacement;


	public IfcStructuralAnalysisModel()
	{
	}

	public IfcStructuralAnalysisModel(String globalId, IfcAnalysisModelTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcAnalysisModelTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAnalysisModelTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcAxis2Placement3D getOrientationOf2DPlane() {
		return this.orientationOf2DPlane;
	}

	public void setOrientationOf2DPlane(IfcAxis2Placement3D orientationOf2DPlane) {
		this.orientationOf2DPlane = orientationOf2DPlane;
	}

	public Set<IfcStructuralLoadGroup> getLoadedBy() {
		return this.loadedBy;
	}

	public Set<IfcStructuralResultGroup> getHasResults() {
		return this.hasResults;
	}

	public IfcObjectPlacement getSharedPlacement() {
		return this.sharedPlacement;
	}

	public void setSharedPlacement(IfcObjectPlacement sharedPlacement) {
		this.sharedPlacement = sharedPlacement;
	}


}

