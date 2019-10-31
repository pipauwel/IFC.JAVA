// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.*;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent;

@Guid("3f389407-9e81-4218-8102-56eb71651146")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMechanicalFastener extends IfcElementComponent
{
	@Description("The nominal diameter describing the cross-section size of the fastener type.    <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Deprecated; the respective attribute of <em>IfcMechanicalFastenerType</em> should be used instead.  </blockquote>")
	@Guid("58964986-572b-460b-8156-7b3fb1391575")
	@JacksonXmlProperty(isAttribute=false, localName = "NominalDiameter")
	private IfcPositiveLengthMeasure nominalDiameter;

	@Description("The nominal length describing the longitudinal dimensions of the fastener type.    <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Deprecated; the respective attribute of <em>IfcMechanicalFastenerType</em> should be used instead.  </blockquote>")
	@Guid("c2376fb0-5048-42ec-849f-fab982f91c21")
	@JacksonXmlProperty(isAttribute=false, localName = "NominalLength")
	private IfcPositiveLengthMeasure nominalLength;

	@Description("Subtype of mechanical fastener")
	@Guid("7e80e1fd-a363-4d2b-aed4-5c611e85a6f5")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcMechanicalFastenerTypeEnum predefinedType;


	public IfcMechanicalFastener()
	{
	}

	public IfcMechanicalFastener(String globalId)
	{
		super(globalId);
	}

	public IfcPositiveLengthMeasure getNominalDiameter() {
		return this.nominalDiameter;
	}

	public void setNominalDiameter(IfcPositiveLengthMeasure nominalDiameter) {
		this.nominalDiameter = nominalDiameter;
	}

	public IfcPositiveLengthMeasure getNominalLength() {
		return this.nominalLength;
	}

	public void setNominalLength(IfcPositiveLengthMeasure nominalLength) {
		this.nominalLength = nominalLength;
	}

	public IfcMechanicalFastenerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMechanicalFastenerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

