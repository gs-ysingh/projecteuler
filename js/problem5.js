// Using pure math: 2^4*3^2*5*11*13*17*19;
function smallestMultiple(n) {
	let result = 1;
	for(let i = 2; i <= n; i++) {
		result = getLCM(result, i);
	}
	return result;
}

function getGCD(a, b) {
	if(b === 0) {
		return a;
	}
	return getGCD(b, a % b);
}

function getLCM(a, b) {
	return a * b / getGCD(a, b);
}

console.log(smallestMultiple(20));