// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDateTime;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("d03dd5c6-bc93-4f7a-903f-d59e7c256d59")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMetric.class, name = "IfcMetric"), @JsonSubTypes.Type(value = IfcObjective.class, name = "IfcObjective")})
public abstract class IfcConstraint implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("A human-readable name to be used for the constraint.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a96ada47-fcff-40e9-9a9c-b70ac0c99a51")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("A human-readable description that may apply additional information about a constraint.")
	@DataMember(Order = 1)
	@Guid("0a3a6e99-aefa-43e9-8879-dd20addf527d")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Enumeration that qualifies the type of constraint.")
	@DataMember(Order = 2)
	@Required()
	@Guid("bf869c29-5929-4e43-b21b-787d7cce70a3")
	@JacksonXmlProperty(isAttribute=true, localName = "constraintGrade")
	private IfcConstraintEnum constraintGrade;

	@Description("Any source material, such as a code or standard, from which the constraint originated.")
	@DataMember(Order = 3)
	@Guid("b66f856a-0c4f-4ea8-945d-427e9a936555")
	@JacksonXmlProperty(isAttribute=false, localName = "constraintSource")
	private IfcLabel constraintSource;

	@Description("Person and/or organization that has created the constraint.")
	@DataMember(Order = 4)
	@Guid("4730840e-ab1d-4c08-98f1-5d6971c50e1a")
	@JacksonXmlProperty(isAttribute=true, localName = "creatingActor")
	private IfcActorSelect creatingActor;

	@Description("Time when information specifying the constraint instance was created.")
	@DataMember(Order = 5)
	@Guid("f2e74ad7-9998-444d-b4f1-9cbaa8740a15")
	@JacksonXmlProperty(isAttribute=true, localName = "creationTime")
	private IfcDateTime creationTime;

	@Description("Allows for specification of user defined grade of the constraint  beyond the enumeration values (hard, soft, advisory) provided by ConstraintGrade attribute of type <em>IfcConstraintEnum</em>.   When a value is provided for attribute UserDefinedGrade in parallel the attribute ConstraintGrade shall have enumeration value USERDEFINED.")
	@DataMember(Order = 6)
	@Guid("9c83de82-3273-4c32-91c6-ae490c5c104d")
	@JacksonXmlProperty(isAttribute=true, localName = "userDefinedGrade")
	private IfcLabel userDefinedGrade;

	@Description("Reference to an external references, e.g. library, classification, or document information, that are associated to the constraint.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcExternalReferenceRelationship")
	@Guid("0acdd9d1-5a08-4e9a-ac1d-5bfdccf3d6d2")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasExternalReferences")
	private Set<IfcExternalReferenceRelationship> hasExternalReferences;

	@Description("Reference to the properties to which the constraint is applied.")
	@InverseProperty(InverseProp = "relatingConstraint", Range = "IfcResourceConstraintRelationship")
	@Guid("ae15850d-b69e-467e-9807-7fcf73ab1bcb")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceConstraintRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "propertiesForConstraint")*/
	@JsonIgnore
	private Set<IfcResourceConstraintRelationship> propertiesForConstraint;


	public IfcConstraint()
	{
	}

	public IfcConstraint(IfcLabel name, IfcConstraintEnum constraintGrade)
	{
		this.name = name;
		this.constraintGrade = constraintGrade;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public IfcConstraintEnum getConstraintGrade() {
		return this.constraintGrade;
	}

	public void setConstraintGrade(IfcConstraintEnum constraintGrade) {
		this.constraintGrade = constraintGrade;
	}

	public IfcLabel getConstraintSource() {
		return this.constraintSource;
	}

	public void setConstraintSource(IfcLabel constraintSource) {
		this.constraintSource = constraintSource;
	}

	public IfcActorSelect getCreatingActor() {
		return this.creatingActor;
	}

	public void setCreatingActor(IfcActorSelect creatingActor) {
		this.creatingActor = creatingActor;
	}

	public IfcDateTime getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(IfcDateTime creationTime) {
		this.creationTime = creationTime;
	}

	public IfcLabel getUserDefinedGrade() {
		return this.userDefinedGrade;
	}

	public void setUserDefinedGrade(IfcLabel userDefinedGrade) {
		this.userDefinedGrade = userDefinedGrade;
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReferences() {
		return this.hasExternalReferences;
	}

	public Set<IfcResourceConstraintRelationship> getPropertiesForConstraint() {
		return this.propertiesForConstraint;
	}


}

