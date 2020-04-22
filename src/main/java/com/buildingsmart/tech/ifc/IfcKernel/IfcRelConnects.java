// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPorts;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPortToElement;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralActivity;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralMember;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRelCoversBldgElements;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRelCoversSpaces;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelFillsElement;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcRelFlowControlElements;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelInterferesElements;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelReferencedInSpatialStructure;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcRelSequence;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelServicesBuildings;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelationship;

@Guid("d1873043-e605-458b-826d-8e332289ba38")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcRelConnectsElements.class, name = "IfcRelConnectsElements"), @JsonSubTypes.Type(value = IfcRelConnectsPorts.class, name = "IfcRelConnectsPorts"), @JsonSubTypes.Type(value = IfcRelConnectsPortToElement.class, name = "IfcRelConnectsPortToElement"), @JsonSubTypes.Type(value = IfcRelConnectsStructuralActivity.class, name = "IfcRelConnectsStructuralActivity"), @JsonSubTypes.Type(value = IfcRelConnectsStructuralMember.class, name = "IfcRelConnectsStructuralMember"), @JsonSubTypes.Type(value = IfcRelContainedInSpatialStructure.class, name = "IfcRelContainedInSpatialStructure"), @JsonSubTypes.Type(value = IfcRelCoversBldgElements.class, name = "IfcRelCoversBldgElements"), @JsonSubTypes.Type(value = IfcRelCoversSpaces.class, name = "IfcRelCoversSpaces"), @JsonSubTypes.Type(value = IfcRelFillsElement.class, name = "IfcRelFillsElement"), @JsonSubTypes.Type(value = IfcRelFlowControlElements.class, name = "IfcRelFlowControlElements"), @JsonSubTypes.Type(value = IfcRelInterferesElements.class, name = "IfcRelInterferesElements"), @JsonSubTypes.Type(value = IfcRelReferencedInSpatialStructure.class, name = "IfcRelReferencedInSpatialStructure"), @JsonSubTypes.Type(value = IfcRelSequence.class, name = "IfcRelSequence"), @JsonSubTypes.Type(value = IfcRelServicesBuildings.class, name = "IfcRelServicesBuildings"), @JsonSubTypes.Type(value = IfcRelSpaceBoundary.class, name = "IfcRelSpaceBoundary")})
public abstract class IfcRelConnects extends IfcRelationship
{

	public IfcRelConnects()
	{
	}

	public IfcRelConnects(String globalId)
	{
		super(globalId);
	}


}

