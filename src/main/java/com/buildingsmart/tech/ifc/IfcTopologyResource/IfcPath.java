// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("ae69801c-7451-4fd5-9784-4dba6d6e1616")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPath extends IfcTopologicalRepresentationItem
{
	@Description("The list of oriented edges which are concatenated together to form this path.")
	@Required()
	@MinLength(1)
	@Guid("a4fe7cfe-c5f5-4183-813f-88d75bd7cf83")
	private List<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcOrientedEdge> edgeList = new ArrayList<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcOrientedEdge>();


	public IfcPath()
	{
	}

	public IfcPath(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcOrientedEdge[] edgeList)
	{
		this.edgeList = new ArrayList<>(Arrays.asList(edgeList));
	}

	public List<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcOrientedEdge> getEdgeList() {
		return this.edgeList;
	}


}

