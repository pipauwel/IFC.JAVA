// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

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
import com.buildingsmart.tech.ifc.IfcPropertyResource.*;
import com.buildingsmart.tech.ifc.IfcConstraintResource.*;
import com.buildingsmart.tech.ifc.IfcApprovalResource.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcComplexProperty;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcSimpleProperty;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyAbstraction;

@Guid("911b51d0-e3e7-45db-a881-520360ded638")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcComplexProperty.class, name = "IfcComplexProperty"), @JsonSubTypes.Type(value = IfcSimpleProperty.class, name = "IfcSimpleProperty")})
public abstract class IfcProperty extends IfcPropertyAbstraction
{
	@Description("Name for this property. This label is the significant name string that defines the semantic meaning for the property.")
	@Required()
	@Guid("cec40e31-025d-4bcc-ae89-09d7916a8ee6")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Informative text to explain the property.")
	@Guid("563a5298-c546-435f-98d5-4d192815257f")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("Reference to the <em>IfcPropertySet</em> by which the <em>IfcProperty</em> is referenced.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute to navigate from <em>IfcProperty</em> to <em>IfcPropertySet</em> with upward compatibility for file based exchange.</blockquote>")
	@Guid("79ce08ab-7c92-4db4-9325-4a08c1c70c38")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertySet")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "PartOfPset")
	private Set<IfcPropertySet> partOfPset;

	@Description("The property on whose value that of another property depends.")
	@Guid("386eb852-dc2b-4164-963e-1d2791e03caf")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertyDependencyRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "PropertyForDependance")
	private Set<IfcPropertyDependencyRelationship> propertyForDependance;

	@Description("The relating property on which the value of the property depends.")
	@Guid("a26503fc-f130-45bc-90c4-05998f9e5137")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertyDependencyRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "PropertyDependsOn")
	private Set<IfcPropertyDependencyRelationship> propertyDependsOn;

	@Description("Reference to the <em>IfcComplexProperty</em> in which the <em>IfcProperty</em> is contained.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The cardinality has changed to 0..n to allow reuse of instances of <em>IfcProperty</em> in several <em>IfcComplexProperty</em> with upward compatibility for file based exchange.</blockquote>")
	@Guid("be34513c-c6e4-4dd1-b6be-63ae5e66413f")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcComplexProperty")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "PartOfComplex")
	private Set<IfcComplexProperty> partOfComplex;

	@Description("User-defined constraints for the property.")
	@Guid("33bd1930-a3a9-40cd-a3cc-6c31ed80b89f")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceConstraintRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasConstraints")
	private Set<IfcResourceConstraintRelationship> hasConstraints;

	@Description("User-defined approvals for the property.")
	@Guid("a25de802-e2fe-47f2-adcd-e56cdc287d21")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceApprovalRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasApprovals")
	private Set<IfcResourceApprovalRelationship> hasApprovals;


	public IfcProperty()
	{
	}

	public IfcProperty(String name)
	{
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<IfcPropertySet> getPartOfPset() {
		return this.partOfPset;
	}

	public Set<IfcPropertyDependencyRelationship> getPropertyForDependance() {
		return this.propertyForDependance;
	}

	public Set<IfcPropertyDependencyRelationship> getPropertyDependsOn() {
		return this.propertyDependsOn;
	}

	public Set<IfcComplexProperty> getPartOfComplex() {
		return this.partOfComplex;
	}

	public Set<IfcResourceConstraintRelationship> getHasConstraints() {
		return this.hasConstraints;
	}

	public Set<IfcResourceApprovalRelationship> getHasApprovals() {
		return this.hasApprovals;
	}


}

