#include "AnimalClass.h"
#include "sub_animal.h"
#include <bits/stdc++.h>
using namespace std;

int main() {

  Mammal **mammals = new Mammal *[3];
  mammals[0] = new Dog("John", Black);
  mammals[1] = new Cat("Amiya", White);
  mammals[2] = new Lion("Strong", Brown);

  int choice = 0;

  do {
    cout << "Select the animal to send to the zoo:\n "
         << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit: ";

    cin >> choice;

    switch (choice) {
    case 1:
      mammals[0]->eat();
      mammals[0]->move();
      mammals[0]->speak();
      break;

    case 2:
      mammals[1]->eat();
      mammals[1]->move();
      mammals[1]->speak();
      break;

    case 3:
      mammals[2]->eat();
      mammals[2]->move();
      mammals[2]->speak();
      break;

    case 4:
      for (int i = 0; i < 3; i++) {
        mammals[i]->eat();
        mammals[i]->move();
        mammals[i]->speak();
      }
      break;

    case 5:
      break;
    }

  } while (choice >= 1 && choice <= 4);

  return 0;
}
