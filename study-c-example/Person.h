#pragma once
#include"Student.h"
class Person
{
public:
	Person();
	Person(Student &stu);
	~Person();
	void printPerson();
	Student getstudent();
	void show()const;
private:
	Student stu;
};

