#include "sub_animal.h"
#include "AnimalClass.h"
#include <bits/stdc++.h>
using namespace std;

Dog ::Dog() { cout << "Dog Constructor" << endl; }

Dog ::Dog(string n, COLOR c) : Mammal(n, c) {
  cout << "Dog Constructor with name " << n << "and color " << c << endl;
}

Dog ::~Dog() { cout << "Dog Destructor" << endl; }

void Dog ::speak() { cout << _name << " the dog woofs" << endl; }

void Dog ::move() { cout << _name << " the dog moves" << endl; }

void Dog ::eat() { cout << _name << " the dog eats" << endl; }

Lion ::Lion() { cout << "Lion Constructor" << endl; }

Lion ::Lion(string n, COLOR c) : Mammal(n, c) {
  cout << "Lion Constructor with name " << n << "and color " << c << endl;
}

Lion ::~Lion() { cout << "Lion Destructor" << endl; }

void Lion ::speak() { cout << _name << " the lion roars" << endl; }
void Lion ::move() { cout << _name << " the lion moves" << endl; }
void Lion ::eat() { cout << _name << " the lion eats" << endl; }

Cat ::Cat() { cout << "Cat Constructor" << endl; }

Cat ::Cat(string n, COLOR c) : Mammal(n, c) {
  cout << "Cat Constructor with name " << n << "and color " << c << endl;
}

Cat ::~Cat() { cout << "Cat Destructor" << endl; }

void Cat ::speak() { cout << _name << " the cat meows" << endl; }
void Cat ::move() { cout << _name << " the cat moves" << endl; }
void Cat ::eat() { cout << _name << " the cat eats" << endl; }
