function getEvenFiboSum(n) {
	let a = 2;
	let b = 8;
	let sum = a + b;
	let c = 4 * b + a;
	while(c < n) {
		sum = sum + c;
		a = b;
		b = c;
		c = 4 * b + a;
	}
	return sum;
}

console.log(getEvenFiboSum(4000000));