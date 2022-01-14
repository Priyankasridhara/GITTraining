"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(i, n, m) {
        this.stuID = 123;
        this.stuName = "Rishabh";
        this.stuMarks = 256;
        this.stuID = i;
        this.stuName = n;
        this.stuMarks = m;
    }
    Student.prototype.display = function () {
        console.log(this.stuID);
        console.log(this.stuName);
        console.log(this.stuMarks);
    };
    return Student;
}());
exports.Student = Student;
var e1 = new Student(124, "Rahul", 345);
e1.display();
