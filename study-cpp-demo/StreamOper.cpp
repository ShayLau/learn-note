#include "StreamOper.h"

ostream& operator<<(ostream& out, StreamOper *s) {
	out << "operator output" << endl;
	out << "age:" << s->age << endl;
	out << "name:" <<s->name << endl;
	return out;
}

istream& operator>> (istream&in, StreamOper *s) {
	cout << "operator in age:" << s->age << endl;
	cout << "operator in name:" << s->name << endl;
	in >> s->age;
	in >> s->name;
	return in;
}
