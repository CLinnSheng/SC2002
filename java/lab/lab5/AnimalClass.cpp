#include <bits/stdc++.h>
#include "AnimalClass.h"
using namespace std;

const string COLOR_NAME[] = {"Green", "Blue", "White", "Black", "Brown"};

Animal :: Animal() : _name("unkown") {
    cout << "Constructing Animal Object " << _name << endl;
}

Animal :: Animal(string n, COLOR c) : _name(n), _color(c) {
    cout << "constructing Animal object " << n << " with color " << COLOR_NAME[c] << endl;
}

Animal :: ~Animal() {
    cout << "destructing Animal object " << _name << endl;
}

Mammal :: Mammal() {}

Mammal :: Mammal (string n, COLOR c) : Animal(n, c) {
    cout << "constructing Mammal object " << n << " " << COLOR_NAME[c] << endl;      
}

Mammal :: ~Mammal() {
    cout << "destructing Mammal object " << endl;
}