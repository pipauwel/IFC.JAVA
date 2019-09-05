// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2e823b55-2b4a-4eb3-ab29-2daa31a0e9d2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialLayerSetUsage extends IfcMaterialUsageDefinition
{
	@JacksonXmlProperty(isAttribute=false, localName = "ForLayerSet")
	@Description("The <em>IfcMaterialLayerSet</em> set to which the usage is applied.")
	@Required()
	@Guid("6270a84c-a47e-49e8-ad70-df7255d002ec")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSet forLayerSet;

	@JacksonXmlProperty(isAttribute=true, localName = "LayerSetDirection")
	@Description("Orientation of the material layer set relative to element reference geometry. The meaning of the value of this attribute shall be specified in the geometry use section for each element. For extruded shape representation, direction can be given along the extrusion path (e.g. for slabs) or perpendicular to it (e.g. for walls).    <blockquote class=\"note\">NOTE&nbsp; The <em>LayerSetDirection</em> for <em>IfcWallStandardCase</em> shall be AXIS2 (i.e. the y-axis) and for <em>IfcSlabStandardCase</em> and <em>IfcPlateStandardCase</em> it shall be AXIS3 (i.e. the z-axis).</blockquote>    <blockquote class=\"note\">NOTE&nbsp; Whether the material layers of the set being used shall 'grow' into the positive or negative direction of the given axis, shall be defined by <em>DirectionSense</em> attribute.</blockquote>")
	@Required()
	@Guid("61658062-7a41-4e62-a4ac-e22ff1cacbdb")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum layerSetDirection;

	@JacksonXmlProperty(isAttribute=true, localName = "DirectionSense")
	@Description("Denotes whether the material layer set is oriented in positive or negative sense along the specified axis (defined by LayerSetDirection). \"Positive\" means that the consecutive layers (the <em>IfcMaterialLayer</em> instances in the list of <em> IfcMaterialLayerSet.MaterialLayers</em>) are placed face-by-face in the direction of the positive axis as established by LayerSetDirection: for AXIS2 it would be in +y, for AXIS3 it would be +z. \"Negative\" means that the layers are placed face-by-face in the direction of the negative LayerSetDirection. In both cases,  starting at the material layer set base line.  <blockquote class=\"note\">NOTE&nbsp; the material layer set base line (MlsBase) is located by OffsetFromReferenceLine, and may be on the positive or negative side of the element reference line (or plane); positive or negative for MlsBase placement does not depend on the DirectionSense attribute, but on the relevant element axis.</blockquote>")
	@Required()
	@Guid("ce6589dc-d71f-450a-a1c0-378bb4d6f066")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcDirectionSenseEnum directionSense;

	@JacksonXmlProperty(isAttribute=true, localName = "OffsetFromReferenceLine")
	@Description("Offset of the material layer set base line (MlsBase) from reference geometry (line or plane) of element. The offset can be positive or negative, unless restricted for a particular building element type in its use definition or by implementer agreement. A positive value means, that the MlsBase is placed on the positive side of the reference line or plane, on the axis established by LayerSetDirection (in case of AXIS2 into the direction of +y, or in case of AXIS2 into the direction of +z). A negative value means that the MlsBase is placed on the negative side, as established by LayerSetDirection (in case of AXIS2 into the direction of -y). <blockquote class=\"note\">NOTE&nbsp; the positive or negative sign in the offset only affects the MlsBase placement, it does not have any effect on the application of DirectionSense for orientation of the material layers; also DirectionSense does not change the MlsBase placement.</small></blockquote>")
	@Required()
	@Guid("03479fcc-0ce0-4ce2-87e2-23dca844ee1c")
	private double offsetFromReferenceLine;

	@JacksonXmlProperty(isAttribute=true, localName = "ReferenceExtent")
	@Description("Extent of the extrusion of the elements body shape representation to which the <em>IfcMaterialLayerSetUsage</em> applies. It is used as the reference value for the upper <em>OffsetValues[2]</em> provided by the <em>IfcMaterialLayerSetWithOffsets</em> subtype for included material layers.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added to the end of attribute list.</blockquote>  <blockquote class=\"note\">NOTE&nbsp; The attribute <em>ReferenceExtent</em> shall be asserted, if an <em>IfcMaterialLayerSetWithOffsets</em> is included in the <em>ForLayerSet.MaterialLayers</em> list of material layers.</blockquote>  <blockquote class=\"note\">NOTE&nbsp; The <em>ReferenceExtent</em> for <em>IfcWallStandardCase</em> is the reference height starting at z=0 being the XY plane of the object coordinate system.</blockquote>")
	@Guid("05463889-9d39-40f7-a51d-64d1eae28a58")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure referenceExtent;


	public IfcMaterialLayerSetUsage()
	{
	}

	public IfcMaterialLayerSetUsage(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSet forLayerSet, com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum layerSetDirection, com.buildingsmart.tech.ifc.IfcMaterialResource.IfcDirectionSenseEnum directionSense, double offsetFromReferenceLine)
	{
		this.forLayerSet = forLayerSet;
		this.layerSetDirection = layerSetDirection;
		this.directionSense = directionSense;
		this.offsetFromReferenceLine = offsetFromReferenceLine;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSet getForLayerSet() {
		return this.forLayerSet;
	}

	public void setForLayerSet(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSet forLayerSet) {
		this.forLayerSet = forLayerSet;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum getLayerSetDirection() {
		return this.layerSetDirection;
	}

	public void setLayerSetDirection(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum layerSetDirection) {
		this.layerSetDirection = layerSetDirection;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcDirectionSenseEnum getDirectionSense() {
		return this.directionSense;
	}

	public void setDirectionSense(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcDirectionSenseEnum directionSense) {
		this.directionSense = directionSense;
	}

	public double getOffsetFromReferenceLine() {
		return this.offsetFromReferenceLine;
	}

	public void setOffsetFromReferenceLine(double offsetFromReferenceLine) {
		this.offsetFromReferenceLine = offsetFromReferenceLine;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getReferenceExtent() {
		return this.referenceExtent;
	}

	public void setReferenceExtent(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure referenceExtent) {
		this.referenceExtent = referenceExtent;
	}


}

