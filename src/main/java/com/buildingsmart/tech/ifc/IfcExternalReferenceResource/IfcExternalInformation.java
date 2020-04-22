// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

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
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcClassification;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibraryInformation;

@Guid("a9b67678-5e85-4cd3-9ae8-9dd2148a1fd7")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcClassification.class, name = "IfcClassification"), @JsonSubTypes.Type(value = IfcDocumentInformation.class, name = "IfcDocumentInformation"), @JsonSubTypes.Type(value = IfcLibraryInformation.class, name = "IfcLibraryInformation")})
public abstract class IfcExternalInformation implements IfcResourceObjectSelect
{

	public IfcExternalInformation()
	{
	}


}

