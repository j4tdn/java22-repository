const wdwLabel = document.querySelector('.wdwidth');

window.onload = function() {
	wdwLabel.textContent = window.innerWidth;
}

window.onresize = function() {
	wdwLabel.textContent = window.innerWidth;
}