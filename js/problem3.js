function largestPrimeFactor(n) {
	let i = 2;
	let newNum = n;
	while(i * i <= newNum) {
		if(newNum % i === 0) {
			newNum = Math.floor(newNum / i);
		}
		else {
			i++;
		}
	}
	return newNum;
}

console.log(largestPrimeFactor(600851475143));



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

function largestPrimeFactorSieve(n) {
	let limit = Math.floor(Math.sqrt(n));
	let primes = getAllPrimes(limit);
	let result = 0;
	for(let k = primes.length - 1; k > 0; k--) {
		if(n % k === 0) {
			result = k;
			break;
		}
	}
	return result;
}

console.log(largestPrimeFactorSieve(600851475143));