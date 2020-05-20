// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcAddress;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcOrganization;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPersonAndOrganization;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeries;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReference;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition;
import com.buildingsmart.tech.ifc.IfcUtilityResource.IfcTable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("d27db37d-229f-4d7e-8f8d-6f135a6cc6e5")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMaterialDefinition.class, name = "IfcMaterialDefinition"),
        @JsonSubTypes.Type(value = IfcPerson.class, name = "IfcPerson"),
        @JsonSubTypes.Type(value = IfcOrganization.class, name = "IfcOrganization"),
        @JsonSubTypes.Type(value = IfcPersonAndOrganization.class, name = "IfcPersonAndOrganization"),
        @JsonSubTypes.Type(value = IfcExternalReference.class, name = "IfcExternalReference"),
        @JsonSubTypes.Type(value = IfcTimeSeries.class, name = "IfcTimeSeries"),
        @JsonSubTypes.Type(value = IfcAddress.class, name = "IfcAddress"),
        @JsonSubTypes.Type(value = IfcAppliedValue.class, name = "IfcAppliedValue"),
        @JsonSubTypes.Type(value = IfcTable.class, name = "IfcTable")})
public interface IfcObjectReferenceSelect {

}
