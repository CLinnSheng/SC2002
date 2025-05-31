#include <bits/stdc++.h>
using namespace std;

class A {
    protected :
        int a,b;

    public :
        A(int x = 0, int y = 0) {
            a = x;
            b = y;
        }
        
        int getA() const{
            return a;
        }
        
        int getB() const{
            return b;
        }
        
        virtual void print();
};

class B: public A {

    private:
        float p,q ;

    public :
        B(int m, int n, float u, float v) {
            p = u;
            q = v;
        }

        B() {
            p = q = 0 ;
        }

        void input(float u, float v) ;

        void print() ;
};

void A::print(void) {
    cout << "A values: " << a << " " << b << "\n" ;
}

void B::print() {
    cout << "B values : " << p << " " << q << "\n" ;
}

void B::input(float x, float y) {
    p = x ; q = y ;
}

int doubleIt(A a) {
    return a.getA() * a.getA() ;
}

A operator+(const A &p1, const A &p2) {
    return A(p1.getA() + p2.getA(), p1.getB() + p2.getB());
}

int main() {

    A a1(10,20), *ptr ;
    B b1;

    b1.input(7.5, 3.142) ;

    ptr = &a1 ;
    ptr->print() ;
    ptr = &b1;
    ptr->print() ;
    A a2(20, 30);
    A ans = a1 + a2;
    
    ans.print();
}
