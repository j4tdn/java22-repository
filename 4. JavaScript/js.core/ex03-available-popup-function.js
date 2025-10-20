'use strict';

console.log('--- Available Popup Functions ---');

console.log('**********************');

alert('Hello USER, Tests whether are You a BOT before redirect to K22 GitHub Page');

const min = 5;
const max = 20;

let fullname = prompt('Enter your name ?');

if (!!fullname) {
	let a = random(min, max);
	let b = random(min, max);

	let expected = +prompt(`Hey ${fullname}, submic result of ${a} + ${b} = ?`);
	let actual = a + b;

	if (expected === actual) {
		if (confirm('Click YES to entering the page')) {
			window.location.href = 'https://github.com/j4tdn/java22-repository';
		}
	} else {
		alert('Incorrect result ...');
	}
}

function random(startIncl, endExcl) {
	return Math.floor(startIncl + Math.random() * (endExcl - startIncl));
}
