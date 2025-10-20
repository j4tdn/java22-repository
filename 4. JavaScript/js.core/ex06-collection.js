Array.prototype.add = function(index, newValue) {
	this.splice(index, 0, newValue);
}

let words = ['A', 'B', 'C', 'D', 'E'];

words.unshift('A1');
words.push('W9');
words.splice(3, 0, 'M', 'N');

words.add(5, 'K');

console.log(words);