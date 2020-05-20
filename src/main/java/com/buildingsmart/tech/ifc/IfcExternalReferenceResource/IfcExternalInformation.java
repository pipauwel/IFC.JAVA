// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("a9b67678-5e85-4cd3-9ae8-9dd2148a1fd7")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcClassification.class, name = "IfcClassification"),
		@JsonSubTypes.Type(value = IfcDocumentInformation.class, name = "IfcDocumentInformation"),
		@JsonSubTypes.Type(value = IfcLibraryInformation.class, name = "IfcLibraryInformation")})
public abstract class IfcExternalInformation implements IfcResourceObjectSelect
{

	public IfcExternalInformation()
	{
	}
}

