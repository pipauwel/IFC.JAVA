// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcActorRole;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization;
import com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeries;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcContextDependentUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcConversionBasedUnit;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyAbstraction;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("14133e82-427a-46f3-b238-d65a9ef4d7b3")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPropertyAbstraction.class, name = "IfcPropertyAbstraction"),
        @JsonSubTypes.Type(value = IfcPhysicalQuantity.class, name = "IfcPhysicalQuantity"),
        @JsonSubTypes.Type(value = IfcAppliedValue.class, name = "IfcAppliedValue"),
        @JsonSubTypes.Type(value = IfcContextDependentUnit.class, name = "IfcContextDependentUnit"),
        @JsonSubTypes.Type(value = IfcConversionBasedUnit.class, name = "IfcConversionBasedUnit"),
        @JsonSubTypes.Type(value = IfcProfileDef.class, name = "IfcProfileDef"),
        @JsonSubTypes.Type(value = IfcActorRole.class, name = "IfcActorRole"),
        @JsonSubTypes.Type(value = IfcApproval.class, name = "IfcApproval"),
        @JsonSubTypes.Type(value = IfcConstraint.class, name = "IfcConstraint"),
        @JsonSubTypes.Type(value = IfcTimeSeries.class, name = "IfcTimeSeries"),
        @JsonSubTypes.Type(value = IfcMaterialDefinition.class, name = "IfcMaterialDefinition"),
        @JsonSubTypes.Type(value = IfcPerson.class, name = "IfcPerson"),
        @JsonSubTypes.Type(value = IfcPersonAndOrganization.class, name = "IfcPersonAndOrganization"),
        @JsonSubTypes.Type(value = IfcOrganization.class, name = "IfcOrganization"),
        @JsonSubTypes.Type(value = IfcExternalReference.class, name = "IfcExternalReference"),
        @JsonSubTypes.Type(value = IfcExternalInformation.class, name = "IfcExternalInformation")})
public interface IfcResourceObjectSelect {

}
