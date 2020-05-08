function getFactorial(n) {
	let result = BigInt(1);
	let num = BigInt(n);
	while(num > 0n) {
		result = result * num;
		num = num - 1n;
	}
	return result;
}

function getSum(n) {
	let str = n.toString();
	let sum = 0;
	for(let i = 0; i < str.length; i++) {
		sum = sum + parseInt(str.charAt(i));
	}
	return sum;
}

console.log(getSum(getFactorial(100)));