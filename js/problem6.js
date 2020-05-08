function getDiff(n) {
	return Math.pow(((n * (n + 1)) / 2), 2) - (n*(n + 1)*(2*n + 1) / 6);
}

console.log(getDiff(100))