// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("ae69801c-7451-4fd5-9784-4dba6d6e1616")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPath extends IfcTopologicalRepresentationItem
{
	@Description("The list of oriented edges which are concatenated together to form this path.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a4fe7cfe-c5f5-4183-813f-88d75bd7cf83")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcOrientedEdge")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "edgeList")
	private List<IfcOrientedEdge> edgeList;


	public IfcPath()
	{
	}

	public IfcPath(IfcOrientedEdge[] edgeList)
	{
		this.edgeList = new ArrayList<>(Arrays.asList(edgeList));
	}

	public List<IfcOrientedEdge> getEdgeList() {
		return this.edgeList;
	}


}

