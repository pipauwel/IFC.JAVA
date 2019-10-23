// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("40ee8a1b-c5dc-4107-8d14-cb784713b9e5")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes( { @JsonSubTypes.Type(value = com.buildingsmart.tech.ifc.IfcKernel.IfcObject.class, name = "IfcObject"),  @JsonSubTypes.Type(value = com.buildingsmart.tech.ifc.IfcKernel.IfcContext.class, name = "IfcContext")})
public abstract class IfcObjectDefinition extends IfcRoot implements IfcDefinitionSelect
{
	@Description("Reference to the relationship objects, that assign (by an association relationship) other subtypes of IfcObject to this object instance. Examples are the association to products, processes, controls, resources or groups.")
	@Guid("859eb111-bab2-4e75-81cf-fc73701e2068")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssigns> hasAssignments = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssigns>();

	@JsonIgnore
	@Description("References to the decomposition relationship being a nesting. It determines that this object definition is a part within an ordered whole/part decomposition relationship. An object occurrence or type can only be part of a single decomposition (to allow hierarchical strutures only).    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute datatype has been added and separated from <em>Decomposes</em> defined at <em>IfcObjectDefinition</em>.</blockquote>")
	@MaxLength(1)
	@Guid("c991dcb4-4357-4933-b45c-77eb14c59839")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelNests> nests = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelNests>();

	@JacksonXmlProperty(isAttribute=false, localName = "IsNestedBy")
	@Description("References to the decomposition relationship being a nesting. It determines that this object definition is the whole within an ordered whole/part decomposition relationship. An object or object type can be nested by several other objects (occurrences or types).    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute datatype has been added and separated from <em>IsDecomposedBy</em> defined at <em>IfcObjectDefinition</em>.</blockquote>")
	@Guid("f61c2101-dddb-4f80-bfe6-e83bea5a1603")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelNests> isNestedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelNests>();

	@Description("References to the context providing context information such as project unit or representation context. It should only be asserted for the uppermost non-spatial object.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute datatype has been added.</blockquote>")
	@MaxLength(1)
	@Guid("0f4649a2-7360-4872-ab34-e0a3172e4ba1")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares> hasContext = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares>();

	@JacksonXmlProperty(isAttribute=false, localName = "IsDecomposedBy")
	@Description("References to the decomposition relationship being an aggregation. It determines that this object definition is whole within an unordered whole/part decomposition relationship. An object definitions can be aggregated by several other objects (occurrences or parts).    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute datatype has been changed from the supertype <em>IfcRelDecomposes</em> to subtype <em>IfcRelAggregates</em>.</blockquote>")
	@Guid("090a480e-fb85-4fdd-b904-d720ea0009c9")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates> isDecomposedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates>();

	@JsonIgnore
	@Description("References to the decomposition relationship being an aggregation. It determines that this object definition is a part within an unordered whole/part decomposition relationship. An object definitions can only be part of a single decomposition (to allow hierarchical strutures only).    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute datatype has been changed from the supertype <em>IfcRelDecomposes</em> to subtype <em>IfcRelAggregates</em>.</blockquote>")
	@MaxLength(1)
	@Guid("e138d591-4c0a-492f-9738-23a2b9d31c1a")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates> decomposes = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates>();

	@Description("Reference to the relationship objects, that associates external references or other resource definitions to the object.. Examples are the association to library, documentation or classification.")
	@Guid("ba2de5b1-245c-46c6-a778-f13a6f5e8768")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates> hasAssociations = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates>();


	public IfcObjectDefinition()
	{
	}

	public IfcObjectDefinition(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssigns> getHasAssignments() {
		return this.hasAssignments;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelNests> getNests() {
		return this.nests;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelNests> getIsNestedBy() {
		return this.isNestedBy;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares> getHasContext() {
		return this.hasContext;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates> getIsDecomposedBy() {
		return this.isDecomposedBy;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAggregates> getDecomposes() {
		return this.decomposes;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates> getHasAssociations() {
		return this.hasAssociations;
	}


}

