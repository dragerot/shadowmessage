package net.toregard.model;

import java.io.Serializable;

public class KontaktDetaljerId implements Serializable {
    private TypeMelding type;
    private String id;

    public KontaktDetaljerId() {
    }

    public KontaktDetaljerId(TypeMelding type,String id) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TypeMelding getType() {
        return type;
    }

    public void setType(TypeMelding type) {
        this.type = type;
    }
}
