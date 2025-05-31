#include <bits/stdc++.h>
using namespace std;

enum COLOR {Green, Blue, White, Black, Brown};
const string COLOR_NAME[] = {"Green", "Blue", "White", "Black", "Brown"};

class Animal {
  
    private:
        string _name;
        COLOR _color;
        
    public:
        Animal () : _name("unkown") {
            cout << "constructing Animal object" << _name << endl;
        }
        
        Animal (string _name, COLOR _color) : _name(_name), _color(_color) {
            cout << "constructing Animal object " << _name << " " << COLOR_NAME[_color] << endl;
        }
        
        ~Animal () {
            cout << "destructing Animal object" << _name << endl;
        }
        
        virtual void speak () const {
            cout << "Animal speaks" << endl;
        }
        
        virtual void move() = 0;
};

class Mammal : public Animal {
  
    public:
        Mammal (string _name, COLOR _color) : Animal(_name, _color) {
            cout << "constructing Mammal object" << endl;
        }
        
        Mammal () {
            cout << "constructing Mammal object" << endl;
        }
        
        ~Mammal () {
            cout << "destructing Mammal object"  << endl;
        }
        
        void eat () const {
            cout << "Mammal eat" << endl;
        }
        
        void move() {
            cout << "Mammal move" << endl;
        }
};

class Dog : public Mammal {
    
    private:
        string owner;
        
    public:
        Dog (string _name, COLOR _color, string _owner) : Mammal(_name, _color), owner(_owner) {
            cout << "constructing Dog object" << endl;
        }
        
        Dog () {
            cout << "constructing Dog object" << endl;
        }
        
        ~Dog () {
            cout << "destructing Dog object" << endl;
        }
        
        void speak () const {
            cout << "Dog speaks" << endl;
        }
        
        void move () {
            cout << "Dog move" << endl;
        }
};

int main () {
    
    // Animal a;
    // a.speak();
    // Animal b = Animal("Dog", Blue);
    // cout << "Program exiting ...." << endl;
    // Mammal m("Cow", Black);
    // m.speak();
    // m.move();
    
    // Dog d("John", Black, "LinnSHeng");
    // d.speak();
    // d.move();
    
    // Animal *animalPtr = new Dog("Lassie", White, "Andy");
    // animalPtr->move();
    // animalPtr->speak();

    // Dog dogi("Lassie", White, "Andy");
    // Mammal *aniPtr = &dogi ;
    // Mammal &aniRef = dogi ;
    // Mammal aniVal = dogi ;
    // aniPtr->speak() ;
    // aniRef.speak() ;
    // // determined during compilation
    // aniVal.speak() ;
    Dog d;
    
    return 0;
}