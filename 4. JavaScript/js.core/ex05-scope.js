/*
	var: function scope
	let, const(final): block scope
*/

(() => {
	{
		var v1 = 'v1';
		var v2 = 'v2';

		let l1 = 'l1';
		let l2 = 'l2';

		console.log('inner block v1: ' + v1);
		console.log('inner block v2: ' + v2);

		console.log('inner block l1: ' + l1);
		console.log('inner block l2: ' + l2);
	}

	console.log('outer block v1: ' + v1);
	console.log('outer block v2: ' + v2);

	// console.log('outer block l1: ' + l1);
	// console.log('outer block l2: ' + l2);
})();

/*
  hoisting: use 'var variables', 'function declaration' before declaring
  C: move declaration to header before create the implementation
*/

console.log('sum --> ' + sum(1, 2));
function sum(a, b) {
	return a + b;
}

console.log('text --> ' + text)
var text = 'text text 123';
