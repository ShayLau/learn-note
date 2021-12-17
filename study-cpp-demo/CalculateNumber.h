#pragma once
class CalculateNumber
{
public:
	int number1;
	int number2;

	CalculateNumber();

	CalculateNumber(int number1);

	CalculateNumber(int number1, int number2);

	CalculateNumber(int number1, int number2, int number3);

	CalculateNumber& operator+(CalculateNumber  &var);

	CalculateNumber& operator-(CalculateNumber& var);

	CalculateNumber& operator*(CalculateNumber& var);

	CalculateNumber& operator/(CalculateNumber& var);

	friend CalculateNumber& operator%(CalculateNumber& var1, CalculateNumber& var2);
	
	void print(CalculateNumber& c);

	int getNumber3();

	void setNumber3(int number);
private:
	int number3;
};

