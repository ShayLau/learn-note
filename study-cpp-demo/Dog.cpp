#include "Dog.h"
#include <iostream>
using namespace std;
Dog::Dog() {

}

Dog::Dog(int color) {
	this->color = color;
	cout << "color:"<<this-> color << endl;
}