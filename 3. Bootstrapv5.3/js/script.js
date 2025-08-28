const wdwLabe1 = document.querySelector('.wdwidth');

window.onload = function() {
	wdwLabe1.textContent = window.innerWidth;
}

window.onresize = function() {
	wdwLabe1.textContent = window.innerWidth;
}