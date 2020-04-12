// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableCarrierFittingType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableFittingType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcJunctionBoxType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctFittingType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcPipeFittingType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("f7823efc-7635-4958-9275-86f733317c9b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCableCarrierFittingType.class, name = "IfcCableCarrierFittingType"), @JsonSubTypes.Type(value = IfcCableFittingType.class, name = "IfcCableFittingType"), @JsonSubTypes.Type(value = IfcDuctFittingType.class, name = "IfcDuctFittingType"), @JsonSubTypes.Type(value = IfcJunctionBoxType.class, name = "IfcJunctionBoxType"), @JsonSubTypes.Type(value = IfcPipeFittingType.class, name = "IfcPipeFittingType")})
public abstract class IfcFlowFittingType extends IfcDistributionFlowElementType
{

	public IfcFlowFittingType()
	{
	}

	public IfcFlowFittingType(String globalId)
	{
		super(globalId);
	}


}

