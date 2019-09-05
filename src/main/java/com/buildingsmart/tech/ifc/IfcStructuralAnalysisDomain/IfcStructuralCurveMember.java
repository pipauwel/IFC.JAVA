// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b0527d1a-798c-4134-b9f1-056c3d7650af")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralCurveMember extends IfcStructuralMember
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Type of member with respect to its load carrying behavior in this analysis idealization.")
	@Required()
	@Guid("bad7498e-7414-4402-843f-00cb547486b2")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveMemberTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=false, localName = "Axis")
	@Description("Direction which is used in the definition of the local z axis.  <em>Axis</em> is specified relative to the so-called global coordinate system, i.e. the <em>SELF\\IfcProduct.ObjectPlacement</em>.    <blockquote class=\"note\">NOTE&nbsp; It is desirable and usually possible that many instances of <em>IfcStructuralCurveConnection</em> and <em>IfcStructuralCurveMember</em> share a common instance of <em>IfcDirection</em> as their <em>Axis</em> attribute.</blockquote>")
	@Required()
	@Guid("98e340d3-9f0e-4b44-9421-dc95050a5be5")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis;


	public IfcStructuralCurveMember()
	{
	}

	public IfcStructuralCurveMember(String globalId, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveMemberTypeEnum predefinedType, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis)
	{
		super(globalId);
		this.predefinedType = predefinedType;
		this.axis = axis;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveMemberTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveMemberTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getAxis() {
		return this.axis;
	}

	public void setAxis(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection axis) {
		this.axis = axis;
	}


}

