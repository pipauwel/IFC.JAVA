// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c55468d2-4e66-449a-9e37-6795ea684389")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReinforcingMeshType extends IfcReinforcingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Subtype of reinforcing mesh.")
	@Required()
	@Guid("1d8cc34d-0aa9-4d31-a830-2eb84e3f8fff")
	private com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "MeshLength")
	@Description("The overall length of the mesh measured in its longitudinal direction.")
	@Guid("133716eb-0efc-4894-8d25-7843e0a0f8dc")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure meshLength;

	@JacksonXmlProperty(isAttribute=true, localName = "MeshWidth")
	@Description("The overall width of the mesh measured in its transversal direction.")
	@Guid("c19b7ecf-89bc-4ce5-88df-1fc9e119b605")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure meshWidth;

	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalBarNominalDiameter")
	@Description("The nominal diameter denoting the cross-section size of the longitudinal bars.")
	@Guid("f333ae8d-a4a1-429f-914c-edb1c105285b")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure longitudinalBarNominalDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "TransverseBarNominalDiameter")
	@Description("The nominal diameter denoting the cross-section size of the transverse bars.")
	@Guid("826e5734-3a0d-4205-9848-53f04a6c1c81")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure transverseBarNominalDiameter;

	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalBarCrossSectionArea")
	@Description("The effective cross-section area of the longitudinal bars of the mesh.")
	@Guid("f5d91a39-9728-42f4-8ec2-5154cb02bb08")
	private double longitudinalBarCrossSectionArea;

	@JacksonXmlProperty(isAttribute=true, localName = "TransverseBarCrossSectionArea")
	@Description("The effective cross-section area of the transverse bars of the mesh.")
	@Guid("39ee07ed-b714-4671-83ba-eda0b707228a")
	private double transverseBarCrossSectionArea;

	@JacksonXmlProperty(isAttribute=true, localName = "LongitudinalBarSpacing")
	@Description("The spacing between the longitudinal bars.  Note: an even distribution of bars is presumed; other cases are handled by classification or property sets.")
	@Guid("42e0b783-0ae3-4e97-8452-01815b38f23e")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure longitudinalBarSpacing;

	@JacksonXmlProperty(isAttribute=true, localName = "TransverseBarSpacing")
	@Description("The spacing between the transverse bars.  Note: an even distribution of bars is presumed; other cases are handled by classification or property sets.")
	@Guid("ccd835af-8460-41f9-86ce-c93355671a77")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure transverseBarSpacing;

	@JacksonXmlProperty(isAttribute=true, localName = "BendingShapeCode")
	@Description("If this mesh type is bent rather than planar, this attribute provides a shape code per a standard like ACI 315, ISO 3766, or a similar standard.  It is presumed that a single standard for defining the mesh bending is used throughout the project and that this standard is referenced from the <em>IfcProject</em> object through the <em>IfcDocumentReference</em> mechanism.")
	@Guid("3b0b1b32-71f7-4e23-b4a5-8003eef3d2cc")
	private String bendingShapeCode;

	@Description("If this mesh type is bent rather than planar, this attribute provides bending shape parameters. Their meaning is defined by the bending shape code and the respective standard.")
	@MinLength(1)
	@Guid("996282cb-f70e-4996-baa7-7b247054cd4e")
	private List<com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcBendingParameterSelect> bendingParameters = new ArrayList<com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcBendingParameterSelect>();


	public IfcReinforcingMeshType()
	{
	}

	public IfcReinforcingMeshType(String globalId, com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
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

	public String getBendingShapeCode() {
		return this.bendingShapeCode;
	}

	public void setBendingShapeCode(String bendingShapeCode) {
		this.bendingShapeCode = bendingShapeCode;
	}

	public List<com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcBendingParameterSelect> getBendingParameters() {
		return this.bendingParameters;
	}


}

