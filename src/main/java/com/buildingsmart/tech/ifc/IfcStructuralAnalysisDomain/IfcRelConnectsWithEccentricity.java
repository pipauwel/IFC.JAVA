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

@Guid("a66f70d6-cdc3-47b6-b2a1-9b9c2991e6f5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsWithEccentricity extends IfcRelConnectsStructuralMember
{
	@JacksonXmlProperty(isAttribute=false, localName = "ConnectionConstraint")
	@Description("The connection constraint explicitly states the eccentricity between a structural member and a structural connection by means of two topological objects (vertex and vertex, or edge and edge, or face and face).")
	@Required()
	@Guid("32bf06cb-d463-43c3-be58-0f7c5d0211e2")
	private com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry connectionConstraint;


	public IfcRelConnectsWithEccentricity()
	{
	}

	public IfcRelConnectsWithEccentricity(String globalId, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralMember relatingStructuralMember, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralConnection relatedStructuralConnection, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry connectionConstraint)
	{
		super(globalId, relatingStructuralMember, relatedStructuralConnection);
		this.connectionConstraint = connectionConstraint;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry getConnectionConstraint() {
		return this.connectionConstraint;
	}

	public void setConnectionConstraint(com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry connectionConstraint) {
		this.connectionConstraint = connectionConstraint;
	}


}

