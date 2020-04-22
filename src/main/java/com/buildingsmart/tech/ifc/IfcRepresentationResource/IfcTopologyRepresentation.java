// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

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
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeModel;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem;

@Guid("c2cc1d04-121f-49bb-9e9e-2578ff7811ef")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTopologyRepresentation extends IfcShapeModel
{

	public IfcTopologyRepresentation()
	{
	}

	public IfcTopologyRepresentation(IfcRepresentationContext contextOfItems, IfcRepresentationItem[] items)
	{
		super(contextOfItems, items);
	}


}

