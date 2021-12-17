#include "Student.h"
#include "iostream"
using namespace std;

Student::Student() {
	cout << "Student constuct"<< endl;
	Student::age = 0;
	Student::name = 'a';
};
Student::Student(int age) {
	Student::age = age;
	Student::name = 'b';
};

Student::Student(int a,char b) {
	age = a;
	name = b;
};
Student::~Student() {
	cout << "Student destruct"<<endl;
};
void Student::setAge(int age) {
	Student::age = age;
};
void Student::setName(char name) {
	Student::name = name;
};
int Student::getAge() {
	return age;
};
char Student::getName() {
	return name;
};
void Student::printStudent() {
	cout << "age value :" << age << "\nname value:" << name << endl;
};


static void shows() {
	cout << "shows method" << endl;
}
void Student::print() {
	shows();
	cout << "static method" << endl;
};
