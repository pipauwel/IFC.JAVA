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
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingElementType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshTypeEnum;

@Guid("c55468d2-4e66-449a-9e37-6795ea684389")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingMeshType extends IfcReinforcingElementType
{
	@Description("Subtype of reinforcing mesh.")
	@Required()
	@Guid("1d8cc34d-0aa9-4d31-a830-2eb84e3f8fff")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcReinforcingMeshTypeEnum predefinedType;

	@Description("The overall length of the mesh measured in its longitudinal direction.")
	@Guid("133716eb-0efc-4894-8d25-7843e0a0f8dc")
	@JacksonXmlProperty(isAttribute=false, localName = "MeshLength")
	private IfcPositiveLengthMeasure meshLength;

	@Description("The overall width of the mesh measured in its transversal direction.")
	@Guid("c19b7ecf-89bc-4ce5-88df-1fc9e119b605")
	@JacksonXmlProperty(isAttribute=false, localName = "MeshWidth")
	private IfcPositiveLengthMeasure meshWidth;

	@Description("The nominal diameter denoting the cross-section size of the longitudinal bars.")
	@Guid("f333ae8d-a4a1-429f-914c-edb1c105285b")
	@JacksonXmlProperty(isAttribute=false, localName = "LongitudinalBarNominalDiameter")
	private IfcPositiveLengthMeasure longitudinalBarNominalDiameter;

	@Description("The nominal diameter denoting the cross-section size of the transverse bars.")
	@Guid("826e5734-3a0d-4205-9848-53f04a6c1c81")
	@JacksonXmlProperty(isAttribute=false, localName = "TransverseBarNominalDiameter")
	private IfcPositiveLengthMeasure transverseBarNominalDiameter;

	@Description("The effective cross-section area of the longitudinal bars of the mesh.")
	@Guid("f5d91a39-9728-42f4-8ec2-5154cb02bb08")
	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalBarCrossSectionArea")
	private double longitudinalBarCrossSectionArea;

	@Description("The effective cross-section area of the transverse bars of the mesh.")
	@Guid("39ee07ed-b714-4671-83ba-eda0b707228a")
	@JacksonXmlProperty(isAttribute=true, localName = "TransverseBarCrossSectionArea")
	private double transverseBarCrossSectionArea;

	@Description("The spacing between the longitudinal bars.  Note: an even distribution of bars is presumed; other cases are handled by classification or property sets.")
	@Guid("42e0b783-0ae3-4e97-8452-01815b38f23e")
	@JacksonXmlProperty(isAttribute=false, localName = "LongitudinalBarSpacing")
	private IfcPositiveLengthMeasure longitudinalBarSpacing;

	@Description("The spacing between the transverse bars.  Note: an even distribution of bars is presumed; other cases are handled by classification or property sets.")
	@Guid("ccd835af-8460-41f9-86ce-c93355671a77")
	@JacksonXmlProperty(isAttribute=false, localName = "TransverseBarSpacing")
	private IfcPositiveLengthMeasure transverseBarSpacing;

	@Description("If this mesh type is bent rather than planar, this attribute provides a shape code per a standard like ACI 315, ISO 3766, or a similar standard.  It is presumed that a single standard for defining the mesh bending is used throughout the project and that this standard is referenced from the <em>IfcProject</em> object through the <em>IfcDocumentReference</em> mechanism.")
	@Guid("3b0b1b32-71f7-4e23-b4a5-8003eef3d2cc")
	@JacksonXmlProperty(isAttribute=true, localName = "BendingShapeCode")
	private String bendingShapeCode;

	@Description("If this mesh type is bent rather than planar, this attribute provides bending shape parameters. Their meaning is defined by the bending shape code and the respective standard.")
	@Guid("996282cb-f70e-4996-baa7-7b247054cd4e")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcBendingParameterSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "BendingParameters")
	private List<IfcBendingParameterSelect> bendingParameters;


	public IfcReinforcingMeshType()
	{
	}

	public IfcReinforcingMeshType(String globalId, IfcReinforcingMeshTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcReinforcingMeshTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcReinforcingMeshTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
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

	public String getBendingShapeCode() {
		return this.bendingShapeCode;
	}

	public void setBendingShapeCode(String bendingShapeCode) {
		this.bendingShapeCode = bendingShapeCode;
	}

	public List<IfcBendingParameterSelect> getBendingParameters() {
		return this.bendingParameters;
	}


}

