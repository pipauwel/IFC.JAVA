// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcAreaMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("c55468d2-4e66-449a-9e37-6795ea684389")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingMeshType extends IfcReinforcingElementType
{
	@Description("Subtype of reinforcing mesh.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1d8cc34d-0aa9-4d31-a830-2eb84e3f8fff")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcReinforcingMeshTypeEnum predefinedType;

	@Description("The overall length of the mesh measured in its longitudinal direction.")
	@DataMember(Order = 1)
	@Guid("133716eb-0efc-4894-8d25-7843e0a0f8dc")
	@JacksonXmlProperty(isAttribute=false, localName = "meshLength")
	private IfcPositiveLengthMeasure meshLength;

	@Description("The overall width of the mesh measured in its transversal direction.")
	@DataMember(Order = 2)
	@Guid("c19b7ecf-89bc-4ce5-88df-1fc9e119b605")
	@JacksonXmlProperty(isAttribute=false, localName = "meshWidth")
	private IfcPositiveLengthMeasure meshWidth;

	@Description("The nominal diameter denoting the cross-section size of the longitudinal bars.")
	@DataMember(Order = 3)
	@Guid("f333ae8d-a4a1-429f-914c-edb1c105285b")
	@JacksonXmlProperty(isAttribute=false, localName = "longitudinalBarNominalDiameter")
	private IfcPositiveLengthMeasure longitudinalBarNominalDiameter;

	@Description("The nominal diameter denoting the cross-section size of the transverse bars.")
	@DataMember(Order = 4)
	@Guid("826e5734-3a0d-4205-9848-53f04a6c1c81")
	@JacksonXmlProperty(isAttribute=false, localName = "transverseBarNominalDiameter")
	private IfcPositiveLengthMeasure transverseBarNominalDiameter;

	@Description("The effective cross-section area of the longitudinal bars of the mesh.")
	@DataMember(Order = 5)
	@Guid("f5d91a39-9728-42f4-8ec2-5154cb02bb08")
	@JacksonXmlProperty(isAttribute=false, localName = "longitudinalBarCrossSectionArea")
	private IfcAreaMeasure longitudinalBarCrossSectionArea;

	@Description("The effective cross-section area of the transverse bars of the mesh.")
	@DataMember(Order = 6)
	@Guid("39ee07ed-b714-4671-83ba-eda0b707228a")
	@JacksonXmlProperty(isAttribute=false, localName = "transverseBarCrossSectionArea")
	private IfcAreaMeasure transverseBarCrossSectionArea;

	@Description("The spacing between the longitudinal bars.  Note: an even distribution of bars is presumed; other cases are handled by classification or property sets.")
	@DataMember(Order = 7)
	@Guid("42e0b783-0ae3-4e97-8452-01815b38f23e")
	@JacksonXmlProperty(isAttribute=false, localName = "longitudinalBarSpacing")
	private IfcPositiveLengthMeasure longitudinalBarSpacing;

	@Description("The spacing between the transverse bars.  Note: an even distribution of bars is presumed; other cases are handled by classification or property sets.")
	@DataMember(Order = 8)
	@Guid("ccd835af-8460-41f9-86ce-c93355671a77")
	@JacksonXmlProperty(isAttribute=false, localName = "transverseBarSpacing")
	private IfcPositiveLengthMeasure transverseBarSpacing;

	@Description("If this mesh type is bent rather than planar, this attribute provides a shape code per a standard like ACI 315, ISO 3766, or a similar standard.  It is presumed that a single standard for defining the mesh bending is used throughout the project and that this standard is referenced from the <em>IfcProject</em> object through the <em>IfcDocumentReference</em> mechanism.")
	@DataMember(Order = 9)
	@Guid("3b0b1b32-71f7-4e23-b4a5-8003eef3d2cc")
	@JacksonXmlProperty(isAttribute=false, localName = "bendingShapeCode")
	private IfcLabel bendingShapeCode;

	@Description("If this mesh type is bent rather than planar, this attribute provides bending shape parameters. Their meaning is defined by the bending shape code and the respective standard.")
	@DataMember(Order = 10)
	@Guid("996282cb-f70e-4996-baa7-7b247054cd4e")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcBendingParameterSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "bendingParameters")
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

	public IfcLabel getBendingShapeCode() {
		return this.bendingShapeCode;
	}

	public void setBendingShapeCode(IfcLabel bendingShapeCode) {
		this.bendingShapeCode = bendingShapeCode;
	}

	public List<IfcBendingParameterSelect> getBendingParameters() {
		return this.bendingParameters;
	}


}

