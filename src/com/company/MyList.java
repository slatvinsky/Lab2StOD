package com.company;

import java.util.Arrays;

public class MyList {
    private int tail;
    Human[] humans;

    public MyList() {
        this.humans = new Human[1000];
    }

    public boolean IsEmpty() {
        for (Human h: this.humans) {
            if (h != null) {return false;}
        }
        return true;
    }

    public void PushBack(Human newOne) {
        if (this.IsEmpty()) {
            this.tail = 0;
            this.humans[0] = newOne;
        } else {
            if (this.tail+1 > this.humans.length) {System.out.println("Массив забит под завязку!");return;}
            this.humans[tail+1] = newOne;
            this.tail++;
        }
    }

    public void PushFront(Human newOne) {
        if (this.IsEmpty()) {
            this.tail = 0;
            this.humans[0] = newOne;
        } else {
            if (this.tail+1 > this.humans.length) {System.out.println("Массив забит под завязку!");return;}
            Human[] newHumans = new Human[1000];
            for (int i = 0; i < this.tail+1; i++) {
                newHumans[i+1] = this.humans[i];
            }
            newHumans[0] = newOne;
            this.humans = newHumans;
            this.tail++;
        }
    }

    public void PopBack() {
        if (this.IsEmpty()) return;
        Human[] newHumans = new Human[1000];
        for (int i = 0; i < this.tail; i++) {
            newHumans[i] = this.humans[i];
        }
        this.humans = newHumans;
        this.tail--;
    }

    public void PopFront() {
        if (this.IsEmpty()) return;
        Human[] newHumans = new Human[1000];
        for (int i = 1; i < this.tail+1; i++) {
            newHumans[i-1] = this.humans[i];
        }
        this.humans = newHumans;
        this.tail--;
    }

    public void Clear() {
        if (this.IsEmpty()) return;
        this.humans = null;
    }

    public Human Get(int index) {
        if (this.IsEmpty()) return null;
        if (index > this.tail) return null;
        return this.humans[index];
    }

    public void Set(Human newOne, int index) {
        if (this.IsEmpty()) return;
        if (index > this.tail) return;
        this.humans[index] = newOne;
    }

    public int Size() {
        return this.tail+1;
    }

    @Override
    public String toString() {
        String out = "";
        if (this.IsEmpty()) {
            out = "Список пуст!";
        } else {
            for (Human h : this.humans) {
                if (h != null) {
                    out += "\nИмя: " + h.name + ", вес: " + h.weight;
                }
            }
        }
        return out;
    }

    /*private Human[] CreateArray(int amount) {
        return new Human[amount];
    }*/
}
