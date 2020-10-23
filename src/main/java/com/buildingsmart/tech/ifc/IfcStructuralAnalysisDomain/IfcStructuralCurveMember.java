// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b0527d1a-798c-4134-b9f1-056c3d7650af")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralCurveMemberVarying.class, name = "IfcStructuralCurveMemberVarying"))
public class IfcStructuralCurveMember extends IfcStructuralMember
{
	@Description("Type of member with respect to its load carrying behavior in this analysis idealization.")
	@DataMember(Order = 0)
	@Required()
	@Guid("bad7498e-7414-4402-843f-00cb547486b2")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcStructuralCurveMemberTypeEnum predefinedType;

	@Description("Direction which is used in the definition of the local z axis.  <em>Axis</em> is specified relative to the so-called global coordinate system, i.e. the <em>SELF\\IfcProduct.ObjectPlacement</em>.    <blockquote class=\"note\">NOTE&nbsp; It is desirable and usually possible that many instances of <em>IfcStructuralCurveConnection</em> and <em>IfcStructuralCurveMember</em> share a common instance of <em>IfcDirection</em> as their <em>Axis</em> attribute.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("98e340d3-9f0e-4b44-9421-dc95050a5be5")
	@JacksonXmlProperty(isAttribute=false, localName = "axis")
	private IfcDirection axis;


	public IfcStructuralCurveMember()
	{
	}

	public IfcStructuralCurveMember(String globalId, IfcStructuralCurveMemberTypeEnum predefinedType, IfcDirection axis)
	{
		super(globalId);
		this.predefinedType = predefinedType;
		this.axis = axis;
	}

	public IfcStructuralCurveMemberTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStructuralCurveMemberTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcDirection getAxis() {
		return this.axis;
	}

	public void setAxis(IfcDirection axis) {
		this.axis = axis;
	}


}

