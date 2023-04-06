package org.example.momento;

public class Originator {
    private double x;
    private double y;

    private String lastUndoSavepoint;
    CareTaker careTaker;

    public Originator(double x, double y, CareTaker careTaker) {
        this.x = x;
        this.y = y;

        this.careTaker = careTaker;

        createSavepoint("INITIAL");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void createSavepoint(String savepointName) {
        careTaker.saveMomento(new Momento(this.x, this.y), savepointName);
        lastUndoSavepoint = savepointName;
    }

    public void undo() {
        setOriginatorState(lastUndoSavepoint);
    }

    public void undo(String savepointName) {
        setOriginatorState(savepointName);
    }

    public void undoAll() {
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }

    private void setOriginatorState(String savepointName) {
        Momento mem = careTaker.getMomento(savepointName);
        this.x = mem.getX();
        this.y = mem.getY();
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y;
    }
}
