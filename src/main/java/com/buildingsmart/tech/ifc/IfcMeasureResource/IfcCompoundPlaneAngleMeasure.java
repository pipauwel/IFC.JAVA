package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcCompoundPlaneAngleMeasure implements IfcDerivedMeasureValue {
    @DataMember(Order = 0)
    private int degrees;

    @DataMember(Order = 1)
    private int minutes;

    @DataMember(Order = 2)
    private int seconds;

    @DataMember(Order = 3)
    private int microSeconds;

    public IfcCompoundPlaneAngleMeasure() {
    }

    public IfcCompoundPlaneAngleMeasure(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public IfcCompoundPlaneAngleMeasure(int degrees, int minutes, int seconds, int microSeconds) {
        this(degrees, minutes, seconds);
        this.microSeconds = microSeconds;
    }

    public int getDegrees() {
        return this.degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMicroSeconds() {
        return this.microSeconds;
    }

    public void setMicroSeconds(int microSeconds) {
        this.microSeconds = microSeconds;
    }
}
