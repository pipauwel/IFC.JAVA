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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableCarrierFitting;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableFitting;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFitting;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcJunctionBox;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPipeFitting;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("7f58cd3c-d48d-44b7-8927-8ff671973559")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCableCarrierFitting.class, name = "IfcCableCarrierFitting"), @JsonSubTypes.Type(value = IfcCableFitting.class, name = "IfcCableFitting"), @JsonSubTypes.Type(value = IfcDuctFitting.class, name = "IfcDuctFitting"), @JsonSubTypes.Type(value = IfcJunctionBox.class, name = "IfcJunctionBox"), @JsonSubTypes.Type(value = IfcPipeFitting.class, name = "IfcPipeFitting")})
public class IfcFlowFitting extends IfcDistributionFlowElement
{

	public IfcFlowFitting()
	{
	}

	public IfcFlowFitting(String globalId)
	{
		super(globalId);
	}


}

