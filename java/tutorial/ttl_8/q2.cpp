#include <bits/stdc++.h>
using namespace std;

class Polygon {
    
    public:
        enum KindofPolygon {POLY_PLAIN, POLY_RECT, POLY_TRIANG};   
        
    protected:
        string name;
        float width;
        float height;
        KindofPolygon polytype;
        
    public:
        Polygon(string theName, float theWidth, float theHeight) : name(theName), width(theWidth), height(theHeight), polytype(POLY_PLAIN) {}
        
        KindofPolygon getPolytype() const{
            return polytype;
        }
        
        void setPolytype(KindofPolygon value) {
            polytype = value;
        }
        
        string getName() const{
            return name;
        }
        
        virtual float calArea() = 0;
        
        void printWidthHeight() const{
            cout << "Width = " << width << " Height = " << height << endl;
        }
        
};

class Triangle : public Polygon {
    
    public:
        Triangle(float width, float height) : Polygon("Triangle", width, height) {
            polytype = POLY_TRIANG;
        }
        
        float calArea() {
            return 0.5 * width * height;
        }
        
};

class Rectangle : public Polygon {
   
    public:
        Rectangle(float width, float height) : Polygon("Rectangle", width, height) {
            polytype = POLY_RECT;
        }
        
        float calArea() {
            return width * height;
        }
        
};

void printArea(Triangle *t) {
    cout << "Area: " << t->calArea() << endl;
}

void printArea(Rectangle *r) {
    cout << "Area: " << r->calArea() << endl;
}

void printArea(Polygon *p) {
    cout << "Area: " << p->calArea() << endl;
}

int main() {
 
    Rectangle *r = new Rectangle(5, 10);
    Triangle *t = new Triangle(1, 3);
    
    // Static Binding
    printArea(r); printArea(t);
    
    Polygon *p1 = new Rectangle(5, 10);
    Polygon *p2 = new Triangle(1, 3);
    printArea(p1); printArea(p2);


    
}