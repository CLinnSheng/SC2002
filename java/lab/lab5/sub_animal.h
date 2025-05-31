#pragma once

#include "AnimalClass.h"
#include <bits/stdc++.h>
using namespace std;

class Dog : public Mammal {
    public:
        Dog ();
        Dog (string n, COLOR c);
        ~Dog ();
        void speak ();
        void move ();
        void eat ();
};

class Lion : public Mammal {
    public:
        Lion ();
        Lion (string n, COLOR c);
        ~Lion();
        void speak ();
        void move ();
        void eat ();
};

class Cat : public Mammal {
    public:
        Cat ();
        Cat (string n, COLOR c);
        ~Cat();
        void speak ();
        void move ();
        void eat ();
};
