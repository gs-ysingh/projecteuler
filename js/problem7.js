// Not working solution
function getAllPrimes(limit) {
	let primeArr = new Array(limit + 1).fill(true);
	primeArr[0] = false;
	primeArr[1] = false;
	
	for(let i = 2; i <= limit; i++) {
		if (primeArr[i]) {
			for(let j = i * i; j <= limit; j = j + i) {
				primeArr[j] = false;
			}
		}
	}
	
	return primeArr
		.map((value, index) => value ? index : value)
		.filter(value => !!value);
}

let values = getAllPrimes(1000000);
console.log(values[10000]);