// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates;
import com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcClassificationSelect;

@Guid("4bd9bd82-20ff-4504-bb85-feccfdfe7377")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesClassification extends IfcRelAssociates
{
	@Description("Classification applied to the objects.")
	@Required()
	@Guid("ce934d5a-d2ac-453a-a81a-d7b328c37048")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingClassification")
	private IfcClassificationSelect relatingClassification;


	public IfcRelAssociatesClassification()
	{
	}

	public IfcRelAssociatesClassification(String globalId, IfcDefinitionSelect[] relatedObjects, IfcClassificationSelect relatingClassification)
	{
		super(globalId, relatedObjects);
		this.relatingClassification = relatingClassification;
	}

	public IfcClassificationSelect getRelatingClassification() {
		return this.relatingClassification;
	}

	public void setRelatingClassification(IfcClassificationSelect relatingClassification) {
		this.relatingClassification = relatingClassification;
	}


}

