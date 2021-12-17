#include "CalculateNumber.h"
#include "iostream"
using namespace std;

CalculateNumber::CalculateNumber() {
	this->number1 = 0;
	this->number2 = 0;
	this->number3 = 0;
};
CalculateNumber::CalculateNumber(int number1) {
	this->number1 = number1;
	this->number2 = 0;
	this->number3 = 0;
}


CalculateNumber::CalculateNumber(int number1, int number2) {
	this->number1 = number1;
	this->number2 = number2;
	this->number3 = 0;
}


CalculateNumber::CalculateNumber(int number1, int number2,int number3) {
	this->number1 = number1;
	this->number2 = number2;
	this->number3 = number3;
}


CalculateNumber& CalculateNumber::operator+(CalculateNumber& var) {
	this->number1 += var.number1;
	this->number2 += var.number2;
	print(*this);
	return *this;
};

CalculateNumber& CalculateNumber::operator-(CalculateNumber& var) {
	this->number1-= var.number1;
	this->number2-= var.number2;
	print(*this);
	return *this;
};
CalculateNumber& CalculateNumber::operator*(CalculateNumber& var) {
	this->number1 *= var.number1;
	this->number2 *= var.number2;
	print(*this);
	return *this;
};
CalculateNumber& CalculateNumber::operator/(CalculateNumber& var) {
	this->number1 /= var.number1;
	this->number2 /= var.number2;
	print(*this);
	return *this;
};

CalculateNumber& operator%(CalculateNumber& var1, CalculateNumber& var2) {
	int val = var1.number3 % var2.number3;
	CalculateNumber *c = new CalculateNumber(0,0,val);
	c->print(*c);
	return *c;
};

void  CalculateNumber::print(CalculateNumber& c) {
	cout<< "" << c.number1 << ":" << number2 << ":" << number3 << endl;
}

int  CalculateNumber::getNumber3() {
	return this->number3;
}

void CalculateNumber::setNumber3(int number) {
	this->number3 = number;
}