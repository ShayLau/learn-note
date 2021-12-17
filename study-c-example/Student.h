#pragma once
class Student
{
public:
	int age;
	char name;
	Student();
	Student(int age);
	Student(int a, char b);
	~Student();
	void setAge(int age);
	void setName(char name);
	int  getAge();
	char getName();
	void printStudent();
	static void print();
};

