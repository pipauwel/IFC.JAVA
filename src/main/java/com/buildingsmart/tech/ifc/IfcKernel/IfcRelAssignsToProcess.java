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
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssigns;
import com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProcessSelect;

@Guid("2b84a703-2870-4982-b755-d5e128989509")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToProcess extends IfcRelAssigns
{
	@Description("Reference to the process to which the objects are assigned to.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Datatype expanded to include <em>IfcProcess</em> and <em>IfcTypeProcess</em>.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("54a9a406-c37a-4960-bd8e-5ffa24089552")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingProcess")
	private IfcProcessSelect relatingProcess;

	@Description("Quantity of the object specific for the operation by this process.")
	@DataMember(Order = 1)
	@Guid("d46dadaf-98f8-4365-b82a-c34da0aaab02")
	@JacksonXmlProperty(isAttribute=false, localName = "QuantityInProcess")
	private IfcMeasureWithUnit quantityInProcess;


	public IfcRelAssignsToProcess()
	{
	}

	public IfcRelAssignsToProcess(String globalId, IfcObjectDefinition[] relatedObjects, IfcProcessSelect relatingProcess)
	{
		super(globalId, relatedObjects);
		this.relatingProcess = relatingProcess;
	}

	public IfcProcessSelect getRelatingProcess() {
		return this.relatingProcess;
	}

	public void setRelatingProcess(IfcProcessSelect relatingProcess) {
		this.relatingProcess = relatingProcess;
	}

	public IfcMeasureWithUnit getQuantityInProcess() {
		return this.quantityInProcess;
	}

	public void setQuantityInProcess(IfcMeasureWithUnit quantityInProcess) {
		this.quantityInProcess = quantityInProcess;
	}


}

