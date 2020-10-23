package com.buildingsmart.tech.IO;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ToBeMappedList {
    private Object clsInstance;
    private Field field;
    private LinkedList<Object> linkedlist;

    public static List<ToBeMappedList> listOfObjects = new ArrayList<>();

    public ToBeMappedList(){
        listOfObjects.add(this);
    }

    public ToBeMappedList(Object clsInstance, Field field, LinkedList<Object> linkedlist){
        this();
        this.clsInstance = clsInstance;
        this.field = field;
        this.linkedlist = linkedlist;
    }

    public Object getClsInstance() {
        return clsInstance;
    }

    public Field getField() {
        return field;
    }

    public LinkedList<Object> getLinkedlist() {
        return linkedlist;
    }

    public void setClsInstance(Object clsInstance) {
        this.clsInstance = clsInstance;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setLinkedlist(LinkedList<Object> linkedlist) {
        this.linkedlist = linkedlist;
    }
}
