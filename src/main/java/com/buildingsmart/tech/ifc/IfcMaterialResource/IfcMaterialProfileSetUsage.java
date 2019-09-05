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

@Guid("1ca68971-59c5-4363-bcf5-4a3bf1006eae")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialProfileSetUsage extends IfcMaterialUsageDefinition
{
	@JacksonXmlProperty(isAttribute=false, localName = "ForProfileSet")
	@Description("The <em>IfcMaterialProfileSet</em> set to which the usage is applied.")
	@Required()
	@Guid("c96afa24-01fc-4da3-b6ce-642031dac6ae")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet forProfileSet;

	@JacksonXmlProperty(isAttribute=true, localName = "CardinalPoint")
	@Description("Index reference to a significant point in the section profile. Describes how the section is aligned relative to the (longitudinal) axis of the member it is associated with. This parametric specification of profile alignment can be provided redundantly to the explicit alignment defined by ForProfileSet.MaterialProfiles[*].Profile.")
	@Guid("66625475-0f95-4c75-8e18-07cd905063a7")
	private int cardinalPoint;

	@JacksonXmlProperty(isAttribute=true, localName = "ReferenceExtent")
	@Description("Extent of the extrusion of the elements body shape representation to which the <em>IfcMaterialProfileSetUsage</em> applies. It is used as the reference value for the upper <em>OffsetValues[2]</em> provided by the <em>IfcMaterialProfileSetWithOffsets</em> subtype for included material profiles.    <blockquote class=\"note\">NOTE&nbsp; The attribute <em>ReferenceExtent</em> shall be asserted if an <em>IfcMaterialProfileSetWithOffsets</em> is included in the <em>ForProfileSet.MaterialProfiles</em> list of material layers.</blockquote>  <blockquote class=\"note\">NOTE&nbsp; The <em>ReferenceExtent</em> for <em>IfcBeamStandardCase</em>, <em>IfcColumnStandardCase</em>, and <em>IfcMemberStandardCase</em> is the reference length starting at z=0 being the XY plane of the object coordinate system.</blockquote>")
	@Guid("0030178b-e5f9-4374-9d8c-f15dd967e318")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure referenceExtent;


	public IfcMaterialProfileSetUsage()
	{
	}

	public IfcMaterialProfileSetUsage(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet forProfileSet)
	{
		this.forProfileSet = forProfileSet;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet getForProfileSet() {
		return this.forProfileSet;
	}

	public void setForProfileSet(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet forProfileSet) {
		this.forProfileSet = forProfileSet;
	}

	public int getCardinalPoint() {
		return this.cardinalPoint;
	}

	public void setCardinalPoint(int cardinalPoint) {
		this.cardinalPoint = cardinalPoint;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getReferenceExtent() {
		return this.referenceExtent;
	}

	public void setReferenceExtent(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure referenceExtent) {
		this.referenceExtent = referenceExtent;
	}


}

