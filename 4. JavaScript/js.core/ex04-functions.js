// 1st: function constructor
var sum = new Function('a', 'b', 'return a + b');
console.log(`sum --> ${sum(5, 7)}`);




// 2nd: function declaration
function sub(a, b) {
	return a - b;
}
console.log(`sub --> ${sub(7, 5)}`);




// 3rd: function expression(anonymous)
let mul = function(a, b) {
	return a * b;
}
console.log(`mul --> ${mul(7, 5)}`);




// 4th: function expression(naming)
let div = function func(a, b) {
	return a / b;
}
console.log(`div --> ${div(10, 2)}`);
// console.log(`func --> ${func(10, 2)}`); func is not defined




// 5th: function arrow
let sRect = (a, b) => {
	return a * b;
}
console.log(`sRect --> ${sRect(10, 2)}`);



// 6th: method
let item = {
	id: 2809,
	name: 'Item 28'	,
	salesPrice: 145,

	export: function() {
		return 'export --> ' + this.id + ', ' + this.name + ', ' + this.salesPrice;
	},

	log() {
		return 'log --> ' + this.id + ', ' + this.name + ', ' + this.salesPrice;
	}
};
console.log('item#export --> ' + item.export());
console.log('item#log --> ' + item.log());



// 7th: function nested
function test(number) {
	
	// nested
	function isEven(nb) {
		return nb % 2 === 0;
	}

	function log(text) {
		console.log('test#log --> ' + text);
	}

	let result = isEven(number) ? 'even' : 'odd';

	return log(number + ' is ' + result);
}	
test(7);

// 8th: iffe (immediate invoked function expression)
(function (a, b) {
	console.log('[iffe] ==> a + b = ' + (a + b));
})(12, 24);

let result = ((a, b) => a + b)(12, 24);
console.log('[iffe] ==> result = ' + result);


// 9th: callback function
function filter(elements, testFunc) {
	let target = [];
	for (let element of elements) {
		if (testFunc(element)) {
			target.push(element);
		}
	}
	return target;
}

let digits = [1, 2, 3 , 4, 5];
let evenNumbers = filter(digits, digit => digit % 2 === 0);
console.log('evenNumbers: ' + evenNumbers);

// available callback function: setTimeout & setInterval
let running = 0;
setTimeout(function() {
	console.log("Timeout " + running);
	running++;
}, 2000);

let runningInterval = setInterval(function() {
	console.log("Interval " + running);
	if (running === 10) {
		clearInterval(runningInterval);
	}
	running++;
}, 2000);



