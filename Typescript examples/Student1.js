"use strict";
exports.__esModule = true;
exports.Student1 = void 0;
var Student1 = /** @class */ (function () {
    function Student1(i, n, c) {
        this.stuID = 123;
        this.stuName = "Rishabh";
        this.stuClass = 10;
        this.stuID = i;
        this.stuName = n;
        this.stuClass = c;
    }
    Student1.prototype.display = function () {
        console.log(this.stuID);
        console.log(this.stuName);
        console.log(this.stuClass);
    };
    return Student1;
}());
exports.Student1 = Student1;
var e1 = new Student1(124, "Rahul", 8);
e1.display();
