#include <bits/stdc++.h>
using namespace std;

class Parent {

    public:
        virtual void print() {
            cout << "Parent" << endl;
        }

        void print_no_virtual()
        {
            cout << "Call from parent print_no_vir()" << std::endl;
        }

        // got pure virtual function will make the class abstract
        // dont have to implement & cannot be instantiated
        // virtual void v_method() = 0;

};

class child : public Parent {

    public:
        void print() {
            cout << "child" << endl;
        }

        void print_no_virtual()
        {
            cout << "Call from child print_no_vir()" << std::endl;
        }

        void special_print() {
            cout << "special_child" << endl;
        }

        // void v_method()
        // {
        //     return;
        // }
};

int main() {

    Parent *p = new child();
    Parent _p;

    // polymorphism and print the function in child (because is a virtual function)
    _p.print();
    p->print();

    _p.print_no_virtual();
    p->print_no_virtual();
    // p->special_print();
}