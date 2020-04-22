// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSolidModel;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCsgSelect;

@Guid("33066633-cf11-455b-af76-a502e5affa9c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCsgSolid extends IfcSolidModel
{
	@Description("Boolean expression of primitives and regularized operators describing the solid. The root of the tree of Boolean expressions is given explicitly as an <em>IfcBooleanResult</em> entitiy or as a primitive (subtypes of <em>IfcCsgPrimitive3D</em>).  </EPM-HMTL>")
	@DataMember(Order = 0)
	@Required()
	@Guid("ab20cd30-ed6a-408f-9814-3196ef85c1be")
	@JacksonXmlProperty(isAttribute=true, localName = "TreeRootExpression")
	private IfcCsgSelect treeRootExpression;


	public IfcCsgSolid()
	{
	}

	public IfcCsgSolid(IfcCsgSelect treeRootExpression)
	{
		this.treeRootExpression = treeRootExpression;
	}

	public IfcCsgSelect getTreeRootExpression() {
		return this.treeRootExpression;
	}

	public void setTreeRootExpression(IfcCsgSelect treeRootExpression) {
		this.treeRootExpression = treeRootExpression;
	}


}

