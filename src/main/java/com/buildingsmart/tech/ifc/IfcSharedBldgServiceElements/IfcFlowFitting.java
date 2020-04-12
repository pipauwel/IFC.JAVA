// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableCarrierFitting;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableFitting;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcJunctionBox;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFitting;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPipeFitting;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("7f58cd3c-d48d-44b7-8927-8ff671973559")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
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

