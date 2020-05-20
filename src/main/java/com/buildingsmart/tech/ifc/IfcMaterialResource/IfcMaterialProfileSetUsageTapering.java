// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bbddf2c3-cd7d-4357-94ae-dc7c126b2265")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialProfileSetUsageTapering extends IfcMaterialProfileSetUsage
{
	@Description("The second <em>IfcMaterialProfileSet</em> set to which the usage is applied.")
	@DataMember(Order = 0)
	@Required()
	@Guid("479176ca-3f02-4f72-abfb-0aea05c25f1f")
	@JacksonXmlProperty(isAttribute=false, localName = "forProfileEndSet")
	private IfcMaterialProfileSet forProfileEndSet;

	@Description("Index reference to a significant point in the second section profile. Describes how this section is aligned relative to the axis of the member it is associated with. This parametric specification of profile alignment can be provided redundantly to the explicit alignment defined by ForProfileSet.MaterialProfiles[*].Profile.")
	@DataMember(Order = 1)
	@Guid("c2cdcace-fd71-47d0-9de8-7f392c75629a")
	@JacksonXmlProperty(isAttribute=false, localName = "cardinalEndPoint")
	private IfcCardinalPointReference cardinalEndPoint;


	public IfcMaterialProfileSetUsageTapering()
	{
	}

	public IfcMaterialProfileSetUsageTapering(IfcMaterialProfileSet forProfileSet, IfcMaterialProfileSet forProfileEndSet)
	{
		super(forProfileSet);
		this.forProfileEndSet = forProfileEndSet;
	}

	public IfcMaterialProfileSet getForProfileEndSet() {
		return this.forProfileEndSet;
	}

	public void setForProfileEndSet(IfcMaterialProfileSet forProfileEndSet) {
		this.forProfileEndSet = forProfileEndSet;
	}

	public IfcCardinalPointReference getCardinalEndPoint() {
		return this.cardinalEndPoint;
	}

	public void setCardinalEndPoint(IfcCardinalPointReference cardinalEndPoint) {
		this.cardinalEndPoint = cardinalEndPoint;
	}


}

