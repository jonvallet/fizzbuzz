var s = "";
for (var i = 1; i <= 100; i++) {
	if (i % 15 == 0) {
		s += "FIZZBUZZ ";
	} else if (i % 3 == 0) {
		s += "FIZZ ";
	} else if (i % 5 == 0) {
		s += "BUZZ ";
	} else {
		s += i + " ";
	} 
}
console.log(s);
