// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("63ee3d6e-fbeb-4c25-a0a5-13c7bceed367")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcDistributionChamberElement.class, name = "IfcDistributionChamberElement"), @JsonSubTypes.Type(value = IfcEnergyConversionDevice.class, name = "IfcEnergyConversionDevice"), @JsonSubTypes.Type(value = IfcFlowController.class, name = "IfcFlowController"), @JsonSubTypes.Type(value = IfcFlowFitting.class, name = "IfcFlowFitting"), @JsonSubTypes.Type(value = IfcFlowMovingDevice.class, name = "IfcFlowMovingDevice"), @JsonSubTypes.Type(value = IfcFlowSegment.class, name = "IfcFlowSegment"), @JsonSubTypes.Type(value = IfcFlowStorageDevice.class, name = "IfcFlowStorageDevice"), @JsonSubTypes.Type(value = IfcFlowTerminal.class, name = "IfcFlowTerminal"), @JsonSubTypes.Type(value = IfcFlowTreatmentDevice.class, name = "IfcFlowTreatmentDevice")})
public class IfcDistributionFlowElement extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement
{
	@Description("Reference to the relationship object that relates control elements.")
	@Guid("7b76723e-76d9-4d81-906b-eb95f697c628")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelFlowControlElements")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasControlElements")
	private Set<IfcRelFlowControlElements> hasControlElements;


	public IfcDistributionFlowElement()
	{
	}

	public IfcDistributionFlowElement(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelFlowControlElements> getHasControlElements() {
		return this.hasControlElements;
	}


}

