package com.buildingsmart.tech.IO;

import com.buildingsmart.tech.ifcowl.vo.IFCVO;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ToBeMappedObject {

    private Object clsInstance;
    private Field field;
    private IFCVO ifcvo;

    public static List<ToBeMappedObject> listOfObjects = new ArrayList<>();

    public ToBeMappedObject(){
        listOfObjects.add(this);

    }

    public ToBeMappedObject(Object clsInstance, Field field, IFCVO ifcvo){
        this();
        this.clsInstance = clsInstance;
        this.field = field;
        this.ifcvo = ifcvo;
    }

    public Object getClsInstance() {
        return clsInstance;
    }

    public Field getField() {
        return field;
    }

    public IFCVO getIfcvo() {
        return ifcvo;
    }

    public void setClsInstance(Object clsInstance) {
        this.clsInstance = clsInstance;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setIfcvo(IFCVO ifcvo) {
        this.ifcvo = ifcvo;
    }
}
