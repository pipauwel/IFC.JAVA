// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("9d0506f4-1626-4bd0-8b81-426609d1f6c0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcDraughtingPreDefinedCurveFont.class, name = "IfcDraughtingPreDefinedCurveFont"))
public abstract class IfcPreDefinedCurveFont extends IfcPreDefinedItem implements IfcCurveStyleFontSelect
{

	public IfcPreDefinedCurveFont()
	{
	}

	public IfcPreDefinedCurveFont(IfcLabel name)
	{
		super(name);
	}


}

