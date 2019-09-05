// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("6198c9e5-dc6e-47b1-8fe3-b9ea5bef370e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConnectionCurveGeometry extends IfcConnectionGeometry
{
	@Description("The bounded curve at which the connected objects are aligned at the relating element, given in the LCS of the relating element.")
	@Required()
	@Guid("ea514121-8087-41a4-8660-224ebe01e3d3")
	private com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve curveOnRelatingElement;

	@Description("The bounded curve at which the connected objects are aligned at the related element, given in the LCS of the related element. If the information is omitted, then the origin of the related element is used.")
	@Guid("98d94c3d-f003-4ea8-a3af-6435e36cf282")
	private com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve curveOnRelatedElement;


	public IfcConnectionCurveGeometry()
	{
	}

	public IfcConnectionCurveGeometry(com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve curveOnRelatingElement)
	{
		this.curveOnRelatingElement = curveOnRelatingElement;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve getCurveOnRelatingElement() {
		return this.curveOnRelatingElement;
	}

	public void setCurveOnRelatingElement(com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve curveOnRelatingElement) {
		this.curveOnRelatingElement = curveOnRelatingElement;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve getCurveOnRelatedElement() {
		return this.curveOnRelatedElement;
	}

	public void setCurveOnRelatedElement(com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve curveOnRelatedElement) {
		this.curveOnRelatedElement = curveOnRelatedElement;
	}


}

