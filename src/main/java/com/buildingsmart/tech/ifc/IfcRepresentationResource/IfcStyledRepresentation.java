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
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcStyleModel;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem;

@Guid("a1be0696-4986-4097-aad4-dc9d385d95b5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStyledRepresentation extends IfcStyleModel
{

	public IfcStyledRepresentation()
	{
	}

	public IfcStyledRepresentation(IfcRepresentationContext contextOfItems, IfcRepresentationItem[] items)
	{
		super(contextOfItems, items);
	}


}

