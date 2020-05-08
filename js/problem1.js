function getSum() {
	return sumDivisibleBy(3, 999) + sumDivisibleBy(5, 999) - sumDivisibleBy(15, 999);
}

function sumDivisibleBy(n, range) {
	const limit = Math.floor(range / n);
	return n * limit * (limit + 1) / 2;
}

console.log(getSum());