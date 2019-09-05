// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("33066633-cf11-455b-af76-a502e5affa9c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCsgSolid extends IfcSolidModel
{
	@Description("Boolean expression of primitives and regularized operators describing the solid. The root of the tree of Boolean expressions is given explicitly as an <em>IfcBooleanResult</em> entitiy or as a primitive (subtypes of <em>IfcCsgPrimitive3D</em>).  </EPM-HMTL>")
	@Required()
	@Guid("ab20cd30-ed6a-408f-9814-3196ef85c1be")
	private com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCsgSelect treeRootExpression;


	public IfcCsgSolid()
	{
	}

	public IfcCsgSolid(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCsgSelect treeRootExpression)
	{
		this.treeRootExpression = treeRootExpression;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCsgSelect getTreeRootExpression() {
		return this.treeRootExpression;
	}

	public void setTreeRootExpression(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCsgSelect treeRootExpression) {
		this.treeRootExpression = treeRootExpression;
	}


}

