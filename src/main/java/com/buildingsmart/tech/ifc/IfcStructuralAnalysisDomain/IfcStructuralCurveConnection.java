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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d75c0a83-a50e-4591-aa6f-d4c2dad98451")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralCurveConnection extends IfcStructuralConnection
{
	@Description("Direction which is used in the definition of the local z axis.  <em>Axis</em> is specified relative to the so-called global coordinate system, i.e. the <em>SELF\\IfcProduct.ObjectPlacement</em>.    <blockquote class=\"note\">NOTE&nbsp; It is desirable and usually possible that many instances of <em>IfcStructuralCurveConnection</em> and <em>IfcStructuralCurveMember</em> share a common instance of <em>IfcDirection</em> as their <em>Axis</em> attribute.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("7ab9edfa-dde7-4c6c-8c6a-ce1cd8fc527c")
	@JacksonXmlProperty(isAttribute=false, localName = "axis")
	private IfcDirection axis;


	public IfcStructuralCurveConnection()
	{
	}

	public IfcStructuralCurveConnection(String globalId, IfcDirection axis)
	{
		super(globalId);
		this.axis = axis;
	}

	public IfcDirection getAxis() {
		return this.axis;
	}

	public void setAxis(IfcDirection axis) {
		this.axis = axis;
	}


}

