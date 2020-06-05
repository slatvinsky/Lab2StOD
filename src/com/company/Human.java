package com.company;

public class Human {
    String name;
    float weight;

    public Human(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public void ChangeName(String newName) {
        this.name = newName;
    }

    public String GetName() {
        return this.name;
    }

    public void ChangeWeight(float newWeight) {
        this.weight = newWeight;
    }

    public float GetWeight() {
        return this.weight;
    }
}
