#pragma once
#include<iostream>
using namespace std;


class StreamOper
{
public:
	int age;
	char *name;	

	friend ostream& operator<<(ostream&out,StreamOper  *s);

	friend istream& operator>>(istream &in,StreamOper *s);
};

