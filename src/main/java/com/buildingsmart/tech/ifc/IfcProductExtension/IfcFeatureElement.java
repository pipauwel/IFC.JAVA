// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcSurfaceFeature;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("439553ce-81d9-4bd1-8648-bcf6a5ee6ecc")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcFeatureElementAddition.class, name = "IfcFeatureElementAddition"), @JsonSubTypes.Type(value = IfcFeatureElementSubtraction.class, name = "IfcFeatureElementSubtraction"), @JsonSubTypes.Type(value = IfcSurfaceFeature.class, name = "IfcSurfaceFeature")})
public abstract class IfcFeatureElement extends IfcElement
{

	public IfcFeatureElement()
	{
	}

	public IfcFeatureElement(String globalId)
	{
		super(globalId);
	}


}

