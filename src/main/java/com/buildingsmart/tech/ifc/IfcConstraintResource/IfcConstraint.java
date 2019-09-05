// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d03dd5c6-bc93-4f7a-903f-d59e7c256d59")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcConstraint implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("A human-readable name to be used for the constraint.")
	@Required()
	@Guid("a96ada47-fcff-40e9-9a9c-b70ac0c99a51")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("A human-readable description that may apply additional information about a constraint.")
	@Guid("0a3a6e99-aefa-43e9-8879-dd20addf527d")
	private String description;

	@JacksonXmlProperty(isAttribute=true, localName = "ConstraintGrade")
	@Description("Enumeration that qualifies the type of constraint.")
	@Required()
	@Guid("bf869c29-5929-4e43-b21b-787d7cce70a3")
	private com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraintEnum constraintGrade;

	@JacksonXmlProperty(isAttribute=true, localName = "ConstraintSource")
	@Description("Any source material, such as a code or standard, from which the constraint originated.")
	@Guid("b66f856a-0c4f-4ea8-945d-427e9a936555")
	private String constraintSource;

	@Description("Person and/or organization that has created the constraint.")
	@Guid("4730840e-ab1d-4c08-98f1-5d6971c50e1a")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect creatingActor;

	@JacksonXmlProperty(isAttribute=true, localName = "CreationTime")
	@Description("Time when information specifying the constraint instance was created.")
	@Guid("f2e74ad7-9998-444d-b4f1-9cbaa8740a15")
	private String creationTime;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedGrade")
	@Description("Allows for specification of user defined grade of the constraint  beyond the enumeration values (hard, soft, advisory) provided by ConstraintGrade attribute of type <em>IfcConstraintEnum</em>.   When a value is provided for attribute UserDefinedGrade in parallel the attribute ConstraintGrade shall have enumeration value USERDEFINED.")
	@Guid("9c83de82-3273-4c32-91c6-ae490c5c104d")
	private String userDefinedGrade;

	@Description("Reference to an external references, e.g. library, classification, or document information, that are associated to the constraint.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@Guid("0acdd9d1-5a08-4e9a-ac1d-5bfdccf3d6d2")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> hasExternalReferences = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();

	@Description("Reference to the properties to which the constraint is applied.")
	@Guid("ae15850d-b69e-467e-9807-7fcf73ab1bcb")
	private Set<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship> propertiesForConstraint = new HashSet<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship>();


	public IfcConstraint()
	{
	}

	public IfcConstraint(String name, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraintEnum constraintGrade)
	{
		this.name = name;
		this.constraintGrade = constraintGrade;
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

	public com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraintEnum getConstraintGrade() {
		return this.constraintGrade;
	}

	public void setConstraintGrade(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraintEnum constraintGrade) {
		this.constraintGrade = constraintGrade;
	}

	public String getConstraintSource() {
		return this.constraintSource;
	}

	public void setConstraintSource(String constraintSource) {
		this.constraintSource = constraintSource;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getCreatingActor() {
		return this.creatingActor;
	}

	public void setCreatingActor(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect creatingActor) {
		this.creatingActor = creatingActor;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getUserDefinedGrade() {
		return this.userDefinedGrade;
	}

	public void setUserDefinedGrade(String userDefinedGrade) {
		this.userDefinedGrade = userDefinedGrade;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getHasExternalReferences() {
		return this.hasExternalReferences;
	}

	public Set<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship> getPropertiesForConstraint() {
		return this.propertiesForConstraint;
	}


}

