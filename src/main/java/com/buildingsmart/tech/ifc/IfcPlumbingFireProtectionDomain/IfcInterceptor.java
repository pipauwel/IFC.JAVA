// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

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
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDevice;

@Guid("e3d3bfe0-c86d-4073-9f99-8d5705ca829c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcInterceptor extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDevice
{
	@Guid("56e98bc5-d9b1-41ef-ac13-f9517c351b31")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcInterceptorTypeEnum predefinedType;


	public IfcInterceptor()
	{
	}

	public IfcInterceptor(String globalId)
	{
		super(globalId);
	}

	public IfcInterceptorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcInterceptorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

