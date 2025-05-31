#pragma once

#include <bits/stdc++.h>
using namespace std;

enum COLOR {Green, Blue, White, Black, Brown};

class Animal {

    protected:
        string _name;
        COLOR _color;
    
    public:
        Animal ();
        Animal (string n, COLOR c);
        ~Animal ();
        virtual void speak() = 0;
        virtual void move() = 0;
        virtual void eat() = 0;
};

class Mammal : public Animal {
    public:
        Mammal ();
        Mammal (string n, COLOR c);
        ~Mammal ();    
};

