var proArry = [
    { price: "100", product: "Mobile" },
    { price: "200", product: "Laptop" },
    { price: "300", product: "Mic" },
    { price: "400", product: "PC" }
];
//map example
var newPro = proArry.map(function (value) {
    return value.price;
});
console.log(newPro);
//with Arrow function
var newPro1 = proArry.map(function (value) { return value.price; });
console.log(newPro1);
//filter example
var filterEx = proArry.filter(function (value) {
    if (value.price < 300) {
        return true;
    }
});
console.log(filterEx);
//with arrow function
var arrowValue = proArry.filter(function (value) { return value.price > 300; });
console.log(arrowValue);
//sort example
var sortProduct = proArry.sort(function (a, b) { return (a.product > b.product ? 1 : -1); });
console.log(sortProduct);
var data = [];
var sum = data.reduce(function (acc, val) {
}, 0);
console.log(sum);
