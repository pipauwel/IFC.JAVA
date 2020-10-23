// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySet;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("911b51d0-e3e7-45db-a881-520360ded638")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcComplexProperty.class, name = "IfcComplexProperty"), @JsonSubTypes.Type(value = IfcSimpleProperty.class, name = "IfcSimpleProperty")})
public abstract class IfcProperty extends IfcPropertyAbstraction
{
	@Description("Name for this property. This label is the significant name string that defines the semantic meaning for the property.")
	@DataMember(Order = 0)
	@Required()
	@Guid("cec40e31-025d-4bcc-ae89-09d7916a8ee6")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcIdentifier name;

	@Description("Informative text to explain the property.")
	@DataMember(Order = 1)
	@Guid("563a5298-c546-435f-98d5-4d192815257f")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Reference to the <em>IfcPropertySet</em> by which the <em>IfcProperty</em> is referenced.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute to navigate from <em>IfcProperty</em> to <em>IfcPropertySet</em> with upward compatibility for file based exchange.</blockquote>")
	@InverseProperty(InverseProp = "hasProperties", Range = "IfcPropertySet")
	@Guid("79ce08ab-7c92-4db4-9325-4a08c1c70c38")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertySet")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "partOfPset")*/
	@JsonIgnore
	private Set<IfcPropertySet> partOfPset;

	@Description("The property on whose value that of another property depends.")
	@InverseProperty(InverseProp = "dependingProperty", Range = "IfcPropertyDependencyRelationship")
	@Guid("386eb852-dc2b-4164-963e-1d2791e03caf")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertyDependencyRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "propertyForDependance")*/
	@JsonIgnore
	private Set<IfcPropertyDependencyRelationship> propertyForDependance;

	@Description("The relating property on which the value of the property depends.")
	@InverseProperty(InverseProp = "dependantProperty", Range = "IfcPropertyDependencyRelationship")
	@Guid("a26503fc-f130-45bc-90c4-05998f9e5137")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertyDependencyRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "propertyDependsOn")
	private Set<IfcPropertyDependencyRelationship> propertyDependsOn;

	@Description("Reference to the <em>IfcComplexProperty</em> in which the <em>IfcProperty</em> is contained.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The cardinality has changed to 0..n to allow reuse of instances of <em>IfcProperty</em> in several <em>IfcComplexProperty</em> with upward compatibility for file based exchange.</blockquote>")
	@InverseProperty(InverseProp = "hasProperties", Range = "IfcComplexProperty")
	@Guid("be34513c-c6e4-4dd1-b6be-63ae5e66413f")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcComplexProperty")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "partOfComplex")
	private Set<IfcComplexProperty> partOfComplex;

	@Description("User-defined constraints for the property.")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcResourceConstraintRelationship")
	@Guid("33bd1930-a3a9-40cd-a3cc-6c31ed80b89f")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceConstraintRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasConstraints")
	private Set<IfcResourceConstraintRelationship> hasConstraints;

	@Description("User-defined approvals for the property.")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcResourceApprovalRelationship")
	@Guid("a25de802-e2fe-47f2-adcd-e56cdc287d21")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceApprovalRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasApprovals")
	private Set<IfcResourceApprovalRelationship> hasApprovals;


	public IfcProperty()
	{
	}

	public IfcProperty(IfcIdentifier name)
	{
		this.name = name;
	}

	public IfcIdentifier getName() {
		return this.name;
	}

	public void setName(IfcIdentifier name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
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

