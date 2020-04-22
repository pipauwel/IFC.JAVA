// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

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
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctSilencer;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilter;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcInterceptor;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("6f2f6fc1-3e10-4e47-94b8-b2f704062175")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcDuctSilencer.class, name = "IfcDuctSilencer"), @JsonSubTypes.Type(value = IfcFilter.class, name = "IfcFilter"), @JsonSubTypes.Type(value = IfcInterceptor.class, name = "IfcInterceptor")})
public class IfcFlowTreatmentDevice extends IfcDistributionFlowElement
{

	public IfcFlowTreatmentDevice()
	{
	}

	public IfcFlowTreatmentDevice(String globalId)
	{
		super(globalId);
	}


}

