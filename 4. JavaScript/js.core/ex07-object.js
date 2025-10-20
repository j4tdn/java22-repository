// using json
let anonymousJsonObject = {
	id: 125846,
	name: 'Teo Le',
	dateOfBirth: new Date(123456),
	
	toString: function() {
		console.log(`AnonymousJsonObject: toString(${this.id}, ${this.name}, ${this.dateOfBirth})`);
	}
}

anonymousJsonObject.toString();

// using function
function Item(id, name, amountOfItems) {
	this.id = id;
	this.name = name;
	this.amountOfItems = amountOfItems;

	this.toString = function() {
		console.log(`Item: toString(${this.id}, ${this.name}, ${this.amountOfItems})`);
	}
}

let item1 = new Item(101, 'Item 101', 1001);
item1.toString();


// using class
class Store {
	#id;

	constructor(id, name) {
		this.#id = id;
		this.name = name;
	}

	toString() {
		console.log(`Store: toString(${this.#id}, ${this.name})`);
	}
}

let s1 = new Store(1, 'Store 101');
let s2 = new Store(1, 'Store 102');

s1.toString();
s2.toString();