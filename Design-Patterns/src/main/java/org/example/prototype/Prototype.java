package org.example.prototype;

public interface Prototype extends Cloneable {
    public AccessControl clone() throws CloneNotSupportedException;
}
