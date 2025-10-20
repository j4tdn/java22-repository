'use strict';

console.log('--- Data Structure ---');

console.log('**********************');

pTest = '123';

console.log('pTest T0 --> ' + pTest);

var pTest = 2025; // auto move to the header part
console.log('pTest T1 --> ' + pTest);
console.log('pTest T1(runtime) --> ' + (typeof pTest));


console.log('**********************');

pTest = 'Happy New Year';
console.log('pTest T2 --> ' + pTest);
console.log('pTest T2(runtime) --> ' + (typeof pTest));


console.log('**********************');

pTest = true;
console.log('pTest T3 --> ' + pTest);
console.log('pTest T3(runtime) --> ' + (typeof pTest));


console.log('**********************');

pTest = null;
console.log('pTest T4 --> ' + pTest);
console.log('pTest T4(runtime) --> ' + (typeof pTest));

console.log('**********************');

pTest = new Date();
console.log('pTest T5 --> ' + pTest);
console.log('pTest T5(runtime) --> ' + (typeof pTest));


/* === Custom Object Type === */

console.log('**********************');

/* === Anonymous Class === */
pTest = {
	id: 2809,
	name: 'Item 28'	,
	salesPrice: 145,

	toString: function() {
		return this.id + ', ' + this.name + ', ' + this.salesPrice;
	}
};

pTest.salesPrice = 288;

console.log('pTest T6 --> ' + pTest);
console.log('pTest T6(runtime) --> ' + (typeof pTest));

class Item {
	
	/* attributes */
	id;
	name;
	salesPrice;

	/* constructor */
	constructor(id, name, salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	toString() {
		return 'Item[' + this.id + ', ' + this.name + ', ' + this.salesPrice + ']';
	}

}

pTest = new Item(1, 'Item A1', 11);
console.log('pTest T7 --> ' + pTest);

pTest = new Item(2, 'Item A2', 12);
console.log('pTest T7 --> ' + pTest);

pTest = new Item(3, 'Item A3', 13);
console.log('pTest T7 --> ' + pTest);

console.log('pTest T7(runtime) --> ' + (typeof pTest));

console.log('**********************');

/* Everything is object */

pTest = function(a, b) {
	return a * b;
}

console.log('pTest T8(a * b) --> ' + pTest(2, 4));
console.log('pTest T8(runtime) --> ' + (typeof pTest));