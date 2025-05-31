#include <bits/stdc++.h>
using namespace std;

class bubble {
  
    int *arr, size;
    
    public:
        bubble(int n) {
            arr = new int[n];
            size = n;
        }
        
        void addElement(int index, int val) {
            arr[index] = val;
        } 
        
        void print() {
            
            for (int i = 0; i < size; i++)
                cout << arr[i] << " ";
                
            cout << endl;
            
        }

        void sort() {
            
            int i, j, t;
            
            for (i = size - 2; i >= 0; i--)
                for (j = 0; j <= i; j++)
                    if (arr[j] > arr[j + 1]) {
                        t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }
                    
        }
        
        ~bubble() {
            delete [] arr;
        }
};

int main() {
    
    int n, temp;
    
    cout << "\n\n Enter number of Integer elements to be sorted: ";
    cin >> n;
    
    bubble b(n);
    
    for (int i= 0; i < n; i++) {
        cout << "\n\n Enter integer value for element no." << i + 1 << " : ";
        cin >> temp;
        b.addElement(i, temp);
    }
    
    b.sort();
    
    cout << "\n\n Finally sorted array is: ";
    b.print();
    
    return 0;
}